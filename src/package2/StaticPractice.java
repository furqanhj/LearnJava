package package2;

public class StaticPractice {

    static String name = "Salim";
    int x = 20;

    // Static variables/methods can be called from static or non-static methods
    // Non-static variables/methods CANNOT be called from static methods

    public static void main(String[] args) {
        System.out.println("main() method: " + name);

        String name = printName();
        System.out.println("printName() method: " + name);

        int product = doMultiplication();
        System.out.println(product);


    }

    public static String printName(){
        return name;
    }

    public static int doMultiplication(){
        int x = 10;
        int y = 1000;
        int z = x * y;

        return z;
    }

}
