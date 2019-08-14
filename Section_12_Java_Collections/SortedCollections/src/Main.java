import java.util.Map;

public class Main {
    // This project creates a mock shopping basket that items from the store
    // can be added to. The items come from the stocklist that is made up of
    // stock items. This project uses the features of the Map interface to keep
    // track of the store items.

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	    StockItem temp = new StockItem("bread", 0.86, 100);
	    stockList.addStock(temp);

	    temp = new StockItem("cake", 1.1, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.5, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.5, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.5, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.4, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket mikaylasBasket = new Basket("Mikayla");
        sellItem(mikaylasBasket, "car", 1);
        System.out.println(mikaylasBasket);

        sellItem(mikaylasBasket, "car", 1);
        System.out.println(mikaylasBasket);

        sellItem(mikaylasBasket, "car", 1);
        sellItem(mikaylasBasket, "spam", 1);
        System.out.println(mikaylasBasket);

        sellItem(mikaylasBasket, "juice", 4);
        sellItem(mikaylasBasket, "cup", 12);
        sellItem(mikaylasBasket, "bread", 1);
        System.out.println(mikaylasBasket);
        System.out.println(stockList);
        for (Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
