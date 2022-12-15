// API: String
//
//      concat():   объединение строк
//      valueOf():  преобразует Object в строковое представление
//      join():     объединяет набор строк в одну с учетом разделителя
//      charAt():   получение символа по индексу
//      indexOF():  первый индекс вхождения подстроки
//      lastIndexOf():  последний индекс вхождения подстроки
//      startsWith()/endsWith():    определяет, начинается/заканчивается ли строка с подстроки
//      replace():  замена одной подстроки на другую
//      
//      trim():         удаляет начальные и конечные пробелы
//      substring():    возвращает подстроку (см. аргументы)
//      toLowerCase()/toUpperCase:  возвращает новую строку в нижнем/верхнем регистре
//      compareTo():    сравнивает 2 строки
//      equals():       сравнивает строки с учетом регистра
//      equalsIgnoreCase(): сравнивает строки без учета регистра
//      regionMatches():    сравнивает подстроки в строках

// * String VS StringBuilder *
//      Много изменений - String
//      Много преобразований - StringBuilder

public class L2E1_String {
    public static void main(String[] args) {

// Способ 1 (медленный):
        String str = "";
        for (int i = 0; i < 100; i++) {
            str += "+";
        }
        System.out.println(str);
// Способ 2 (быстрее в 10-ки, а то и в 100 раз):
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("+");
        }
        System.out.println(sb);

// Преобразования:
        String[] name = {"S", "e", "r", "g","e","y"};
        String sk = "SERGEY KA.";
        System.out.println(sk.toLowerCase());                   // sergey ka.
        System.out.println(String.join("", name));              // Sergey
        System.out.println(String.join("", "S", "e", "r", "g","e","y"));  // Sergey
        System.out.println(String.join(",", "S", "e", "r", "g","e","y")); // S,e,r,g,e,y

    }
}