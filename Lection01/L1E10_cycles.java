/**
* Control structures: 
*   1) Loops:
        - while
        - do while
        - for
        - for in
*   2) Branching statements
*/



public class L1E10_cycles {
    public static void main(String[] args) {

// while -----------------------------------------------------------------

        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println("count = " + count);

// continue --------------------------------------------------------------

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }

// break -----------------------------------------------------------------

        for (int i = 0; i < 10; i++) {
        if (i % 2 != 0)
            break;
        System.out.println(i);
        }

// for in ----------------------------------------------------------------

        System.out.println();
        int[] arr = new int[]{1,2,3,4,5,77};
        for (int item : arr) {
            System.out.println(item);
        }

    }
}
