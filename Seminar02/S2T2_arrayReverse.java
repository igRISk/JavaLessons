// Задача: объявить одномерный массив, заполнить его random, развернуть

import java.util.Arrays;
import java.util.Random;

public class S2T2_arrayReverse {
    public static void main(String[] args) {
        int arrLen = 10;
        int[] arr = new int[arrLen];
        int[] arrReversed = new int [10];

        for (int i = 0; i < arrLen; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arrLen; i++) {
            arrReversed [arrLen-1-i] = arr[i];
        }
        System.out.println(Arrays.toString(arrReversed));
    }
}