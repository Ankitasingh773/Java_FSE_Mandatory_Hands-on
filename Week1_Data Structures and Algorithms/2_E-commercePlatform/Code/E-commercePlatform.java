import java.util.Arrays;
import java.util.Comparator;

public class Product {
    public String productId;
    public String productName;
    public String category;

    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " | " + productName + " | " + category;
    }
}
public class SearchAlgorithms {
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null; 
    }
    public static Product binarySearch(Product[] products, String targetName) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);

            if (cmp == 0) return products[mid];       
            else if (cmp < 0) low = mid + 1;         
            else high = mid - 1;                     
        }
        return null; 
    }
}
public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P101", "Laptop", "Electronics"),
            new Product("P102", "Shoes", "Footwear"),
            new Product("P103", "Watch", "Accessories"),
            new Product("P104", "Mobile", "Electronics"),
            new Product("P105", "Book", "Stationery")
        };

        Product result1 = SearchAlgorithms.linearSearch(products, "Mobile");
        System.out.println(" Linear Search Result: " + (result1 != null ? result1 : "Not Found"));
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        Product result2 = SearchAlgorithms.binarySearch(products, "Mobile");
        System.out.println(" Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}


    
