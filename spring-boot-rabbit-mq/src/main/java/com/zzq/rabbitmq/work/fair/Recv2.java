/**
 * 
 */
package com.zzq.rabbitmq.work.fair;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import com.zzq.rabbitmq.util.ConnectionUtils;

/**
 * 消息接受类
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年9月30日 下午2:53:28
 */
public class Recv2 {

    // 队列名称
    private static final String QUEUE_NAME = "test_work_queue";

    public static void main(String[] args) throws IOException, TimeoutException {

        // 获取链接
        Connection connection = ConnectionUtils.getConnection();
        // 创建通道
        final Channel channel = connection.createChannel();
        // 队列声明
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        // 收到消费者确认之前不发送下一个消息，同一个消费者每次发送不超过1
        int prefetchCount = 1;
        channel.basicQos(prefetchCount);

        // 定义消费者
        Consumer consumer = new DefaultConsumer(channel) {
            // 处理到达消息
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String msg = new String(body, "utf-8");
                System.out.println("work[2] recv msg: " + msg);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("work[2] done!");
                    // 手动回执
                    channel.basicAck(envelope.getDeliveryTag(), false);
                }
            }
        };

        // 监听队列
        boolean autoAck = false;// 自动应答
        channel.basicConsume(QUEUE_NAME, autoAck, consumer);
    }

}
