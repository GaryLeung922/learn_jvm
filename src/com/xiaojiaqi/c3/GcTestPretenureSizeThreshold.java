package com.xiaojiaqi.c3;

/**
 * @Author: liangjiaqi
 * @Date: 2020/6/5 6:32 PM
 */
public class GcTestPretenureSizeThreshold {
    private static final int _1MB = 1024*1024;

    // -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728 -XX:+UseConcMarkSweepGC
    public static void main(String[] args) {
        System.gc();
        byte[] allocations;
        allocations = new byte[4 * _1MB]; //直接分配在老年代中

    }
}
