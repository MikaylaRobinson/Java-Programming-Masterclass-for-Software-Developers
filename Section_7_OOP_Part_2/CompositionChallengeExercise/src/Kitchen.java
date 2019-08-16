public class Kitchen {

    // This is an example of composition with each object below making up the
    // kitchen. Objects of other classes I created are used as the fields for the
    // larger idea of a kitchen class.
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
