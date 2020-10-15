package com.xiaojiaqi.jvmTools;

import java.io.IOException;

/**
 * @Author: liangjiaqi
 * @Date: 2020/6/1 6:41 PM
 */
public class TestRedefine {

    public static void main(String[] args) throws IOException {
        while (true){
            System.in.read();
            m();
            System.out.println("=2=");
        }

    }

    public static void m(){
        System.out.println("2");
        System.out.println("3");
    }
}
