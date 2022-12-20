// Stack (List -> Vector -> Stack)
// Stack представляет собой обработу данных по принципу LIFO
// Расширяет Vector пятью операциями, которые позволяют рассматривать вектор как сект

// Задача: вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3    (1 + 2) * 3
// 1 2 3 * +    1 2 + 3 *



package Lection04;

import java.util.*;
import java.lang.*;

public class L4E3_Stack {
    public static void main(String[] args) {
        var exp = "1 2 3 * +".split(" ");           // 1 + 2 * 3
        int res = 0;
        System.out.println(exp);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            
            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                    break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}
