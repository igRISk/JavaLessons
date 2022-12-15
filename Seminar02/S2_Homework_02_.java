// Задача 2: 
// Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга.


public class S2_Homework_02_ {
    public static void main(String[] args) {
        String str1 = "'Evil olive'";
        String str2 = "'evilo livE'";
        StringBuilder sb = new StringBuilder(str2).reverse();
        if (str1.equals(sb.toString()))
            System.out.println(str1 + " matches the inverted  " + str2 +": yes");
        else
            System.out.println(str1 + " matches the inverted " + str2 +": no");
    }
}