public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(true, 50);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printing(4);
        System.out.println("pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

        pagesPrinted = printer.printing(2);

        System.out.println("pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
