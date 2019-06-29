public class Fridge {

    private String powerSupply;
    private String size;
    private int temperature;

    public Fridge(String powerSupply, String size, int temperature) {
        this.powerSupply = powerSupply;
        this.size = size;
        this.temperature = temperature;
    }

    public void powerPressed() {
        System.out.println("Power button pressed");
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getSize() {
        return size;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
