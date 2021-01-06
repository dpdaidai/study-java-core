package com.core.java.v1ch03;

/**
 * 数学函数Math
 * @Author chenpantao
 * @Date 1/6/21 4:13 PM
 * @Version 1.0
 */
public class Note05MathApi {

    public static void main(String[] args) {

        /**
         *
         * 1  Math包含了各种各样得数学函数.
         * 2  Math类中, 为了达到最快性能, 所有方法都使用计算机浮点单元中得例程 .
         * 3  如果得到一个完全可预测得结果比运行速度更重要得话, 那么应该使用StrictMath类.
         *
         */

        //科学计数法 1.0 * 10^-2
        System.out.println("科学计数法 1e-2 = " + (1e-2));

        //1.0 * 10^2
        System.out.println("科学计数法 1e2 = " + 1e2);

        //3得2次方 , 参数和结果都是double类型
        System.out.println("Math.pow(3, 2) = 3^2 = " + Math.pow(3, 2));

        //常数e=2.7
        System.out.println("Math.E : " + Math.E);

        // e^2
        System.out.println("Math.exp(2) = e^2 = " + Math.exp(2));

        System.out.println("Math.PI = π = " + Math.PI);

        //以e为底的对数运算
        System.out.println("Math.log(Math.E) = lne = " + Math.log(Math.E));

        //以10为底的对数运算
        System.out.println("Math.log10(10) = log 10(10) = " + Math.log10(10));

        //e为底数的log运算 log e(5)
        System.out.println("Math.log(5) = log e(5) = " + Math.log(5));

        //e为底数的log运算 log e(2)
        System.out.println("Math.log(2) = log e(2) = " + Math.log(2));

        //2为底数的log运算 log 2(5)
        System.out.println("Math.log(5) / Math.log(2) = log 2(5) = " + Math.log(5) / Math.log(2));

        //10为底数
        System.out.println("Math.log10(10) = log10(10) = " + Math.log10(10));

        //求4的平方根
        System.out.println("Math.sqrt(4) = 开根号4 = " + Math.sqrt(4));

        /**
         * 对于整型数a，b来说，取模运算或者求余运算的方法都是：
         * 1.求 整数商： c = [a/b];
         * 2.计算模或者余数： r = a - c*b.
         * 求模运算和求余运算在第一步不同: 取余运算在取c的值时，向0 方向舍入(fix()函数)；而取模运算在计算c的值时，向负无穷方向舍入(floor()函数)。
         * 例如计算：-7 Mod 4
         * 那么：a = -7；b = 4；
         * 第一步：求整数商c，如进行求模运算c = -2（向负无穷方向舍入），求余c = -1（向0方向舍入）；
         * 第二步：计算模和余数的公式相同，但因c的值不同，求模时r = 1，求余时r = -3。
         */

        // 负数做余数运算
        System.out.println("求余数 :  -7%4 = " + -7 % 4);
        //求模
        System.out.println("求模数 : Math.floorMod(-7, 4) = " + Math.floorMod(-7, 4));

        //正弦函数
        double degrees = 30.0;
        double radians = Math.toRadians(degrees);

        System.out.format("%.1f 度的正弦值为 %.4f%n", degrees, Math.sin(radians));
        //Math.cos, Math.tan, Math.atan, Math.atan2

    }

    public void test(){
        //0x0.3p10是在C99中引入的十六进制浮点文本的示例。 p将基数与指数分离。
        //0x0.3位被称为有效位部分(整数与可选分数)，指数是被缩放的二的幂。
        //该特定值计算为十六进制中的0.3，或3 * 16^(-1) = (3/16) , 再乘以2^10(1024)，其给出3 * 1024/16 = 192
//        System.out.println(0x0.3p10);
//
//        // (1/16) * 2^2
//        System.out.println(0x0.1p2);
//
//        // 1 * 2^(-2)
//        System.out.println(0x1p-2);
//
//        // 2 * 2^(-3)
//        System.out.println(0x2p-3);
//
//        // 2 * 2^(-2)
//        System.out.println(0x1.fffffp-2f);
//
//        // 4.0 * 2^(-3)
//        System.out.println(0x4.0p-3f);
//
//        // 0.1 * 10^2
//        System.out.println(0.1e2);
    }
}
