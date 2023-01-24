package workingjava;

public class AirFighterAndPilot {

    public static void main(String[] args) {
        PilotRequirements.pilotAndFighterJetInfo();
    }
}

class PilotRequirements {
    public static void pilotAndFighterJetInfo() {

        Pilot pilot;
        pilot = new Pilot();

        FighterJetFeatures features;
        features = new FighterJetFeatures();

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Information of the pilot candidate:(name - gender - age - height - weight)");
        pilot.name = input.nextLine();
        pilot.gender = input.nextLine();
        pilot.age = input.nextInt();
        pilot.height = input.nextDouble();
        pilot.weight = input.nextDouble();

        System.out.printf("%n Pilot candidate's name: %s %n Pilot candidate's gender: %s %n Pilot candidate's age: %d %n Pilot candidate's height: %.2f %n Pilot candidate's weight: %.2f kg %n Is the pilot G-force resistant?: %s %n", pilot.name, pilot.gender, pilot.age, pilot.height, pilot.weight, pilot.gForce(7));

        System.out.println("------------------------------------");

        FighterJetFeatures.jetModel = "F-16";
        FighterJetFeatures.color = "Dark Gray / Black";
        FighterJetFeatures.length = 15.0;
        FighterJetFeatures.width = 9.45;
        FighterJetFeatures.height = 5.08;
        features.maxSpeed = 2475;

        System.out.println("Features of the F-16C Fighter Aircraft");

        System.out.println("Is it Stealth ?");
        features.isStealth = input.nextBoolean();

        System.out.println("Can it carry a nuclear bomb?");
        features.isCarryNukeBomb = input.nextBoolean();

        System.out.printf("%n Fighter jet name: %s %n Color: %s %n Length: %.2f m %n Width: %.2f m %n Height: %.2f m %n Max Speed: %d km/h %n Stealth feautures: %s %n Carry nuke bomb features: %s %n %n", FighterJetFeatures.jetModel, FighterJetFeatures.color, FighterJetFeatures.length, FighterJetFeatures.width, FighterJetFeatures.height, features.maxSpeed, features.isStealthFeature(), features.isCarryNukeBombFeature());
    }
}

class Pilot {
    public String name;
    public int age;
    public double weight;
    public double height;
    public String gender;
    // public boolean isPlaneFly;

   /* public boolean isfly(){
        if (isPlaneFly){
            System.out.println("Yes Candidate can fly airplane");
        }else{
            System.out.println("No Candidate can't fly airplane");
        }
    }*/
    public String gForce(int Gforce) {

        return Gforce < 8 ? "Yes, can be a pilot."  : "No, can't be a pilot.";
    }
}

class FighterJetFeatures {

    public static String color;
    public static String jetModel;
    public static double length;
    public static double width;
    public static double height;
    public boolean isStealth;
    public boolean isCarryNukeBomb;
    public int maxSpeed;

    public boolean isStealthFeature() {

        if (isStealth) {
            System.out.println("Yes, it's stealth");
        } else {
            System.out.println("No it's not stealth");
        }

        return isStealth;
    }

    public boolean isCarryNukeBombFeature() {

        if (isCarryNukeBomb) {
            System.out.println("yes it can carry nuclear bomb");
        } else {
            System.out.println("No it can't carry nuclear bomb");
        }

        return isCarryNukeBomb;
    }
}
