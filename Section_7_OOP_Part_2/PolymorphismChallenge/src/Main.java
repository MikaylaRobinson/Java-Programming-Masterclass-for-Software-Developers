import java.util.SplittableRandom;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car started";
    }

    public String accelerate() {
        return "Car accelerated";
    }

    public String brake() {
        return "Car  brakes";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Montego extends Car {

    public Montego(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Montego started";

    }

    @Override
    public String accelerate() {
        return "Montego accelerated";

    }

    @Override
    public String brake() {
        return "Montego brakes";

    }
}

class Civic extends Car {
    public Civic(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Civic started";
    }

    @Override
    public String accelerate() {
        return "Civic accelerated";
    }

    @Override
    public String brake() {
        return "Civic brakes";
    }
}

class F150 extends Car {
    public F150(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "F150 started";
    }

    @Override
    public String accelerate() {
        return "F150 accelerated";
    }

    @Override
    public String brake() {
        return "F150 brakes";
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Montego montego = new Montego("Montego", 6);
        System.out.println(montego.startEngine());
        System.out.println(montego.accelerate());
        System.out.println(montego.brake());

        Civic civic = new Civic("Civic", 4);
        System.out.println(civic.startEngine());
        System.out.println(civic.accelerate());
        System.out.println(civic.brake());

        F150 f150= new F150("F150", 8);
        System.out.println(f150.startEngine());
        System.out.println(f150.accelerate());
        System.out.println(f150.brake());

    }
}
