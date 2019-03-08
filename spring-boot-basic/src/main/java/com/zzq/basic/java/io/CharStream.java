package com.zzq.basic.java.io;

import org.springframework.util.StringUtils;

import java.io.*;

public class CharStream {

    public boolean handleFile(String sPath, String dPath) {
        if (StringUtils.isEmpty(sPath) || StringUtils.isEmpty(dPath)) {
            System.out.println("文件路径为空！");
            return false;
        }

        Reader reader;
        BufferedReader bufferedReader = null;
        Writer writer;
        BufferedWriter bufferedWriter = null;
        try {
            reader = new FileReader(sPath);
            bufferedReader = new BufferedReader(reader);

            writer = new FileWriter(dPath);
            bufferedWriter = new BufferedWriter(writer);

            String valueString = null;
            while ((valueString = bufferedReader.readLine()) != null){
                bufferedWriter.write(valueString);
            }

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return false;
    }
}
