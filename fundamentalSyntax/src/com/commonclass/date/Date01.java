package com.commonclass.date;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        //获取当前系统时间
        //这里date，类在java.util包
        //默认输出的日期格式是国外的方式 format可转
        Date d1 = new Date();
        System.out.println("current date="+d1);
        Date d2 = new Date(1000);//指定毫秒数得到时间  start in 1970
        System.out.println("d2="+d2);
        //创建SimpleDateFormat对象，可以指定相应格式
        //这里的格式使用的字母是规定的好的，不能乱改
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format =  sdf.format(d1);
        System.out.println("当前日期="+ format);
        //可以把一个格式化的String转成对应的Date
        //得到Date仍然在输出时，还是按国外的形式，如果需要格式输出，需要转换
        //在把String->Date，使用的sdf格式需要和给的String的格式一样否则抛出转化异常,格式必须一致，空格都不能差
        String s = "1996年01月01日 10:20:30 星期一";
        Date parse =sdf.parse(s);
        System.out.println("parse="+sdf.format(parse));



    }
}
