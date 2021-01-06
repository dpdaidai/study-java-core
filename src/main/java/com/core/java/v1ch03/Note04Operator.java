package com.core.java.v1ch03;

/**
 * @Author chenpantao
 * @Date 1/6/21 4:13 PM
 * @Version 1.0
 */
public class Note04Operator {

    public static strictfp void main(String[] args) {

        /**
         * 1  + , - , * , /  表示加减乘除
         * 2  当参与/运算得两个操作数都是整数时 , 表示整数除法 . 否则表示浮点除法.
         * 3  % 表示取余(取模).
         * 4  整数被0除将会产生一个异常 , 浮点数被0除, 结果将会得到无穷大或者NaN
         * 5  strictfp 关键字 : 如果标记了一个方法 , 那么该方法进行得所有运算都将使用严格得浮点计算 .
         * 例如 : 15/2=7 , 15%2=1, 15.0/2=7.5
         *
         */

        // int a = 1/0;  //抛出异常 java.lang.ArithmeticException: / by zero

        //正无穷
        System.out.println(1.0/0.0);
        System.out.println(Double.POSITIVE_INFINITY);

        //负无穷
        System.out.println(-1.0/0.0);
        System.out.println(Double.NEGATIVE_INFINITY);

        //不是一个数字
        System.out.println(0.0/0.0);
        System.out.println(Double.NaN);


    }
}
