package com.ttbank.flep.core.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.Random;

/**
 * @Author lucky
 * @Date 2021/11/24 16:20
 */
@Slf4j
public class FileOperateUtil {
    /**
     * 批量创建文件夹
     * @param folderNum 文件夹数量
     */
    public static void createFileFolder(int folderNum){
        for (int i = 0; i <folderNum ; i++) {
            String path="D:\\data\\download\\"+i;
            File file =new File(path);
            if(!file.exists()){
                try {
                    file.mkdir();
                    log.info("文件夹: "+i+"创建成功");

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }

    /**
     * 向已有的文件中追加写入
     * @param filePath 文件路径
     */
    public static void appendWriteFile(String filePath){
        File file =new File(filePath);
        try {
            //1 创建一个文件输出流,  true:表示追加，false: 默认覆盖
            FileOutputStream fos=new FileOutputStream(file,true);
            //2 模拟执行其他任务
            long startTime=System.currentTimeMillis();
            Random random=new Random();
            Thread.sleep(100+random.nextInt(200));
            long endTime=System.currentTimeMillis();
            long executionTime=endTime-startTime;
            //3 追加写入  \r\n 表示换行。
            String temp=String.valueOf(executionTime)+"\r\n";
            fos.write(temp.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 逐行读取文件中数据，并累加
     * @param filePath 文件路径
     */
    public static double calculateTotalTime(String filePath){
        double totalTime=0;
        try {
            //BufferedReader是可以按行读取文件
            FileInputStream fis=new FileInputStream(filePath);
            BufferedReader br=new BufferedReader(new InputStreamReader(fis));
            String str=null;

            while(StringUtils.isNotBlank(str=br.readLine())){
                totalTime+=Double.parseDouble(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalTime;
    }

    /**
     * 清空文件内容
     * @param filePath 文件路径
     */
    public static void cleanFile(String filePath){
        try {
            //利用FileWriter写入字符流
            FileWriter fw=new FileWriter(filePath);
            fw.write("");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        cleanFile("D:\\data\\1.txt");
    }
}
