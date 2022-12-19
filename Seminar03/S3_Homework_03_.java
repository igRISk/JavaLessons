// Задача 3:
// Вставить элемент в список в первой позиции.

// Задача 4:
// Извлечь элемент (по указанному индексу) из заданного списка.

// Задача 5:
// Обновить определенный элемент списка по заданному индексу.

// Задача 6:
// 

// Задача 7:
// Удалить третий элемент из списка.

// Задача 8:
// Поиска элемента в списке по строке.

// Задача 9:
// Удалить из первого списка все элементы отсутствующие во втором списке.

// *Задача 10:
// Сортировка списка.

// *Задача 11:
// Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList. 



import java.util.ArrayList;
import java.util.Collections;

public class S3_Homework_03_ {
    public static void main(String[] args) {
        ArrayList<String> colorlist = new ArrayList<>();
        colorlist.add("red");
        colorlist.add("orange");
        colorlist.add("yellow");
        colorlist.add("green");
        colorlist.add("blue");
        colorlist.add("indigo");
        colorlist.add("violet");

// Задача 3:
        colorlist.add(0, "white");
        System.out.println(colorlist);
// Задача 4:
        System.out.println("Color with index 1 is: " + colorlist.get(1));
// Задача 5:
        colorlist.set(7, "black");
        System.out.println(colorlist);
// Задача 6:
        colorlist.remove(2);
        System.out.println(colorlist);
// Задача 7:
        String color = "yellow";
        System.out.println("Index of " + color + " is: " + colorlist.indexOf(color));
// Задача 8:
        ArrayList<String> colorlist2 = new ArrayList<>();
        colorlist2.add(colorlist.get(1));
        colorlist2.add(colorlist.get(3));
        colorlist2.add(colorlist.get(5));
        System.out.println(colorlist2);
// Задача 9:
        colorlist.add("red");
        colorlist.add("indigo");
        colorlist.retainAll(colorlist2);
        System.out.println(colorlist);
// Задача 10:
        colorlist2.sort(null);
        System.out.println(colorlist2);
    }
}
