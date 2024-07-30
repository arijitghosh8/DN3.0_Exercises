public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "T-shirt", "Apparel"),
            new Product("P004", "Jeans", "Apparel"),
            new Product("P005", "Refrigerator", "Home Appliances")
        };

        // Linear Search
        System.out.println("Linear Search:");
        Product result = LinearSearch.linearSearch(products, "P003");
        System.out.println(result != null ? result : "Product not found.");

        // Binary Search
        System.out.println("Binary Search:");
        result = BinarySearch.binarySearch(products, "P003");
        System.out.println(result != null ? result : "Product not found.");
    }
}
