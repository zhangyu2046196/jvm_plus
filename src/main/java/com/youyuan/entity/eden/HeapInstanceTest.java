package com.youyuan.entity.eden;

import java.util.ArrayList;
import java.util.Random;

/**
 * 类名称：HeapInstanceTest <br>
 * 类描述： 通过Java Visual VM查看young gc过程 <br>
 *
 * -Xms600m -Xmx600m
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/6/29 7:18<br>
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024 * 200)];

    public static void main(String[] args) {
        ArrayList<HeapInstanceTest> list = new ArrayList<HeapInstanceTest>();
        while (true) {
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
