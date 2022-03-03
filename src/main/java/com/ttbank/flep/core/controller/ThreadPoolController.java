package com.ttbank.flep.core.controller;

import com.ttbank.flep.core.entity.ConcurrentUploadThread;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author lucky
 * @Date 2022/3/1 16:48
 */
@Slf4j
@RestController
@RequestMapping("/testThreadPool")
public class ThreadPoolController {
    private static final int CORE_POOL_SIZE=500;
    private static final int MAX_POOL_SIZE=600;
    private static final int QUEUE_CAPACITY=600;
    private static final Long KEEP_ALIVE_TIME=1L;

    @PostMapping("/uploadFileInner")
    public void uploadFileInner(@RequestParam int threadNum){
        //01 使用ThreadPoolExecutor创建线程池
        ThreadPoolExecutor executor=new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS, new ArrayBlockingQueue<>(QUEUE_CAPACITY));

        //02 创建指定threadNum个数的线程，利用CountDownLatch模拟并发
        final CountDownLatch start=new CountDownLatch(threadNum);
        for (int i = 0; i <threadNum ; i++) {
            ConcurrentUploadThread concurrentUploadThread=new ConcurrentUploadThread(start);
            executor.execute(concurrentUploadThread);
        }
        //03 关闭线程池
        executor.shutdown();
        log.info("hello");
        log.info("hello");
        log.info("hello");
        log.info("hello");
        log.info("hello20220303");
    }
}
