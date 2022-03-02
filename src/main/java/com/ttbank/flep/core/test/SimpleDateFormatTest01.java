package com.ttbank.flep.core.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author lucky
 * @Date 2022/2/23 11:25
 */
public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        String createDate="20220222";
        try {
            Date beginDate = sdf.parse(createDate);
            Date endDate=getEndDate(beginDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取当前日期时间+1
     * @param beginDate
     * @return
     */
    public static Date getEndDate(Date beginDate){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(beginDate);
        calendar.add(Calendar.DATE,1);
        return calendar.getTime();
    }
}
