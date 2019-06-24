public class Vehicle {

    private String name;
    private String size;
    private int currentDirection;
    private int currentSpeed;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection = 0;
        this.currentSpeed = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Steering at " + currentDirection);
    }

    public void move(int speed, int direction) {
        currentDirection = direction;
        currentSpeed = speed;
        System.out.println("Vehicle traveling at " + currentSpeed + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void stop() {
        this.currentSpeed = 0;
    }
}
