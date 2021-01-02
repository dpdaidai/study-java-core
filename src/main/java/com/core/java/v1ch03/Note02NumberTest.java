package com.core.java.v1ch03;

public class Note02NumberTest {

    public static void main(String[] args) {
        //二进制
        System.out.println("二进制 0b10 : " + 0b10);
        //八进制
        System.out.println("八进制 010 : " + 010);
        //十六进制
        System.out.println("十六进制 0x10 : " + 0x10);
        // "_" 分隔符无意义 , 用于让数字易读 , java编译器会去除这些下划线
        System.out.println(1_0);
        System.out.println(0b1_0);
        System.out.println(01_0);
        System.out.println(0x1_0);

        //单精度数值 , 很少情况适用 , 例如单精度的库 , 或者需要储存大量数据
        System.out.println("单精度 3.14F : " + 3.14F);
        //双精度数值 , 加d或者D , 不加就默认为双精度
        System.out.println("不加后缀默认双精度 3.14 :" + 3.14);

        //(1/10)*3
        System.out.println("e表示10的指数 : 1e-3 = " + 1e-3);

//        //用十六进制表示浮点数 , (1/2)*3
//        System.out.println(0x1p-3);

        //java.lang.ArithmeticException: / by zero
        //System.out.println(0/0);

        //正无穷
        System.out.println(1.0/0.0);
        System.out.println(Double.POSITIVE_INFINITY);

        //负无穷
        System.out.println(-1.0/0.0);
        System.out.println(Double.NEGATIVE_INFINITY);

        //不是一个数字
        System.out.println(0.0/0.0);
        System.out.println(Double.NaN);

        //舍入误差0.8999999999999999
        System.out.println(2.0 - 1.1);


        //double转为int直接舍去尾数
        System.out.println((int) 1.2);
        System.out.println((int) 1.8);

        //负数做余数运算  -3%2 = -1
        System.out.println(-3 % 2);


    }


}
