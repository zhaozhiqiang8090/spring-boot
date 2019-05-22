package com.zzq.basic.java.threadlocal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SyncDateUtil {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String format(Object date) {
        synchronized (sdf) {
            return sdf.format(date);
        }
    }

    public static Date parse(String strDate) throws ParseException {
        synchronized (sdf) {
            return sdf.parse(strDate);
        }
    }
}
