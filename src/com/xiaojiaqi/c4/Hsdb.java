package com.xiaojiaqi.c4;

import sun.jvm.hotspot.HSDB;

/**
 * @Author: liangjiaqi
 * @Date: 2020/5/29 1:33 PM
 */
public class Hsdb {
    public static void main(String[] args) {
        synchronized (new Object()){
            System.out.println("f");
        }
        HSDB.main(new String[] {});


    }
}
