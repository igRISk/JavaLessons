// Создать строку с текстом, создать стрингбилдер и в него добавить строку наоборот.

public class S2T4_stringSBuilderReverse {
    public static void main(String[] args) {
        String str = "A muza - raba razuma?";
        System.out.println(str);
        StringBuilder sb = new StringBuilder(str).reverse();
        System.out.println(sb);
    }
}
