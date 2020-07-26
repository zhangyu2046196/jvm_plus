package com.youyuan.entity;

import java.util.ArrayList;
import java.util.Random;

/**
 * 类名称：OOMTest <br>
 * 类描述：测试OOM异常 <br>
 *
 * -Xms600m -Xmx600m
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/6/27 19:39<br>
 */
public class OOMTest {
    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<Picture>();
        while(true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(1024 * 1024)));
        }
    }
}

class Picture{
    private byte[] pixels;

    public Picture(int length) {
        this.pixels = new byte[length];
    }
}
