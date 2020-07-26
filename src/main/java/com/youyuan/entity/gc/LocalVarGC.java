package com.youyuan.entity.gc;

/**
 * 类名称：LocalVarGC <br>
 * 类描述： 测试手动GC对象可达性分析 <br>
 *
 * -XX:+PrintGCDetails
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/21 6:39<br>
 */
public class LocalVarGC {
    /**
     * 不会被回收
     */
    public void localvarGC1() {
        byte[] buffer = new byte[10 * 1024 * 1024];//10MB
        System.gc();
    }

    /**
     * 会被回收
     */
    public void localvarGC2() {
        byte[] buffer = new byte[10 * 1024 * 1024];
        buffer = null;
        System.gc();
    }

    /**
     * 不会被回收
     */
    public void localvarGC3() {
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }
        System.gc();
    }

    /**
     * 会被回收
     */
    public void localvarGC4() {
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }
        int value = 10;
        System.gc();
    }

    /**
     * 会被回收
     */
    public void localvarGC5() {
        localvarGC1();
        System.gc();
    }

    public static void main(String[] args) {
        LocalVarGC local = new LocalVarGC();
        local.localvarGC1();
    }
}
