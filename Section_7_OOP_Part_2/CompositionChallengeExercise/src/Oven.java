public class Oven {

    private String size;
    private String powerSupply;
    private int temperature;

    public Oven(String size, String powerSupply, int temperature) {
        this.size = size;
        this.powerSupply = powerSupply;
        this.temperature = temperature;
    }

    public void powerButtonPressed() {
        System.out.println("Power pressed");
    }

    public String getSize() {
        return size;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
