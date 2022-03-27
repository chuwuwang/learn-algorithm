package com.learn.helper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateHelper {

    public static String getDateForMMDDHHss() {
        Locale locale = Locale.getDefault();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHss", locale);
        return simpleDateFormat.format(date);
    }

    public static String getDateForYYYYMMDD() {
        Locale locale = Locale.getDefault();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        return simpleDateFormat.format(date);
    }

    /**
     * JDE使用的是Julian日期, 其格式是6位的整数
     * 第一位是世纪, 1代表21世纪, 0代表20世纪
     * 第二和第三位是年, 比如 1997年是97
     * 剩下三位是一年中的第几天
     * 比如 2007年的第 123天的6位日期数是107123
     */
    public static int dateToJuLian(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR) - 1900;
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        return year * 1000 + dayOfYear;
    }

    public static Date juLianToDate(int date) {
        int year = (date / 1000) + 1900;
        int dayOfYear = date % 1000;
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_YEAR, dayOfYear);
        return calendar.getTime();
    }

}
