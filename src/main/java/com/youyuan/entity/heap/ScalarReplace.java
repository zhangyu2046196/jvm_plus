package com.youyuan.entity.heap;

/**
 * 类名称：ScalarReplace <br>
 * 类描述： 标量测试 <br>
 *
 * -Xmx100m -Xms100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:-EliminateAllocations
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/3 8:09<br>
 */
public class ScalarReplace {
    public static class User {
        public int id;
        public String name;
    }

    public static void alloc() {
        User u = new User();//未发生逃逸
        u.id = 5;
        u.name = "www.atguigu.com";
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为： " + (end - start) + " ms");
    }
}

/*
class Customer{
    String name;
    int id;
    Account acct;

}

class Account{
    double balance;
}


 */
