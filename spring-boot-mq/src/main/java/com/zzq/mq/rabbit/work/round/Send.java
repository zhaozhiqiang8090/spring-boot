/**
 * 
 */
package com.zzq.mq.rabbit.work.round;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.zzq.mq.rabbit.util.ConnectionUtils;

/**
 * 消息发送类
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年9月30日 下午3:36:28
 */
public class Send {
    // 队列名称
    private static final String QUEUE_NAME = "test_work_queue";

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {

        // 获取链接
        Connection connection = ConnectionUtils.getConnection();
        // 创建通道
        Channel channel = connection.createChannel();
        // 队列声明
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        for (int i = 0; i < 50; i++) {
            String msg = "hello work round-robin " + i;
            channel.basicPublish("", QUEUE_NAME, null, msg.getBytes());
            System.out.println("work send msg: " + msg);
            Thread.sleep(i * 20);
        }

        channel.close();
        connection.close();
    }
}
