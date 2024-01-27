import java.util.Scanner;

public class MultipleExceptionsHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = input.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = input.nextInt();
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException) {
            System.out.println("Error: Division by zero");
        } catch (NumberFormatException) {
            System.out.println("Error: Invalid input (non-numeric)");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
