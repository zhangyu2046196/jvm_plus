package com.youyuan.entity.method;

/**
 * 类名称：MethodAreaDemo <br>
 * 类描述： 测试设置方法区大小参数 <br>
 * <p>
 * jdk7及以前：
 * -XX:PermSize=100m -XX:MaxPermSize=100m
 * <p>
 * jdk8及以后：
 * -XX:MetaspaceSize=100m  -XX:MaxMetaspaceSize=100m
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/3 22:50<br>
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end...");
    }
}
