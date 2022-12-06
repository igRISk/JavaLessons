/**
* Data and variable types
*/



public class L1E1_classes {
    public static void main(String[] args) {
    
        String str = "Hello world";                       // строка (array of char, sequence of characters)
        char sh = str.charAt(0);                   // обриться к символу с индексом [0]
        char ch = '!';                                    // символ (single 16-bit Unicode character)
        char cha = '{';                                   // символ {
        char chb = 123;                                   // символ { по его коду
        byte age = 10;                                    // 8-bit integer, -128 to 127
        short yearbirth = 1984;                           // 16-bit integer, -32,768 to 32,767
        int salary = 700_000;                             // 32-bit integer, -2in31 to 2in31-1
        float e = 2.7f;                                   // single-precision 32-bit floating point (IEEE 754)
        double pi = 3.1415;                               // double-precision 64-bit floating point (IEEE 754)
        boolean flag1 = 123 <= 234;                       // true/false conditions
        boolean flag2 = 123 >= 234 || flag1;              // true
        boolean flag3 = flag1 ^ flag2;                    // false
        char chd = '1';                                   // true
        char chs = 'a';                                   // true
        var i = 123;                                      // неявная типизация (тип данных подставляется при компиляции)

        System.out.print(str);                            // sysout без перевода строки после
        System.out.println(ch);                           // sysout с переводом строки после
        System.out.println(sh);                           // H
        System.out.println(Integer.MAX_VALUE);            // Integer класс обертка для int
        System.out.println(Long.MIN_VALUE);               // Long класс обертка для long
        System.out.println(Character.toUpperCase(chs));   // a -> A

        System.out.println(cha);                          // {
        System.out.println(chb);                          // {
        System.out.println(age);                          // 10
        System.out.println(yearbirth);                    // 1984
        System.out.println(salary);                       // 700000
        System.out.println(e);                            // 2.7
        System.out.println(pi);                           // 3.1415
        System.out.println(flag1);                        // true
        System.out.println(flag2);                        // true
        System.out.println(flag3);                        // false
        
        System.out.println(Character.isDigit(chd));       // true
        System.out.println(Character.isAlphabetic(chs));  // true

        System.out.println(getType(i));                   // Integer

    }



    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}