import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> minToFront(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            int attempts = 0;
            while (!isSorted(list)) {
                Collections.shuffle(list);
                attempts++;
                System.out.println("Attempt: " + attempts);
            }
            return list;
        }
    }

    private static boolean isSorted(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want?");
        int amountOfNumbers = scanner.nextInt();

        System.out.println("What is the upper bound?");
        int upperBound = scanner.nextInt();

        for (int i = 0; i < amountOfNumbers; i++) {
            intList.add(random.nextInt(upperBound));
        }
        System.out.println(intList);
        intList = minToFront(intList);
        System.out.println(intList);
    }
}
