/**
* Functions and Methods
* 
*   Функции и методы - технически одно и то же.
*   Функции могут не принадлежать классам, а методы принадлежат.
*   в java все функции являются методами.    
*/



public class L1E8_functionsMethods {
    
    static int sum(int a, int b) {
        return a + b;
    }
    static double factor(int n) {
        if (n==1) return 1;
        return n * factor(n-1);
    }

    public static void main(String[] args) {
        L1E8_lib.sayHi();                                         // Hi!
        System.out.println(sum(1, 3));              // 4 
        System.out.println(factor(5));                 // 120
    }
}
