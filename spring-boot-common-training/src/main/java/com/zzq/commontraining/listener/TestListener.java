package com.zzq.commontraining.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("web容器测试监听器已启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
