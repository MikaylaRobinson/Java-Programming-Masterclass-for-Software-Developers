public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gearCount;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gearCount, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gearCount = gearCount;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setcurrentGear() changed to " + this.currentGear );
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity() : Velocity " + speed + " and direction " + direction);
        move(speed, direction);
    }

}
