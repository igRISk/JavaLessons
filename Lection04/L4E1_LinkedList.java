// LinkedList:
// Представляет собой двусвязный список.



package Lection04;

import java.util.LinkedList;

public class L4E1_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);                         // [1, 2, 3]
    }
}
