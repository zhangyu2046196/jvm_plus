package com.youyuan.entity.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 类名称：StringTest3 <br>
 * 类描述： 测试字符串常量池在jdk1.6存储在方法区,在jdk1.7开始存储在堆 <br>
 *
 * jdk6中：
 * -XX:PermSize=6m -XX:MaxPermSize=6m -Xms6m -Xmx6m
 *
 * jdk8中：
 * -XX:MetaspaceSize=6m -XX:MaxMetaspaceSize=6m -Xms6m -Xmx6m
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/7 8:01<br>
 */
public class StringTest3 {
    public static void main(String[] args) {
        //使用Set保持着常量池引用，避免full gc回收常量池行为
        Set<String> set = new HashSet<String>();
        //在short可以取值的范围内足以让6MB的PermSize或heap产生OOM了。
        short i = 0;
        while(true){
            set.add(String.valueOf(i++).intern());
        }
    }
}
