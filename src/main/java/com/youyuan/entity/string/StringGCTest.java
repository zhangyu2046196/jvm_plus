package com.youyuan.entity.string;

/**
 * 类名称：StringGCTest <br>
 * 类描述： String垃圾回收测试 <br>
 *
 * String的垃圾回收:
 * -Xms15m -Xmx15m -XX:+PrintStringTableStatistics -XX:+PrintGCDetails
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/13 7:36<br>
 */
public class StringGCTest {
    public static void main(String[] args) {
        for (int j = 0; j < 100000; j++) {
            String.valueOf(j).intern();
        }
    }
}
