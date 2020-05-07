package cn.itcast.day02.demo01;
/*
数组的概念：是一种容器，可以同时存放多个数据值
数组的特点：
    1、数组是一种引用数据类型
    2、数组当中的多个数据，类型必须统一
    3、数组的长度在程序运行期间不可改变
*/
//1、动态初始化（指定长度）：在创建数组的时候，直接指定数组当中数据元素的个数
public class Demo01Array {
    public static void main(String[] args) {
        //创建一个数组，能存放100个int类型数据
        int[] arrayA = new int[100];
        //创建一个数组，能存放10个double类型数据
        double[] arrayB = new double[10];
        //创建一个数组，能存放3个字符串
        String[] arrayC = new String[3];
    }
}
