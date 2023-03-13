package oop;

public class NesneYonelimliProgramlama {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand="Ford";
        car2.brand="Opel";

        car1.model="Focus";
        car2.model="Combo";

        car1.color="Black";
        car2.color="Gray";

        car1.price=300000;
        car2.price=230000;

        car1.printCarStates();
        System.out.println("-----------------");
        car2.printCarStates();

        car1.speed=100;
        car2.speed=130;

        car1.speedUp(30);
        car2.speedUp(40);

        car1.applyBrakes(10);
        car2.applyBrakes(20);

        System.out.println(car1.speed);
        System.out.println(car2.speed);


    }
}
