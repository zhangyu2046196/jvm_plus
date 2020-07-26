package com.youyuan.entity;

import java.util.concurrent.TimeUnit;

/**
 * 类名称：HeapTest1

 * 类描述：测试一个jvm虚拟机对应一份堆内存

 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/6/27 17:00

 */
public class HeapTest1 {

    public static void main(String[] args) {
        System.out.println("第一个jvm进程,start......");
        try {
            TimeUnit.SECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("第一个jvm进程,end......");
    }
}
