package com.youyuan.entity.oom;

import java.util.ArrayList;

/**
 * 类名称：HeapOOM <br>
 * 类描述： 测试oom <br>
 *
 * -Xms8m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError  测试oom然后通过jprofiler工具查看内存占用情况
 * -XX:+HeapDumpOnOutOfMemoryError 代表当发生oom时会自动保存堆内存信息，保存目录是应用根目录
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/17 7:19<br>
 */
public class HeapOOM {
    byte[] buffer = new byte[1 * 1024 * 1024];//1MB

    public static void main(String[] args) {
        ArrayList<HeapOOM> list = new ArrayList<HeapOOM>();

        int count = 0;
        try{
            while(true){
                list.add(new HeapOOM());
                count++;
            }
        }catch (Throwable e){
            System.out.println("count = " + count);
            e.printStackTrace();
        }
    }
}
