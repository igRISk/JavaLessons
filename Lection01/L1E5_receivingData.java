/**
* Receiving data from the terminal
*/



import java.util.Scanner;
public class L1E5_receivingData {
    public static void main(String[] args) {
        Scanner iScanner  = new Scanner(System.in);

        System.out.printf("Name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, %s!\n", name);

        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int x = iScanner.nextInt();
                            
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner.close();
    }
}