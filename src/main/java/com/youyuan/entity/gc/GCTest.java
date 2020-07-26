package com.youyuan.entity.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名称：GCTest <br>
 * 类描述： 测试gc及分析日志 <br>
 * <p>
 * 测试MinorGC 、 MajorGC、FullGC
 * -Xms9m -Xmx9m -XX:+PrintGCDetails
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/1 6:54<br>
 */
public class GCTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            List<String> list = new ArrayList<String>();
            String a = "youyuan.com";
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }

        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("遍历次数为：" + i);
        }
    }
}
