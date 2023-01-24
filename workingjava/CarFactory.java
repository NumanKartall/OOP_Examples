package workingjava;

public class CarFactory {
    public static void main(String[] args) {
                newCar.run();
    }
}

class newCar{
    public static void run(){
        Car car1;
        car1=new Car();

        System.out.printf("Car model: %s %n Car fiyat: %d %n",car1.model,car1.fiyat);

        car1.model="Opel Combo";
        car1.modelYili=2004;
        car1.renk="Gümüs Gri";
        car1.motorHacim=1.7;
        car1.fiyat=178000;

        System.out.printf("Car model: %s %n Car fiyat: %d",car1.model,car1.fiyat);
    }
}

class Car {
    String model;
    int modelYili;
    int fiyat;
   String renk;
   double motorHacim;
}
