/**
* More about class String
*/



public class L1E12_String {
    public static void main(String[] args) {
        String strOne = "ABCDEF";
        strOne += "GHIJ";
        System.out.println(strOne);                     // ABCDEFGHIJ
        String strTwo = strOne.toLowerCase();
        System.out.println(strTwo);                     // abcdefghij
        String strThree = "abcdefghij";
        
        System.out.println(strOne.equals(strThree));    // false
        
        boolean bool = strTwo.equals(strThree);         // нельзя написать trTwo == strThree, это не работает
        System.out.println(bool);                       // true
        
        String strFour = "ABCDEF";
        strFour = strThree;
        System.out.println(strThree);                   // abcdefghij
        System.out.println(strFour);                    // abcdefghij
        strThree = "ABCDEF";
        if (!strThree.equals(strFour)) {
            System.out.println(strThree);               // ABCDEF
            System.out.println(strFour);                // abcdefghij
        }

        String strFive = String.valueOf(bool);          // преобразование значения в строку
        System.out.println(strFive);                    // true
        
        String strSix = "A:B:CD:E";
        System.out.println(strSix);                     // A:B:CD:E
        String[] strSeven = strSix.split(":");
        System.out.println(strSeven[0]+" "+strSeven[1]+" "+strSeven[2]+" "+strSeven[3]);
                                                        // A B CD E
        
        boolean boolThree = strThree.contains("CDE");
        System.out.println(boolThree);                  // true

        String strEight = "Yes! ".repeat(3);
        System.out.println(strEight);                   // Yes! Yes! Yes!

    }
}
