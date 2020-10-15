package com.xiaojiaqi.c4;

/**
 * @Author: liangjiaqi
 * @Date: 2020/5/31 4:34 PM
 */
public class MonitoringDeadLock {
    static class SyncAddRunable implements Runnable{

        int a, b;

        public SyncAddRunable(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            synchronized (Integer.valueOf(a)){
                synchronized (Integer.valueOf(b)){
                    System.out.println(a + b);
                }
            }
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<1000; i++){
            new Thread(new SyncAddRunable(1,2)).start();
            new Thread(new SyncAddRunable(2,1)).start();
        }
    }
}
