import java.util.Scanner;

public class vowel {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a single character");
        char c = input.next().charAt(0);
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("The character is a vowel");
                break;
            default:
                System.out.println("The character is a consonant");
                break;
        }
    }
}
