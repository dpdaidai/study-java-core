package com.core.java.v1ch03;

/**
 * 基本数据类型
 *
 * @Author chenpantao
 * @Date 1/1/21 11:25 PM
 * @Version 1.0
 */
public class Note02BasicDataStructure {

    public static void main(String[] args) {
        /**
         * Java是一种强类型语言 , 必须为每一个变量声明一种类型 .
         * 一共有8种基本数据类型( primitive type )
         * 4 种整型 : byte , short , int , long
         * 2 种浮点类型 : float , double
         * 1 种字符类型 : char , 用于表示Unicode编码的字符单元
         * 1 种boolean类型 : 表示真值
         */

        intDemo();
        floatDemo();
        charDemo();

    }

    // 整型示例
    public static void intDemo() {
        /**
         * 1
         * 整型用于表示没有小数部分的数值 , 它允许为负 ,
         * 整型取值范围 :
         | 类型    | 存储需求   | 计算方式             | 取值范围    |
         | ----   |  ----     |  ----                | ----       |
         | byte   |  1 字节   | 2^8 = 256             | -128 ~ 127 |
         | short  |  2 字节   | 2^16 = 65535           | -32768 ~ 32767 |
         | int    |  4 字节   | 2^32 = 4.29e9 = 42亿    | -2,147,483,648 ~ 2,147,483,647 |
         | long   |  8 字节   | 2^64 = 1.8446e19       | -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 |
         */

        /**
         * 2
         * 整型的范围与运行Java代码的机器无关 . 解决了软件从一个平台移植到另一个平台的诸多问题 .
         * c和c++ 程序需要针对不同处理器选择最为高效的整型 , 这就可能造成一个在32位运行很好的C程序在16位系统上运行却发生整数溢出 .
         */

        // 整数溢出
        int overflowValue = (int) 2147483648L;
        System.out.println(overflowValue);  //输出-2147483648

        /**
         * 3  长整型数值后缀有一个L或l(建议使用L) .
         * 十六进制 有一个前缀 0x 或者0X
         * 八进制有一个前缀0 , 但是容易混淆 . 不建议实用
         * Java7 开始 , 加上 前缀 0b或者0B表示二进制
         * Java7 开始 , 为了让数字易读 , 可以给数字加上下划线 , 编译器会去除这些下划线
         */

        int hexadecimalValue = 0X11;
        System.out.println(hexadecimalValue);  // 输出17

        int octalValue = 011;
        System.out.println(octalValue);   // 输出9

        int binaryValue = 0B11;
        System.out.println(binaryValue);  // 输出3

        int underscoreValue = 1_333_22;
        System.out.println(underscoreValue); // 输出13322

        System.out.println("==============Int demo is finished==================");

    }

