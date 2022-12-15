// Задача 4: 
// Дано два числа, например 3 и 56, необходимо составить следующие строки: 
// 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

// Задача 5: 
// Замените символ “=” на слово “равно”. 
// Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

// Задача 6*:
// Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

// Задача 7**:
// Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" 
// средствами String и StringBuilder.


import java.util.Scanner;

public class S2_Homework_04_ {
    public static void main(String[] args) {
        Scanner iScanner  = new Scanner(System.in);
        System.out.printf("Enter number 1: ");
        while (!iScanner.hasNextInt()) iScanner.next();
        int num1 = iScanner.nextInt();
        System.out.printf("Enter number 2: ");
        while (!iScanner.hasNextInt()) iScanner.next();
        int num2 = iScanner.nextInt();
        iScanner.close();
// Задача 4:
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        StringBuilder str3 = new StringBuilder();
        str1 = str1.append(num1 + " + " + num2 + " = " + (num1+num2));
        str2 = str2.append(num1 + " - " + num2 + " = " + (num1-num2));
        str3 = str3.append(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
// Задача 5:
        delInsEqualsSign(str1);
        System.out.println(str1);
// Задача 6:
        replaceEqualsSign(str2);
        System.out.println(str2);
// Задача 7:
        String str4 = "";
        StringBuilder str5 = new StringBuilder();
        StringBuilder str6 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            str4 += "=";
            str5.append("=");
            str6.append("=");
        }

        long start = System.currentTimeMillis();
        String strRep = str4.replace("=", "equals");
        long timeSpent = System.currentTimeMillis() - start;
        System.out.println(">>> String.replace >>>                time spent, ms: " + timeSpent);

        start = System.currentTimeMillis();
        delInsEqualsSign(str5);
        timeSpent = System.currentTimeMillis() - start;
        System.out.println(">>> StringBuider delete/insert >>>    time spent, ms: " + timeSpent);

        start = System.currentTimeMillis();
        replaceEqualsSign(str6);
        timeSpent = System.currentTimeMillis() - start;
        System.out.println(">>> StringBuider replace >>>          time spent, ms: " + timeSpent);
}



    public static void delInsEqualsSign (StringBuilder str) {
        Character ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch.equals('=')) {
                str.deleteCharAt(i);
                str.insert(i, "equals");
            }
        }
    }

    public static void replaceEqualsSign (StringBuilder str) {
        Character ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch.equals('=')) {
                str.replace(i, i+1, "equals");
            }
        }
    }
}