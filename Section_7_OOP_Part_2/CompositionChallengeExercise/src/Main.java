public class Main {

    public static void main(String[] args) {
	    Oven theOven = new Oven("Large", "250", 80);
	    Fridge theFridge = new Fridge("300", "mid-size", 34);
	    Cabinet theCabinet = new Cabinet(3,"closed");

	    Kitchen theKitchen= new Kitchen(theOven, theFridge, theCabinet);

        theKitchen.powerUpFridge();
        theKitchen.powerUpOven();
    }
}
