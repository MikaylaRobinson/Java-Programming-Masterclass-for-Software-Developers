public class Kitchen {

    private Oven theOven;
    private Fridge theFridge;
    private Cabinet theCabinet;

    public Kitchen(Oven theOven, Fridge theFridge, Cabinet theCabinet) {
        this.theOven = theOven;
        this.theFridge = theFridge;
        this.theCabinet = theCabinet;
    }

    public void powerUpFridge() {
        theFridge.powerPressed();
    }

    public void powerUpOven() {
        theOven.powerButtonPressed();
    }

}
