package com.youyuan.entity.jit;

/**
 * 类名称：IntCompTest <br>
 * 类描述： 测试设置执行引擎解释器或即时编译器 <br>
 *
 *  -Xint  : 6520ms   解释器
 *  -Xcomp : 950ms    即时编译器
 *  -Xmixed : 936ms   混合模式
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/7/5 16:28<br>
 */
public class IntCompTest {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        testPrimeNumber(1000000);

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));

    }

    public static void testPrimeNumber(int count){
        for (int i = 0; i < count; i++) {
            //计算100以内的质数
            label:for(int j = 2;j <= 100;j++){
                for(int k = 2;k <= Math.sqrt(j);k++){
                    if(j % k == 0){
                        continue label;
                    }
                }
                //System.out.println(j);
            }

        }
    }
}
