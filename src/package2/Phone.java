package package2;

public class Phone {

// A class is a blueprint - Every class has 2 things:
//      1 - States
//      2 - Behaviors

    //STATE:
    public String color = "Blue";
    public String manufacturer;
    public double size;
    public int memory;
    public boolean isSmartPhone;

    // Constructor - Every class has a default constructor
    // Constructors help us construct/build an object of that class
    // Constructing and object "Phone" for the class "Phone"
    public Phone(){

    }

    //BEHAVIOURS:
    // call
    public void makeCall(){
        System.out.println("Making a call");
    }

    // text
    public void sendText(){
        System.out.println("Texting...");
    }

    // picture
    public void takePicture(){
        System.out.println("Taking a picture");
    }


}
