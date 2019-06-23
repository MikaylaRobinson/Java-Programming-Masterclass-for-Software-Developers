public class Car {

    // Examples of fields for a car class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    // Instead of changing the field model to public directly
    // This is a way to access that field
    // Creating a "setter"
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
