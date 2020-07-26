package com.youyuan.entity.io;

import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * 类名称：BufferTest <br>
 * 类描述： 直接缓冲区测试 <br>
 * <p>
 * IO                  NIO (New IO / Non-Blocking IO)
 * byte[] / char[]     Buffer
 * Stream              Channel
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/5 9:52<br>
 */
public class BufferTest {
    private static final int BUFFER = 1024 * 1024 * 1024;//1GB

    public static void main(String[] args) {
        //直接分配本地内存空间
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(BUFFER);
        System.out.println("直接内存分配完毕，请求指示！");

        Scanner scanner = new Scanner(System.in);
        scanner.next();

        System.out.println("直接内存开始释放！");
        byteBuffer = null;
        System.gc();
        scanner.next();
    }
}
