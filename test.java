public class test {
    public static void main(String[] args){
        int num = 37485;
        int reversedNumber = 0;
        while (num!=0) {
            int digit = num % 10;
            reversedNumber = reversedNumber *10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: "+ reversedNumber);
    }
}

