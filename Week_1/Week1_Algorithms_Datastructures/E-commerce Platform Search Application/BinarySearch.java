import java.util.Arrays;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String productId) {
        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId())); // Ensure the array is sorted

        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = products[mid].getProductId().compareTo(productId);

            if (cmp == 0) {
                return products[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
