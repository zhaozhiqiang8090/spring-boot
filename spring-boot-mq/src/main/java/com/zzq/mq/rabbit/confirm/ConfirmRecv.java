/**
 * 
 */
package com.zzq.mq.rabbit.confirm;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import com.rabbitmq.client.AMQP.BasicProperties;
import com.zzq.mq.rabbit.util.ConnectionUtils;

/**
 * 消息接受类
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年10月1日 下午2:52:13
 */
public class ConfirmRecv {

    // 队列名称
    private static final String QUEUE_NAME = "test_queue_confirm1";

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        // 获取链接
        Connection connection = ConnectionUtils.getConnection();
        // 创建通道
        Channel channel = connection.createChannel();
        // 队列声明
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        channel.basicConsume(QUEUE_NAME, true, new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties, byte[] body) throws IOException {
                System.out.println("recv[confirm] msg: " + new String(body, "utf-8"));
            }
        });
    }

}
