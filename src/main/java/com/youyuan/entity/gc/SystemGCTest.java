package com.youyuan.entity.gc;

/**
 * 类名称：SystemGCTest <br>
 * 类描述： 测试调用System.gc()方法 <br>
 * <p>
 * 调用System.gc()方法后不会立即进行垃圾回收
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/20 8:09<br>
 */
public class SystemGCTest {
    public static void main(String[] args) {
        new SystemGCTest();
        System.gc();//提醒jvm的垃圾回收器执行gc,但是不确定是否马上执行gc
        //与Runtime.getRuntime().gc();的作用一样。

//        System.runFinalization();//强制调用使用引用的对象的finalize()方法
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("SystemGCTest 重写了finalize()");
    }
}
