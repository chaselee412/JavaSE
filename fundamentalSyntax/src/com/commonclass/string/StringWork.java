package com.commonclass.string;
    /*
    将字符串的指定部分进行反转，将abcdef反转为aedcbf
    编写方法public static String reverse (String str, int start , int end) 搞定
    思路
    先把方法确定
    把String转成char[], 因为char[] 的元素可以交换
    画出分析示意图"https://p.ipic.vip/pvi0pu.png"
     */
public class StringWork {
    public static void main(String[] args) {
        //对输入的参数做验证


        String str = "abcdef";
        System.out.println("before exchange:"+str);

       try {
            str = reverse(null,1,4);
        } catch (Exception e) {
            System.out.println(e.getMessage());//不用try catch只报告exception没有正常运行
            return;
        }
        System.out.println("after exchange:"+str);
    }
    public static String reverse (String str, int start, int end){
        //编程技巧
        //写出正确的情况 容易想到
        //取反
        if(!(str !=null && start>=0&& end>start &&end<str.length())){
            throw new RuntimeException("wrong parameter");
        }
        char[] chars = str.toCharArray();
        char temp =' ';
        for (int i = start,j = end; i < j ; i++,j--) {
            temp = chars[i];
            chars[i]= chars[j];
            chars[j]= temp;
        }
        //使用chars重新构建string返回
        return new String(chars);//这是一个String方法实例建造的新对象
    }
}
