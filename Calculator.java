import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first number?");
        double num1 = input.nextDouble();
        System.out.println("What is the second number?");
        double num2 = input.nextDouble();
        System.out.println("What is the operator? (+,-,*,/)");
        char ope = input.next().charAt(0);
        switch (ope){
            case ('+'):
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;
            case ('-'):
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
            case ('*'):
                System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                break;
            case ('/'):
                System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                break;
            default:
                System.out.println("Operator not recognized");
        }
    }
}
