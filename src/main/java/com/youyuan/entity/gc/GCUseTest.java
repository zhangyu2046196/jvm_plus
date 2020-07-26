package com.youyuan.entity.gc;

import java.util.ArrayList;

/**
 * 类名称：GCUseTest <br>
 * 类描述： 测试默认使用垃圾回收器 <br>
 * <p>
 * -XX:+PrintCommandLineFlags
 * <p>
 * -XX:+UseSerialGC:表明新生代使用Serial GC ，同时老年代使用Serial Old GC
 * <p>
 * -XX:+UseParNewGC：标明新生代使用ParNew GC
 * <p>
 * -XX:+UseParallelGC:表明新生代使用Parallel GC
 * -XX:+UseParallelOldGC : 表明老年代使用 Parallel Old GC
 * 说明：二者可以相互激活
 * <p>
 * -XX:+UseConcMarkSweepGC：表明老年代使用CMS GC。同时，年轻代会触发对ParNew 的使用
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/25 21:50<br>
 */
public class GCUseTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<byte[]>();

        while (true) {
            byte[] arr = new byte[100];
            list.add(arr);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
