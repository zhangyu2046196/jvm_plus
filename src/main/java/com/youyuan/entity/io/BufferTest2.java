package com.youyuan.entity.io;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/**
 * 类名称：BufferTest2 <br>
 * 类描述： 测试直接内存OOM <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/5 10:20<br>
 */
public class BufferTest2 {
    private static final int BUFFER = 1024 * 1024 * 20;//20MB

    public static void main(String[] args) {
        ArrayList<ByteBuffer> list = new ArrayList<ByteBuffer>();

        int count = 0;
        try {
            while(true){
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(BUFFER);
                list.add(byteBuffer);
                count++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            System.out.println(count);
        }


    }
}
