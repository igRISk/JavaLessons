/**
* Arrays
*/



public class L1E3_arrays {
    public static void main(String[] args) {

// Одномерные массивы:
        
        int[] arr = new int[10];
        System.out.println(arr.length);                     // 10
        
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length);                     // 5
        
        System.out.println(arr[3]);                         // 4
        arr[0] = 13;
        System.out.println(arr[0]);                         // 13

// Многомерные массивы:
        
        int[] arr2[] = new int[3][5];
        for (int[] line : arr2) {
            for (int item: line) {
                System.out.printf("%d ", item);
            }
        System.out.println();        
        }
        
        int a = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = a;
                System.out.printf("%d ", arr2[i][j]);
                if (a < 9) a++;
                    else a--;
            }
        System.out.println();
        }

// Массив символов:
        
        char[] chOne = new char[16];
        System.out.println("Length chOne = " + chOne.length);
        char[] tmp = new char[chOne.length + 4];
        chOne = tmp;
        System.out.println("Length chOne = " + chOne.length);
        
    }
}
