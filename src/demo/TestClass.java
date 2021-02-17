package demo;

import package2.DummyClass;
import package2.Phone;

// Class code block begin
public class TestClass {

    // Global Variable
    private int age = 25;


    public static void main(String[] args) {

        // Local Variable
        // Primitive Data Types
        short shortExample = 32767;
        int intExample = 2147483647;
        long longExample = 92234L;
        float temp = 78.213353543f;
        double doubleTemp = 78.213353543;
        byte byteExample = 127;
        char charExample = 'a';
        boolean isNightTime = true;
        boolean isDayTime = false;

        // Non-primitive Data Type
        String name = "Sami";


        // Declaring a variable
        int x;

        // Initializing a variable
        x = 25;

        // Declare & Initialize a variable
        int y = 30;

//        System.out.println(shortExample);
//        System.out.println(intExample);
//        System.out.println(longExample);

        System.out.println(temp);
        System.out.println(doubleTemp);

        // Strongly typed language
        // Must declare data types when you create the variable

        Phone iphone = new Phone();

        iphone.color = "blue";


    }


}
// Class code block end


