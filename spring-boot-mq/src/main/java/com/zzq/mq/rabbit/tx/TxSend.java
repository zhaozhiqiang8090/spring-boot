/**
 * 
 */
package com.zzq.mq.rabbit.tx;

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
 * @Date 2018年10月1日 下午2:52:13
 */
public class TxSend {

    // 队列名称
    private static final String QUEUE_NAME = "test_queue_tx";

    public static void main(String[] args) throws IOException, TimeoutException {
        // 获取链接
        Connection connection = ConnectionUtils.getConnection();
        // 创建通道
        Channel channel = connection.createChannel();
        // 队列声明
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        String msg = "hello tx!";
        try {
            channel.txSelect();
            channel.basicPublish("", QUEUE_NAME, null, msg.getBytes());

            int i = 1 / 0;

            System.out.println("send [tx] msg: " + msg);
            channel.txCommit();
        } catch (Exception e) {
            channel.txRollback();
            System.out.println("tx send msg txRollback");
        }

        channel.close();
        connection.close();
    }

}
