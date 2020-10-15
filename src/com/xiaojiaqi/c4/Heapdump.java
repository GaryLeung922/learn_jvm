package com.xiaojiaqi.c4;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: liangjiaqi
 * @Date: 2020/5/28 5:07 PM
 */
public class Heapdump {

    public static void main(String[] args) {
        List<Byte[]> bytes = new LinkedList<>();
        for(int i=0;i<9999;i++){
            bytes.add(new Byte[1024*10]);
        }
    }
}
