import java.util.ArrayList;
import java.util.List;
public interface Stock {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
public interface Observer {
    void update(float price);
}
public class StockMarket implements Stock{
    private List<Observer> obs = new ArrayList<>();
    private float stockPrice;
    @Override
    public void registerObserver(Observer o) {
        obs.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        obs.remove(o);
    }
    @Override
    public void notifyObservers() {
        for (Observer o : obs) {
            o.update(stockPrice);
        }
    }
    public void setStockPrice(float newPrice) {
        this.stockPrice = newPrice;
        notifyObservers();
    }
}
public class MobileApp implements Observer{
    @Override
    public void update(float price) {
        System.out.println(" Mobile App: Stock price updated to " + price);
    }
}
public class WebApp implements Observer{
    @Override
    public void update(float price) {
        System.out.println(" Web App: Stock price updated to " + price);
    }
}
public class Main {
    public static void main(String[] args) {
        StockMarket stockMar = new StockMarket();
        Observer mobApp = new MobileApp();
        Observer webApp = new WebApp();
      
        stockMar.registerObserver(mobApp);
        stockMar.registerObserver(webApp);
        System.out.println(" stock price updated to 101.5");
        stockMar.setStockPrice(101.5f);

        System.out.println("\nstock price updated to 104.75");
        stockMar.setStockPrice(104.75f);
    }
}
