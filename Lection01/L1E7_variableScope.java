/**
* Variable scope (область видимости переменных)
*/



public class L1E7_variableScope {
    public static void main(String[] args) {
        int b = 111;
        {
            int a = 222;
            System.out.println(a + b);
        }
        int a = 123;
        System.out.println(a);
    }
}
