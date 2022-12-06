/**
* Operations im Java:

*   Присваивание: =
*   Арифметические: *,/,+,-,%,++,--
*   Сравнения: <,>,==,!=,>=,<=
*   Логические: ||,&&,^,!
*   Побитовые: <<,>>,&,|,^
*/



public class L1E2_operations {
    public static void main(String[] args) {
        int a = 123;
        a++;                                        // 124
        System.out.println(a++);                    // 124 (приоритет операции инкремента ниже, чем вывода)
        System.out.println(a);                      // 125 (сначала вывод, потом добавление)
        System.out.println(++a);                    // 126 префиксный инкремент
        a = a-- - --a;
        System.out.println(a);
        a = 126;
        a = --a - a--;
        System.out.println(a);

//      Побитовый сдвиг:
        int b = 8;                                  // 1000 в двоичной системе
        System.out.println(b << 1);                 // 10000 в двоичной системе, или 16

//      Побитовое сравнение:
        a = 5;
        b = 2;
        System.out.println(a | b);                  // 101(5) или 010(2) получается 111(7)
        System.out.println(a & b);                  // 101(5) и 010(2) получается 000(0)
        System.out.println(a ^ b);                  // истина одно из 101(5) или 010(2) получается 111(7)
        String s = "qwer1";                         // len 4, index 0..3
        boolean bb = s.length() >= 5 && s.charAt(4) == '1'; // проверка одного условия, потом другого
        System.out.println(bb);
        boolean bc = s.length() >= 5 & s.charAt(4) == '1'; // проверка обоих условий, обязательная
        System.out.println(bc);

    }
}
