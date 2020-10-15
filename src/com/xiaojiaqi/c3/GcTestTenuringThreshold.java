package com.xiaojiaqi.c3;

import com.sun.javafx.scene.input.InputEventUtils;

/**
 * @Author: liangjiaqi
 * @Date: 2020/6/6 8:25 AM
 */
public class GcTestTenuringThreshold {

    private static final int _1MB = 1024*1024;

    // -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:TargetSurvivorRatio=90 -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1 -XX:+UseConcMarkSweepGC -XX:+PrintTenuringDistribution
    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];

        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }
}
