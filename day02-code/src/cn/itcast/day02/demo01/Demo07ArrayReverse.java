package cn.itcast.day02.demo01;
//数组反转
public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] arrayA = {1, 9, 6, 56, 32};
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
        System.out.println("=======================");
        //数组反转-奇数个
        for(int min = 0,max = arrayA.length-1; min < max; min++, max--){
            int temp = arrayA[min];
            arrayA[min] = arrayA[max];
            arrayA[max] = temp;
        }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
        System.out.println("===========================");

        int[] arrayB = {1, 9, 6, 56, 32, 100};
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }
        System.out.println("=======================");
        //数组反转-偶数个
        for(int min = 0,max = arrayB.length-1; min < max; min++, max--){
            int temp = arrayB[min];
            arrayB[min] = arrayB[max];
            arrayB[max] = temp;
        }
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }

    }
}
