import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

public class S3T1_ArrayListIteratorComparator {
    int i = 7;
    public static void main(String[] args) {
// Массивы:
        int[] aI = new int[10];
        aI[0] = 4;
        aI[1] = 5;
        Lesson2[] aL = new Lesson2[5];
// Коллекции:
        List array1 = new ArrayList();                     // создается тип Object
        array1.add(1);                                   // Integer
        array1.add(1.5f);                                // Float
        array1.add("One");                               // String
        if (array1.get(0) instanceof String) {}      // производительность снижается драматически
        
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(7);
        array2.add(234);
        array2.add(57);
        array2.add(75);
        array2.add(7);
        System.out.println(array2);                         // [7, 234, 57, 75]
        array2.set(3, 55);
        System.out.println(array2);                         // [7, 234, 57, 55]
        array2.remove(1);
        System.out.println(array2);                         // [7, 57, 55]
        array2.remove(new Integer(7));
        System.out.println(array2);                         // [57, 55]
        int tmp = array2.get(0);
        System.out.println("Element with index 0: " + tmp); // Element with index 0: 57
        array2.size();                                     // возвращает длину списка
        array2.ensureCapacity(100);            // сократить массив до 100 элементов, если в списке меньше элементов
        array2.clear();                                    // почистить массив и сделать кол-во эл-тов = 0

        for (int i = 0; i < 5; i++) {
            array2.add(new Random().nextInt(100));
        }
        System.out.println(array2);

        for (int i: array2){
            i = new Random().nextInt(100);
            System.out.printf("%d ", i);
        }
        System.out.println();

        Iterator<Integer> iterator = array2.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            i = 7;
            System.out.printf("%d ", i);
        }

        for (int i = 0; i < array2.size(); i++) {
            if (i == 1) array2.remove(i);
        }
        System.out.println();
        System.out.println(array2);

        ListIterator<Integer> iterator2 = array2.listIterator(args.length);
        while (iterator2.hasPrevious()) {
            Integer i = iterator2.previous();
            if (i < 50) iterator2.remove();
            System.out.printf("%d ", i);
        }

        array2.forEach(i -> System.out.printf("%d ", i));
        System.out.println();

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer - t1;
            }
        };
        array2.sort(c);
        System.out.println(array2);
    }
}
