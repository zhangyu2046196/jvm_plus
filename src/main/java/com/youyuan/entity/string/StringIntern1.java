package com.youyuan.entity.string;

/**
 * 类名称：StringIntern1 <br>
 * 类描述： intern方法拓展练习 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/9 7:57<br>
 */
public class StringIntern1 {
    public static void main(String[] args) {
        //StringIntern.java中练习的拓展：
        String s3 = new String("1") + new String("1");//new String("11")
        //执行完上一行代码以后，字符串常量池中，是否存在"11"呢？答案：不存在！！
        String s4 = "11";//在字符串常量池中生成对象"11"
        String s5 = s3.intern();
        System.out.println(s3 == s4);//false
        System.out.println(s5 == s4);//true
    }
}
