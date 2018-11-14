/**
 * 
 */
package com.zzq.rabbitmq.util;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * 链接工具类
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年9月30日 下午2:28:07
 */
public class ConnectionUtils {

    /**
     * 获取链接
     * 
     * @return
     * @throws IOException
     * @throws TimeoutException
     */
    public static Connection getConnection() throws IOException, TimeoutException {

        // 创建链接工厂
        ConnectionFactory factory = new ConnectionFactory();
        // 设置host
        factory.setHost("127.0.0.1");
        // 设置端口
        factory.setPort(5672);
        // 设置vhost
        factory.setVirtualHost("/vhost_zzq");
        // 设置用户名
        factory.setUsername("user_zzq");
        // 设置密码
        factory.setPassword("123");

        return factory.newConnection();
    }
}
