/**
 * 
 */
package com.zzq.basic.java.compress;

import org.apache.tomcat.util.codec.binary.Base64;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 压缩工具类
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年8月16日 上午11:17:16
 */
public class ZipUtil {

    public static boolean zipFileFromBase64(String fileName, String sourceBase64, ZipOutputStream zipOutputSteam) {
        boolean isOk = false;
        byte[] inputBytes = Base64.decodeBase64(sourceBase64);
        ZipEntry zipEntry = new ZipEntry(fileName);
        try {
            zipOutputSteam.putNextEntry(zipEntry);
            zipOutputSteam.write(inputBytes);
            zipOutputSteam.closeEntry();
            isOk = true;
        } catch (IOException e) {
            System.out.println("zipFileFromBase64 error!" + e);
        }

        return isOk;
    }

    public static boolean zipFiles() {
        boolean isOk = false;
        long startTime = System.currentTimeMillis();
        System.out.println("zipFiles start.");
        String fileName = "hello.txt";
        String hello = "hello world!";
        String base64String = Base64.encodeBase64String(hello.getBytes());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipOutputStream zos = new ZipOutputStream(baos);
        int i = 0;
        // 1.征信授权书
        isOk = zipFileFromBase64(fileName + i++ + ".txt", base64String, zos);
        // 2.身份证正面
        if (isOk) {
            isOk = zipFileFromBase64(fileName + i++ + ".txt", base64String, zos);
        }
        // 3.身份证反面
        if (isOk) {
            isOk = zipFileFromBase64(fileName + i++ + ".txt", base64String, zos);
        }
        // 4.face++照片
        if (isOk) {
            isOk = zipFileFromBase64(fileName + i++ + ".txt", base64String, zos);
        }
        FileOutputStream fos = null;
        try {
            zos.finish();
            zos.close();

            fos = new FileOutputStream("E:/test.zip");
            fos.write(baos.toByteArray());
            fos.close();

            baos.close();
            System.out.println("zipFiles done. Total cost: " + (System.currentTimeMillis() - startTime) + "ms");
            return isOk;
        } catch (IOException e) {
            System.out.println("zipFiles error!" + e);
            return false;
        } finally {
            if (zos != null) {
                try {
                    zos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        zipFiles();
    }

}
