package com.ttbank.flep.core.entity;

import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * @Author lucky
 * @Date 2022/3/1 17:22
 */
@Slf4j
public class ConcurrentUploadThread implements Runnable {
    private final CountDownLatch startSignal;

    public ConcurrentUploadThread(CountDownLatch startSignal){
        this.startSignal=startSignal;
    }

    @Override
    public void run() {
        startSignal.countDown();
        log.info(Thread.currentThread().getName()+",prepare at:"+System.currentTimeMillis());
        try {
            startSignal.await();
            doTask();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doTask() {
        try {
            Random random=new Random();
            int temp = random.nextInt(500);
            Thread.sleep(2000+temp);
            log.info(Thread.currentThread().getName()+"...............");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
