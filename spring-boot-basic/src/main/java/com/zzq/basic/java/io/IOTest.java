package com.zzq.basic.java.io;

import java.io.File;

public class IOTest {

    public static void main(String[] args) {
        CharStream charStream = new CharStream();
        if (charStream.handleFile("e:" + File.separator+"123.jpg", "e:" + File.separator+"123ByCharStream.jpg")) {
            System.out.println("字符流操作字节文件成功！");
        } else {
            System.out.println("字符流操作字节文件失败！");
        }

        if (charStream.handleFile("e:" + File.separator+"123.txt", "e:" + File.separator+"123ByCharStream.txt")) {
            System.out.println("字符流操作字符文件成功！");
        } else {
            System.out.println("字符流操作字符文件失败！");
        }
    }
}
