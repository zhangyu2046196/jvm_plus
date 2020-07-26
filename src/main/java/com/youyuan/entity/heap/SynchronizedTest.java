package com.youyuan.entity.heap;

/**
 * 类名称：SynchronizedTest <br>
 * 类描述： 同步省略 <br>
 *
 * 同步省略说明
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/3 7:59<br>
 */
public class SynchronizedTest {
    public void f() {
        Object hollis = new Object();
        synchronized(hollis) {
            System.out.println(hollis);
        }
    }
}
