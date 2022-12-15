// Задача 3*:
// Напишите программу, чтобы перевернуть строку с помощью рекурсии.


import java.util.Scanner;

public class S2_Homework_03_ {
    public static void main(String[] args) {
        Scanner iScanner  = new Scanner(System.in);
        System.out.printf("Please enter some text: ");
        String txt = iScanner.nextLine();
        iScanner.close();
        txt = StringReverseRec(txt);
        System.out.println(txt);
    }

    public static String StringReverseRec (String str){
        if (str == null || str.equals(""))
            return str;
        return str.charAt(str.length() -1) + StringReverseRec(str.substring(0, str.length() -1));
    }

}