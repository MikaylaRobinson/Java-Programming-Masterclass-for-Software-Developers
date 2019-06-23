public class Main {

    public static void main(String[] args) {

        // Creating an object of the class Car
        Car porsche = new Car();
        Car holden = new Car();

        // Using the fields we created in the Car class that are set to public
        // porsche.model = "Carrera";

        // Using the method within the car class to set model
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
