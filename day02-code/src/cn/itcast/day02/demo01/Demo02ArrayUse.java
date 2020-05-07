package cn.itcast.day02.demo01;
//直接打印数组名称，得到的是数组对应的：内存地址哈希值
//访问数组元素格式：数组名称[索引值]
public class Demo02ArrayUse {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(array[1]);

        //将数组中某一个单个元素，赋值交给变量
        int num = array[1];
        System.out.println(num);
    }
}
