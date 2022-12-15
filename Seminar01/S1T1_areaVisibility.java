// 1. Быстро создать метод: main или psvm
// 2. Видимые во всех методах переменные необходимо объявлять в классе: 
//      static int myVariable
// 3.  public  - поле публичное и его видно со стороны класса S1T1, снаружи
//     private - поле, которое снаружи класса S1T1 не видно



public class S1T1_areaVisibility {

    static int myVariable = 111;                    // чтобы переменная была видна во всех методах
    public int LESSON1_MAX = 1111;                  // переменная, к которой можно обратиться через ининциализацию класса
    public final int LESSON1_MIN = 11;              // константа, нельзя изменить, снаружи через экземпляр класса
    public static final int NUM = 333;              // глобальная переменная
    public int experiment = 555;

    public static void main(String[] args) {
        System.out.println(myVariable);
        newMethod();
        newMethodE(5);
        System.out.println(experiment);
    }

    private static void newMethod() {
        myVariable +=111;
        System.out.println(myVariable);
    }

    private void newMethodE(int experiment) {
        experiment = this.experiment + 5;
        System.out.println(experiment);
        this.experiment = 321;
        System.out.println(this.experiment);
    }
}

