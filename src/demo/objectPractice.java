package demo;

public class objectPractice {

        String manufacturer;
        String model;
        int numOfWheels;
        int horsePower;

    void accelerate(){
        System.out.println("Is accelerating");
    }

    void brake () {
        System.out.println("Is braking");
    }

    public static void main(String[] args) {
        objectPractice hondaAccord = new objectPractice();

        hondaAccord.manufacturer = "honda";
        hondaAccord.model = "accord";
        hondaAccord.numOfWheels = 4;
        hondaAccord.horsePower = 180;
        

    }

}
