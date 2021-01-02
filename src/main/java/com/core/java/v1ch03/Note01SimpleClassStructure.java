package com.core.java.v1ch03;

/**
 * 这种注释 , 可以用来自动生成文档
 *
 * @Author chenpantao
 * @Date 2020-04-06 10:53
 * @Version 1.0
 */
/*多行注释
 *
 * public : access modifier 访问修饰符 , 控制程序的其它部分对这段代码的访问级别 .
 * class : 关键字 , 表明 java 程序中全部内容包含在类中
 * 类名规则 : 以字母开头 , 不可以使用保留字 , 建议使用驼峰结构
 */

// 当行注释
public class Note01SimpleClassStructure {

    /**
     * 使用 {} 划分程序的各个部分
     * 运行已编译的程序时 , java 虚拟机从指定类中的 main 方法开始执行
     * 该方法没有返回值 , 正常退出则退出代码为0 .
     * 如果希望在终止程序时返回其它代码 , 调用 System.exit 方法.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Java 通用语法 : object.method(parameters)
         * 在这里 ,System.out 对象并调用了它的 println 方法.
         */
        System.out.println("First Sample");

    }

}
