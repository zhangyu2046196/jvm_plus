package com.youyuan.entity.gc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 类名称：GCRootsTest <br>
 * 类描述： 测试GCRoots <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/16 9:56<br>
 */
public class GCRootsTest {
    public static void main(String[] args) {
        List<Object> numList = new ArrayList<Object>();
        Date birth = new Date();

        for (int i = 0; i < 100; i++) {
            numList.add(String.valueOf(i));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("数据添加完毕，请操作：");
        new Scanner(System.in).next();
        numList = null;
        birth = null;

        System.out.println("numList、birth已置空，请操作：");
        new Scanner(System.in).next();

        System.out.println("结束");
    }
}
