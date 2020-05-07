package cn.itcast.day02.demo01;

//获取数组的长度
public class Demo05ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {1, 2, 5, 2, 26, 52, 2, 2, 1, 5};
        System.out.println(arrayA.length);
        System.out.println(arrayB.length);

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
        System.out.println("===============");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i] + "\t");
        }
    }
}
