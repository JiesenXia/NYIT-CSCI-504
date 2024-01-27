import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=0;
        int sum=0;
        do {
            System.out.println("Please enter a number");
            n = input.nextInt();
            sum += n;
        }  while(n!=0);
        System.out.println("The sum is " + sum);
    }
}
