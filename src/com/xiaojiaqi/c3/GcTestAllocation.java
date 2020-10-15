package com.xiaojiaqi.c3;

/**
 * @Author: liangjiaqi
 * @Date: 2020/6/5 1:30 PM
 */
public class GcTestAllocation {
    private static final int _1MB = 1024*1024;

    // vmoptions -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC

    public static void main(String[] args) throws InterruptedException {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB]; //出现一次Minor GC\

        Thread.sleep(1000000000);
    }
}
