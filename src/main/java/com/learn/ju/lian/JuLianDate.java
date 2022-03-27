package com.learn.ju.lian;

import com.learn.helper.DateHelper;

import java.util.Date;

public class JuLianDate {

    public static void main(String[] args) {
        rrn();
    }

    public static void rrn() {
        String dateForYYYYMMDD = DateHelper.getDateForYYYYMMDD();
        String year = dateForYYYYMMDD.substring(3, 4);
        Date date = new Date();
        int value = DateHelper.dateToJuLian(date);
        String juLian = String.valueOf(value);
        String dateForMMDDHHss = DateHelper.getDateForMMDDHHss();
        String rrn = year + juLian.substring(3) + dateForMMDDHHss.substring(4, 6);
        System.out.println(rrn);
    }

}