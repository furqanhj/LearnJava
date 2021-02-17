package demo;

public class MethodPractice {

    // Global Variables (Instance variables - Declared outside of all methods)
    static int a = 10;
    static int b = 27;

    // Local Variables (Declared inside of a method - Only able to be accessed by that method)

    public static void main(String[] args) {
        System.out.println(addition());
//        System.out.println(division());

    }

        public static int addition() {
            int z = getNumberA() + getNumberB();

            return z;
        }

        public static double division() {
            int c = 0;

            return c;
        }

        public static int getNumberA() {
            return a;
        }

        public static int getNumberB() {
            return b;
        }





    // Sole responsibility
    // Methods are responsible for doing one thing


    /*
    ACCESS MODIFIERS
     */
    // public - Global access
    // protected - Confined within the same package
    // private - Only accessible within the same class

    /*
    RETURN TYPE
     */
    // 2 different types of methods
    //  1 - Method that performs an action (void)
    //  2 - Method that returns a value (int/double/String/float etc...)


}
