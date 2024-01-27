import java.util.ArrayList;

public class ArrayListManipulation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = 1; j < 7; j++) {
            list.add(j);
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            } else {
                list.set(i, list.get(i) * list.get(i));
                sum += list.get(i);
            }
        }

        System.out.println("The final sum is " + sum);
    }
}