    // 浮点类型
    public static void floatDemo() {
        /**
         * 1  浮点类型
         * 浮点类型用于表示有小数部分的数值 . Java中有两种浮点类型
         * 浮点数值的运算遵循 IEEE754规范
         | 类型    | 存储需求   | 计算方式        | 取值范围    |
         | ----    |  ----    |  ----           | ----       |
         | flout   |  4 字节   |                 | ± 3.40282347E+38F (有效位数为6 ~ 7位) |
         | double  |  8 字节   |                 | ± 1.79769313486231570E+308 (有效位数为15位) |
         */
        /**
         * 2  储存方式
         * 1  double表示这种类型的数值精度是float类型的两倍(有人称之为双精度值).
         * 2  在很多情况下, float类型的精度很难满足需求, 实际上很少情况适合使用float类型. 例如需要单精度数据的库, 或者需要存储大量数据.
         * 3  float类型数值有一个后缀F或者f , 没有后缀的浮点数值默认为double , double类型后缀为D或d.
         */
        System.out.println("1.2F和1.2D精度不一样 : " + (1.2F == 1.2D)); // false , 由于精度问题和转化二进制储存的问题 , 详细原因有待查阅资料.

        /**
         * 3  表示溢出和出错情况的三个特殊的浮点数值
         * 所有 "非数值" 的值都认为是不相同的, 可以使用Double.isNaN , isInFinite 来检测是不是NaN 或者正负无穷大
         */
        // 正无穷大
        double finite = 1.0 / 0.0;
        System.out.println(finite);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println("检测一个数是不是正负无穷大 : " + Double.isInfinite(finite));
        System.out.println("检测一个数不属于NaN或者无穷大 : " + Double.isFinite(0));

        //负无穷大
        System.out.println(-1.0 / 0.0);
        System.out.println(Double.NEGATIVE_INFINITY);

        //NaN , 不是一个数字
        double nan = 0.0 / 0.0;
        System.out.println(nan);
        System.out.println(Double.NaN);
        System.out.println(nan == Double.NaN); // 永远不会为true
        System.out.println("检测一个数是否为NaN :" + Double.isNaN(nan)); // true

        /**
         * 3 浮点数不适合用于无法接受舍入误差的金融计算中 .
         * 这种舍入误差的主要原因是浮点数值采用二进制系统表示 , 而在二进制系统中无法精确的表示分数 1/10
         * 就好像十进制无法准确的表示分数1/3一样
         * 如果数值计算中不允许有任何舍入误差, 应该使用BigDecimal类
         */

        System.out.println("2.0-1.1 = " + (2.0 - 1.1));

        System.out.println("==============Float demo is finished==================");

    }

    // 字符类型char
    public static void charDemo() {
        /**
         * 1 char类型原本用于表示单个字符, 如今有些Unicode字符则需要两个char值.
         * 2 char类型的字面量要用 单引号 括起来.
         * 3 char类型可以表示为十六进制值, 其范围从\u0000 到 \uffff . 例如 \u2213 表示符号 ™
         * 4 特殊转义字符, 所有这些转义序列都可以出现在加引号的字符字面量或字符串中. 例如 '\u2212' 或 "hello\n"
         * 5 还可以出现在加引号的字符常量或字符串之外(而其它转义序列不可以)
         *      例如 public static void main(String\u005B\u005D args)  --> \u005B\u005D 分别是[]的编码
         * 6 Unicode转义序列会在解析代码之前得到处理. 例如 "\u0022+\u0022" , 在解析之前\u0022会转换为 双引号",
         *   这样就会得到""+""的一个表达式 , 想加的结果就是一个空串 .
         *   同理 , 在注释中, 也会提前转义 , \u00A0会替换为一个换行符 , 在单行注释中会导致语法错误.
         特殊转移序列
         | 转义序列 |  名称    |  Unicode值   |
         | ----    |  ----    |  ----       |
         | \b      |  退格    |  \u0008      |
         | \t      |  制表    |  \u0009      |
         | \n      |  换行    |  \u000a      |
         | \r      |  回车    |  \u000d      |
         | \"      |  双引号  |  \u0022      |
         | \'      |  单引号  |  \u0027      |
         | \\      |  反斜杠  |  \u005c      |
         */

        //char 得取值范围\u0000 - \uffff
        System.out.println("char取值范围 起点 :  0x0000 = " + 0x0000 + "=" + '\u0000');
        System.out.println("char取值范围 终点 :  0xffff = " + 0xffff + "=" + '\uffff');

        System.out.print("测试换行转义符号 : \n");

        System.out.println("打印两个双引号 : " + "\"+\"");
        
        System.out.println("char在解析前转义为双引号 , 导致式子变为了两个空串想加 : " + "\u0022+\u0022");

        System.out.println("数字强转为char : " + (char) 90);

        System.out.println("打印char字符 : " + 'Z');

        System.out.println("char强转为int : " + (int) 'Z');

        System.out.println("取得字符串中某一个char 对应的数值 : " + "Z".getBytes()[0]);

        System.out.println("==============char demo is finished==================");

    }
}
