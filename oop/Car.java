package oop;

public class Car {
    public String brand;
    public String color;
    public String model;
    public int speed;
    public int price;

    public void speedUp(int increment) {

        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {

        speed = speed - decrement;
    }

    public void printCarStates(){
        System.out.printf(" Brand: %s %n Color: %s %n Model: %s %n Price: %d %n",brand,color,model,price);
    }
}
