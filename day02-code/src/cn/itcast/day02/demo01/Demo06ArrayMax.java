package cn.itcast.day02.demo01;

public class Demo06ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 15, 30, 20, 10000};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        System.out.println("最大值：" + max);
        System.out.println("===================");
        //冒泡排序
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]){
                    int temp;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
