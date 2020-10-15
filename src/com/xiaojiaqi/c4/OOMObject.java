package com.xiaojiaqi.c4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liangjiaqi
 * @Date: 2020/5/31 4:12 PM
 */
public class OOMObject {
    public  byte[] placeholder = new byte[64*1024];

    public static void fillHeap(int num)throws InterruptedException{
        List<OOMObject> list = new ArrayList<>();
        for(int i=0;i<num;i++){
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }
}
