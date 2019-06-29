public class Printer {

    private boolean duplexPrinter;
    private int tonerLevel;
    private int pagesPrinted;

    public Printer(boolean duplexPrinter, int tonerLevel) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.duplexPrinter = duplexPrinter;
        this.pagesPrinted = 0;
    }

    public int printing(int pages) {
        int pagesToPrint = pages;
        if (this.duplexPrinter) {
            pagesToPrint = ((pages / 2) + (pages % 2));
            System.out.println("Printing double-sided");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public void tonerRefill(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 0 && this.tonerLevel + tonerAmount <= 100) {
                this.tonerLevel += tonerAmount;
            }
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
