/**
 * 
 */
package com.zzq.rabbitmq.routing;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.zzq.rabbitmq.util.ConnectionUtils;

/**
 * 消息发送类
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年9月30日 下午3:36:28
 */
public class Send {
    // 交换机名称
    private static final String EXCHANGE_NAME = "test_exchange_direct";

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {

        // 获取链接
        Connection connection = ConnectionUtils.getConnection();
        // 创建通道
        Channel channel = connection.createChannel();
        // 交换机声明
        channel.exchangeDeclare(EXCHANGE_NAME, "direct");// 直接路由

        String msg = "hello direct!";
        String routingKey = "error";
        channel.basicPublish(EXCHANGE_NAME, routingKey, null, msg.getBytes());
        System.out.println("direct send msg: " + msg);

        channel.close();
        connection.close();
    }
}
