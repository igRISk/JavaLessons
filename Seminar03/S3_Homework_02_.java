// Задача 2:
// Итерация всех элементов списка цветов и добавления к каждому символа '!'.



import java.util.ArrayList;
import java.util.Iterator;

public class S3_Homework_02_ {
    public static void main(String[] args) {
        ArrayList<String> colorlist = new ArrayList<>();
        colorlist.add("red");
        colorlist.add("orange");
        colorlist.add("yellow");
        colorlist.add("green");
        colorlist.add("blue");
        colorlist.add("indigo");
        colorlist.add("violet");
// Способ 1:
        Iterator<String> iterator = colorlist.iterator();
        while (iterator.hasNext()) {
            String i = iterator.next();
            i += "!";
            System.out.printf("%s ", i);
        }
        System.out.println();
// Способ 2:
        colorlist.forEach(i -> System.out.printf("%s! " + "", i));
        System.out.println();
// Способ 3 (если мы действительно хотим изменить list):
        for (int i =0; i < colorlist.size(); i++) {
            String tmp = colorlist.get(i) + "!";
            colorlist.set(i, tmp);
        }
        System.out.println(colorlist);
    }
}