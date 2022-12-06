/**
* Formatted output
*
* Types of specifiers for output:
*   %d: целочисленное значение
*   %x: шестандцатиричное число
*   %f: число с плавающей точкой
*   %e: экспонинциальная форма, например, 3.1415e+01
*   %c: одиночный символ
*   %s: строковое значение
*/



public class L1E6_formattedOutput {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b; 
        String res = a + " + " + b + " = " + c;
        System.out.println(res);

        String s = "qwe";
        int d = 123;
        String q = s + d;                   // 4 строки, вызывает просадку производительности
        System.out.println(q);

        int e = 1, f = 2;
        int g = e + f;
        String rest = String.format("%d + %d = %d \n", e, f, g);
        System.out.printf("%d + %d = %d \n", e, f, g);
        System.out.println(rest);

        float pi = 3.1415f;
        System.out.printf("%f\n", pi);              // 3,141500
        System.out.printf("%.2f\n", pi);            // 3,14
        System.out.printf("%.3f\n", pi);            // 3,141
        System.out.printf("%e\n", pi);              // 3,141500e+00
        System.out.printf("%.2e\n", pi);            // 3,14e+00
        System.out.printf("%.3ef", pi);           // 3,141e+00
    }
}
