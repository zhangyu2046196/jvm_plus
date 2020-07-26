package com.youyuan.entity;

import java.util.concurrent.TimeUnit;

/**
 * 类名称：SimpleHeap <br>
 * 类描述： 测试堆内存 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/6/27 18:08<br>
 */
public class SimpleHeap {

    public static void main(String[] args) {
        HeapTest1 heapTest1 = new HeapTest1();
        HeapTest2 heapTest2 = new HeapTest2();
        try {
            TimeUnit.SECONDS.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
