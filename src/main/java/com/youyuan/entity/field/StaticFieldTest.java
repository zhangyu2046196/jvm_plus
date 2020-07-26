package com.youyuan.entity.field;

/**
 * 类名称：StaticFieldTest <br>
 * 类描述： 测试静态变量是存储永久区还是堆空间 <br>
 * <p>
 * 静态引用对应的对象实体始终都存在堆空间
 * <p>
 * jdk7：
 * -Xms200m -Xmx200m -XX:PermSize=300m -XX:MaxPermSize=300m -XX:+PrintGCDetails
 * jdk 8：
 * -Xms200m -Xmx200m -XX:MetaspaceSize=300m -XX:MaxMetaspaceSize=300m -XX:+PrintGCDetails
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/4 18:40<br>
 */
public class StaticFieldTest {
    private static byte[] arr = new byte[1024 * 1024 * 100];//100MB

    public static void main(String[] args) {
        System.out.println(StaticFieldTest.arr);

//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
