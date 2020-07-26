package com.youyuan.entity.gc;

/**
 * 类名称：YoungOldAreaTest <br>
 * 类描述：测试大对象直接进入养老区 <br>
 * <p>
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/1 7:23<br>
 */
public class YoungOldAreaTest {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024 * 1024 * 20];//20m

    }
}
