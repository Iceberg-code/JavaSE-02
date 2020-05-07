package cn.itcast.day02.demo04;
/*数组可以作为方法的参数
* 当方法调用时，向方法的小括号进行传参，传递进去的其实是数组的地址值*/
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] arrayA = {10, 20, 30, 40, 50, 60};

        printArray(arrayA);
        System.out.println("aaaaaaaaaaaaaaaaa");
        printArray(arrayA);
        System.out.println("bbbbbbbbbbbbbbbbb");
        printArray(arrayA);
    }
    /*方法三要素
    * 1、返回值类型：只是进行打印而已，不需要进行计算，也没有结果，用void
    * 2、方法名称：printArray
    * 3、参数列表：必须给我数组，才能打印其中的元素。int[] array
    * 注：任何数据类型都能作为方法的参数*/
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
