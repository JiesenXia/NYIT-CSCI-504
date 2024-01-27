import java.util.Scanner;
public class tempConv {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + " degrees Fahrenheit is equal to "+ celsius + " degrees Celsius.");
        }
}

