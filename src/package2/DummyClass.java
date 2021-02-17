package package2;

public class DummyClass {

    // For a non-static variable/method, you MUST create an object of that class, in order to call it from a static method
    // For a static variable or method, we do not need to create an object to call it. We can just reference it using the class name

    public static void main(String[] args) {

        // Static variables are shared variables for all objects of the class

        // Creating an object of class "Phone"
        // declaration + initialization
        Phone iPhone = new Phone();

        iPhone.color = "Blue";
        iPhone.size = 10.6;
        iPhone.memory = 512;
        iPhone.manufacturer = "Apple";
        iPhone.isSmartPhone = true;


//        System.out.println(iPhone.color);

        iPhone.makeCall();
        iPhone.sendText();
        iPhone.takePicture();

    }
}
