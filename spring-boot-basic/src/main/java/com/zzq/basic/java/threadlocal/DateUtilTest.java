package com.zzq.basic.java.threadlocal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DateUtilTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<String> dateStrList = new ArrayList<>();
        dateStrList.add("2018-04-01 10:00:01");
        dateStrList.add("2018-04-02 10:00:01");
        dateStrList.add("2018-04-03 10:00:01");
        dateStrList.add("2018-04-04 10:00:01");
        dateStrList.add("2018-04-05 10:00:01");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        for (String str : dateStrList) {
            executorService.execute(() -> {
                try {
                    simpleDateFormat.parse(str);
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
