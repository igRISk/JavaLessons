// Массивы



public class L3E2_array {
    public static void main(String[] args) {
        int[] a = new int[] {1, 9};
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);
        for (int i : a) { System.out.printf("%d ", i);}         // 1 9
        System.out.println();
        for (int j : b) { System.out.printf("%d ", j);;}        // 1 9 0
        System.out.println();

        int[] c = new int[] {0, 9};
        for (int i : c) { System.out.printf("%d ", i);}         // 0 9
        System.out.println();
        c = AddItem(c, 2);
        c = AddItem(c, 3);
        for (int i : c) { System.out.printf("%d ", i);}         // 0 9 2 3

    }

    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
}