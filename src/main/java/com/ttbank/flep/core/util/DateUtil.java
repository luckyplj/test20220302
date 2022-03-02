package com.ttbank.flep.core.util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author lucky
 * @Date 2022/2/23 11:40
 */
public class DateUtil {
    /**
     * 获取前days天的日期
     * @param days
     * @return
     */
    public static LocalDateTime getMinusDays(int days){
        LocalDateTime now =LocalDateTime.now();
        LocalDateTime minusDays = now.minusDays(days);
        return minusDays;
    }

    /**
     * 获取指定日期的最小时间
     * @param localDateTime
     * @return
     */
    public static String getStartTimeOfDay(LocalDateTime localDateTime){
        LocalDateTime minusTimeEnd = LocalDateTime.of(localDateTime.toLocalDate(), LocalTime.MIN);
        return minusTimeEnd.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    /**
     * 获取指定日期的最大时间
     * @param localDateTime
     * @return
     */
    public static String getEndTimeOfDay(LocalDateTime localDateTime){
        LocalDateTime minusTimeEnd = LocalDateTime.of(localDateTime.toLocalDate(), LocalTime.MAX);
        return minusTimeEnd.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    /**
     * 获取日期
     * @param localDateTime
     * @return
     */
    public static String getDate(LocalDateTime localDateTime){
        return localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }


    public static String getDateByFormatter(LocalDateTime localDateTime,String formatter){
        return localDateTime.format(DateTimeFormatter.ofPattern(formatter));
    }

    public static void main1(String[] args) {
//        LocalDateTime now = LocalDateTime.now();
//        String startTime = DateUtil.getStartTimeOfDay(now);
//        String endTime= DateUtil.getEndTimeOfDay(now);
//        System.out.println(endTime);
//        long time = System.currentTimeMillis();
//        Date date = new Date();
//        date.setTime(time);
//        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        //Calendar在月份上的常数值从Calendar.JANUARY开始是0，到Calendar.DECEMBER的11，所以如果想要显示传回值的真正意涵，可以如下撰写：
        //String[] months = {"一月", "二月", "三月", "四月","五月", "六月", "七月", "八月","九月", "十月", "十一月", "十二月"};
        int month=calendar.get(Calendar.MONTH)+1;
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        // 获取时
        int hour = calendar.get(Calendar.HOUR);
        // int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24小时表示

        // 获取分
        int minute = calendar.get(Calendar.MINUTE);

        // 获取秒
        int second = calendar.get(Calendar.SECOND);

        // 星期，英语国家星期从星期日开始计算
        int weekday = calendar.get(Calendar.DAY_OF_WEEK)-1;

        System.out.println("现在是" + year + "年" + month + "月" + day + "日" + hour
                + "时" + minute + "分" + second + "秒" + "星期" + weekday);
    }

    public static void main2(String[] args) {
        //java 1.8
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(LocalDateTime.now());
        //年
        System.out.println(ldt.getYear());
        //月(英文)1-12
        //System.out.println(ldt.getMonth());
        //月(中文)1-12
        System.out.println(ldt.getMonthValue());
        //日(以年计算)1-365
        //System.out.println(ldt.getDayOfYear());
        //日(以月计算)1-30
        System.out.println(ldt.getDayOfMonth());
        //时
        System.out.println(ldt.getHour());
        //分
        System.out.println(ldt.getMinute());
        //秒
        System.out.println(ldt.getSecond());
    }




    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2017, 7, 12, 15, 12, 12);
        //判断是否在time时间之前
        System.out.println(LocalDateTime.now().isBefore(time));
        //判断是否在time时间之后
        System.out.println(LocalDateTime.now().isAfter(time));
    }
}
