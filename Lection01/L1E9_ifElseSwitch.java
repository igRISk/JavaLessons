/**
* Control structures: 
*   1) Conditional branches
*/



import java.util.Scanner;
public class L1E9_ifElseSwitch {
    public static void main(String[] args) {

// if else ---------------------------------------------------------------

        int a = 1, b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
        
        int f = 0;
        if (a < b) f = a;
        if (b < a) f = b;
        System.out.println(f);

        int min = a < b ? a : b;                // true -> a, false -> b
        System.out.println(min);

// switch ----------------------------------------------------------------
        
        Scanner iScanner  = new Scanner(System.in);
        System.out.print("Please enter number of month: ");
        int month = iScanner.nextInt();
        //int month = value;
        String text = "";
        switch (month) {
            case 1:
                text = "January";
                break;
            case 2:
                text = "February";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();
    }
}
