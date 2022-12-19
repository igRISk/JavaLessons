// Collection -> List -> ArrayList ("удобный массив")



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L3E4_ArrayList {
    public static void main(String[] args) {

// Разные способы создания:
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);
        ArrayList<Integer> list4 = new ArrayList<>(list3);

// Пример использования:
        ArrayList list = new ArrayList<>();
        list.add(2809);
        list.add("1234");
        for (Object o : list) {
            System.out.println(o);
        }

        ArrayList<Integer> listInt = new ArrayList<Integer>();
        listInt.add(2809);
        for (Object o : listInt) {
            System.out.println(o);
        }

// Пример хранения дат (дд мм год):
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date= { day, month, year};
        List<Integer> d = Arrays.asList(date);
        System.out.println(d);

        StringBuilder daySB = new StringBuilder("28");
        StringBuilder monthSB = new StringBuilder("9");
        StringBuilder yearSB = new StringBuilder("1990");
        StringBuilder[] dateSB = new StringBuilder[]{ daySB, monthSB, yearSB};
        List<StringBuilder> dSB = Arrays.asList(dateSB);
        System.out.println(dSB);
        dateSB[1] = new StringBuilder("09");
        System.out.println(dSB);       
    }
}