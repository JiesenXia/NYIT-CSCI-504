import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scores = new Scanner(System.in);
        System.out.print("Input 10 student scores");
        double[] arr = new double[10];
        int total =0;
        for (int i = 0; i< 10; i++) {
            arr[i] = scores.nextDouble();
            total += arr[i];
        }
        System.out.println(total/10);
        StringBuilder test1 = new StringBuilder("hello");
        StringBuilder test2 = new StringBuilder("elloh");
        if (test1.length() != test2.length()){
            System.out.println("They are not the same");
        }else{
            for (int i =0; i<test1.length(); i++) {
                test2.replace(test2.indexOf(test1.charAt(i) + ""),test2.indexOf(test1.charAt(i) + "") + 1,"");
            }
            System.out.println(test2.length());
        }
    }
}