import java.util.Scanner;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double futureValue(double V0, double r, int n) {
        if (n == 0) {
            return V0;
        }
        return futureValue(V0, r, n - 1) * (1 + r);
    }

    // Iterative method to calculate future value
    public static double futureValueIterative(double V0, double r, int n) {
        double result = V0;
        for (int i = 0; i < n; i++) {
            result *= (1 + r);
        }
        return result;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values from the user
        System.out.print("Enter the initial value: ");
        double initialValue = scanner.nextDouble();

        System.out.print("Enter the growth rate (as a decimal): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter the number of periods: ");
        int periods = scanner.nextInt();

        // Calculate future values
        double futureValueRecursive = futureValue(initialValue, growthRate, periods);
        double futureValueIterative = futureValueIterative(initialValue, growthRate, periods);

        // Display results
        System.out.printf("Future Value (Recursive): $%.2f%n", futureValueRecursive);
        System.out.printf("Future Value (Iterative): $%.2f%n", futureValueIterative);

        scanner.close();
    }
}
