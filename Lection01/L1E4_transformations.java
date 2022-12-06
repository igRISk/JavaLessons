/**
* Variable transformations (from one type to another):
*
*   char -> int -> long/float/double
*   long -> float/double
*   byte -> short -> int -> long/float/double  
*/


public class L1E4_transformations {
    public static void main(String[] args) {
        int i = 123; double d = i;
        System.out.println(i);                          // 123
        System.out.println(d);                          // 123.0

        d = 3.9415; i = (int)d;
        System.out.println(d);                          // 3.1415
        System.out.println(i);                          // 3

        byte b = Byte.parseByte("123");
        System.out.println(b);                          // 123
        
    }
}
