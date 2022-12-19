// Итератор:
// Итератор необходим для более гибкой работы с данными.
// Интерфейс Iterator<E> - итератор коллекций.
// Iterator занимает место Enumaeration в Java Collections Framework.
// Итераторы отличаются от перечислений:
//  - позволяют вызывающей стороне удалять элементы из базовой коллекции во время итерации 
//    с четко определенной семантикой
//      hasNext(), next(), remove()
//      ListIterator<E> - из начала в конец и из конца в начало
//      hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)



import java.util.Iterator;
import java.util.List;

public class L3E5_Iterator {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            System.out.println(col.next());
//          col.next();
//          col.remove();
        }
    }
}
