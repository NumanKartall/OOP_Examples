package workingjava;

public class Working1 {
    public static void main(String[] args) {

        Sample deger1, deger2;

        deger1=new Sample();
        deger2=new Sample();

        deger1.a=31;
        deger1.b=true;

        deger2.a=22;
        deger2.b=false;

        System.out.println(" sayi: " +deger1.a +" durum: " + deger1.b);
        System.out.println(" sayi: " +deger2.a +" durum: " + deger2.b);
    }
}

class Sample{
    int a;
    boolean b;
}

