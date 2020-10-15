package com.xiaojiaqi.jvmTools;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: liangjiaqi
 * @Date: 2020/5/30 10:27 AM
 */
public class HashMapDeadLoop {
    private static ExecutorService threadPool = Executors.newFixedThreadPool(100);

    private static Map<Integer, Integer> results = new HashMap<>();



    public static void main(String[] args) throws InterruptedException, ExecutionException {
        try {
            for (int i = 0; i < 2000; i++) {
                threadPool.execute(new Runnable() {
                    @Override
                    public void run() {
                        results.put((int)(Math.random()*1000), (int)(Math.random()*100));
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        results.get((int)(Math.random()*1000));
                    }
                });

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //threadPool.shutdown();
        }
    }
}
