package com.core.java.v1ch03;

/**
 * @Author chenpantao
 * @Date 1/6/21 3:19 PM
 * @Version 1.0
 */
public class Note03Variable {

    public static final int CLASS_CONSTANT = 5;

    public static void main(String[] args) {
        /**
         * 一 概述
         * 1  每个变量都有一个类型
         * 2  变量名必须以字母开头 , 并由字母或者数字构成的序列
         * 3  变量名大小写敏感
         * 4  变量名长度基本没有限制
         * 5  不能使用Java保留字作为变量名
         * 5  特殊字符和空格不能出现在变量名中 , $尽管是合法得 , 但是不建议使用 . 它只用在Java编译器或其它工具生成得名字中 .
         * 6  建议使用驼峰命名规范
         * 7  建议逐一声明每一个变量 , 不要连续声明 .反面例子 : int j, i, a, b;
         * 8  为变量设置合适得名字 , 能提高程序可读性 , 两个变量不要只存在大小写上得差异 .
         */

        /**
         * 二 变量初始化
         * 1  声明一个变量后 , 必须用赋值语句对变量进行显示初始化
         * 2  尝试使用可能未被初始化得变量时 , Java编译器会认为语句有错
         * 3  变量得声明尽可能得靠近变量第一次使用得地方
         */

        /**
         * 三 常量
         * 1  利用final指示常量
         * 2  关键字 final 表示这个变量只能被赋值一次.
         * 3  一旦被赋值后就不能再更改了.
         * 4  习惯上 , 常量名使用全大写 , 单词间用 "_" 连接.
         */

        final double CM_PER_INCH = 2.54;
        final double PI;
        PI = 3.14;


    }
}
