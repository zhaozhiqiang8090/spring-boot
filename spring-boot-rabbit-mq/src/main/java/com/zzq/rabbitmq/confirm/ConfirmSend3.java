/**
 * 
 */
package com.zzq.rabbitmq.confirm;

import java.io.IOException;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConfirmListener;
import com.rabbitmq.client.Connection;
import com.zzq.rabbitmq.util.ConnectionUtils;

/**
 * 消息发送类
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年10月1日 下午2:52:13
 */
public class ConfirmSend3 {

    // 队列名称
    private static final String QUEUE_NAME = "test_queue_confirm1";

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        // 获取链接
        Connection connection = ConnectionUtils.getConnection();
        // 创建通道
        Channel channel = connection.createChannel();
        // 队列声明
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        channel.confirmSelect();

        final SortedSet<Long> unConfirmSet = Collections.synchronizedSortedSet(new TreeSet<Long>());

        channel.addConfirmListener(new ConfirmListener() {

            @Override
            public void handleNack(long deliveryTag, boolean multiple) throws IOException {

            }

            @Override
            public void handleAck(long deliveryTag, boolean multiple) throws IOException {
                if (multiple) {
                    System.out.println("---handleAck multiple!");
                    unConfirmSet.headSet(deliveryTag + 1).clear();
                } else {
                    System.out.println("---handleAck single!");
                    unConfirmSet.remove(deliveryTag);
                }
            }
        });

        String msg = "hello confirm!";
        while (true) {
            channel.basicPublish("", QUEUE_NAME, null, msg.getBytes());
            Thread.sleep(100);
        }

    }

}
