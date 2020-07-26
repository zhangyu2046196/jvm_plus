package com.youyuan.entity.refrence;

/**
 * 类名称：StrongReferenceTest <br>
 * 类描述： 强引用 <br>
 * <p>
 * 对象不会被回收
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/23 7:22<br>
 */
public class StrongReferenceTest {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello,尚硅谷");
        StringBuffer str1 = str;

        str = null;
        System.gc();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(str1);
    }
}
