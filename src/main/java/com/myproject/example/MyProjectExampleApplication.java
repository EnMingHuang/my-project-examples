package com.myproject.example;

import org.omg.CORBA.INTERNAL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Live Templates
 * &快捷键练习
 */
@SpringBootApplication
public class MyProjectExampleApplication {
    //模板prsf : private static final
    //模板psf  : public static final
    //模板psfi : public static final int
    //模板psfs : public static final String

    public static void main(String[] args) {
        SpringApplication.run(MyProjectExampleApplication.class, args);
        System.out.printf("快捷键与模板使用");
        //模板souf 打印字符串     : System.out.printf("");
        //模板sout 打印           : System.out.println();
        //模板soutm 打印方法名    : System.out.println("MyProjectExampleApplication.main");
        //模板soutp 打印，才参数  : System.out.println("args = " + Arrays.deepToString(args));
        //模板soutv              :System.out.println("args = " + args);
        /*
模板ifn
        if (args == null) {
        }*/
        /*
模板inn
        if (args != null) {
        }*/
        /*
模板fori
        for (int i = 0; i < ; i++) {

        }*/
        /*前提上一行有参数名称为args的列表变量
模板itar
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }*/
        /*
模板itco
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); ) {
            Object next =  iterator.next();

        }*/
        /*
模板iten
        while (enumeration.hasMoreElements()) {
            Object nextElement =  enumeration.nextElement();

        }*/
        /*前提上一行有参数名称为args的列表变量
模板iter
        for (String arg : args) {

        }*/
        /*
模板itit
        while (iterator.hasNext()) {
            Object next =  iterator.next();

        }*/
        /*遍历list集合
模板itli
        for (int i = 0; i < list.size(); i++) {
            Object o =  list.get(i);

        }*/

        //快捷键
        //ctrl+alt+T 将鼠标放到指定行上，将指定行的代码放到条件、循环、异常捕获、同步、线程代码块中
        //Ctrl+o 重写父类方法
        //Ctrl+Backspace 按单词删除
        //Ctrl+J 查看更多模板
        //Ctrl+U 查看父类
        //Ctrl+Alt+ ←/→ 查看先浏览的类，查看后浏览的
        //Alt+Shift+up/down 上/下移一行
        //Ctrl+shift + / 多行注释
        //Ctrl+shift + U 大小写转换
        //Ctrl+Enter 上插一行
        //shift + Enter 下插一行

    }

}


