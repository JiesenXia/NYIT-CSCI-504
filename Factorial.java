import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number?");
        int num1 = input.nextInt();
        int ans = calculate(num1);
        System.out.println("The factorial of " + num1 +" is " + ans);
    }
    public static int calculate(int number){
        if (number==1) return 1;
        else return number * calculate(number-1);
    }
}
