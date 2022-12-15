public class S2T3_stringStringBuilder {
    public static void main(String[] args) {
        String s = "Privet!";                                   // String неизменяемый (immutable)
        s += "+123";
        String s1 = "Goodbye!+" + "asd";
        System.out.println(s + " " + s1);                       // Privet!+123 Goodbye!+asd

        StringBuilder strBuilder = new StringBuilder(s);
        strBuilder.append("asd");                           // для постоянных изменений строки (массив)
        System.out.println(strBuilder);                         // Privet!+123asd

        String s2 = strBuilder.toString();                      // преобразование в String
        System.out.println(s2);

        long start = System.currentTimeMillis();                // количество мс с 01.01.1970 на текущ. момент
        for (int i = 0; i < 100000; i++) {
            s += Character.toString(i);
        }
        long timeSpent = System.currentTimeMillis() - start;    // сколько времени было затрачено
        System.out.println("Time spent, ms: " + timeSpent);

        start = System.currentTimeMillis();                     // количество мс с 01.01.1970 на текущ. момент
        for (int i = 0; i < 100000; i++) {
            strBuilder.append(Character.toString(i));
        }
        timeSpent = System.currentTimeMillis() - start;         // сколько времени было затрачено
        System.out.println("Time spent, ms: " + timeSpent);

    }
}
