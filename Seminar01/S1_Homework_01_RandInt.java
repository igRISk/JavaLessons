// 1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2



import java.util.Random;

public class S1_Homework_01_RandInt {
    public static void main(String[] args) {
        int i = getRandomInt(-1000, 1001);
        int n = 0;
        if (i > 0) n = Integer.highestOneBit(i);
        else n = Integer.highestOneBit(-i);
        int[] m1 = multiples(i, Short.MAX_VALUE, n);
        int[] m2 = notMultiples(Short.MIN_VALUE, i, n);
        printArray(m2);
        System.out.println("i (random from -1000 to 1000) = " + i);
        System.out.println("n (MSB) = " + n);
        printArray(m1);
    }
    


    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
        .findFirst()
        .getAsInt();
    }

    public static int[] multiples(int valueFrom, int valueTo, int multiple) {
        int tmp = 0, l = 0;
        if (valueFrom < 0) tmp = -multiple;
        else {
            tmp = multiple;
            l = 1;
        }
        while (tmp < valueTo) {
            tmp += multiple;
            l +=1;
        }
        int[] multArray = new int[l];
        if (valueFrom < 0) tmp = -multiple;
        else tmp = 0;
        for (int i = 0; i < l; i++) {
            multArray[i] = tmp; 
            tmp += multiple;
        }
        return multArray;
    }

    public static int[] notMultiples(int valueFrom, int valueTo, int multiple) {
        int l = 0;
        for (int i = valueFrom; i < valueTo; i++) {
            if (i % multiple != 0) l++;
        }
        int[] notMultArray = new int[l];
        int j = 0;
        for (int i = valueFrom; i < valueTo; i++) {
            if (i % multiple != 0) {
                notMultArray[j] = i;
                j++;
            }
        }
        return notMultArray;
    }


    public static void printArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("\n");
    }

}