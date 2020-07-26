package com.youyuan.entity.gc;

import java.util.ArrayList;

/**
 * 类名称：GCLogTest <br>
 * 类描述： 分析gc日志信息内容 <br>
 *
 * -Xms60m -Xmx60m -XX:SurvivorRatio=8 -XX:+PrintGCDetails -Xloggc:./logs/gc.log
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/26 18:20<br>
 */
public class GCLogTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            byte[] arr = new byte[1024 * 100];//100KB
            list.add(arr);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
