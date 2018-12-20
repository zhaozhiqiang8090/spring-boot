package com.zzq.basic.java.serializable;

import java.io.*;

public class TransientTest {

    public static void main(String[] args) {
        try {
            User user = new User();
            user.setUsername("Alexia");
            user.setPasswd("123456");
            System.out.println("read before Serializable: ");
            System.out.println("username: " + user.getUsername());
            System.err.println("password: " + user.getPasswd());

            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("E:/user"));
            os.writeObject(user); // 将User对象写进文件
            os.flush();
            os.close();

            // 在反序列化之前改变username的值
//            User.username = "jmwang";
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(
                    "E:/user"));
            user = (User) is.readObject(); // 从流中读取User的数据
            is.close();

            System.out.println("\nread after Serializable: ");
            System.out.println("username: " + user.getUsername());
            System.err.println("password: " + user.getPasswd());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
