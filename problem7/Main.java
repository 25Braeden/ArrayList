package problem7;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberSet = new ArrayList<Integer>();
        do {
            System.out.print("Enter an integer to add to the list: ");
            numberSet.add(scanner.nextInt());
            System.out.println("Add another? (Y/N)");
        } while (!scanner.next().equalsIgnoreCase("n"));

        System.out.println("Enter the lower bound (Inclusive): ");
        int lowerBound = scanner.nextInt();
        System.out.println("Enter the upper bound (Inclusive): ");
        int upperBound = scanner.nextInt();

        System.out.println(numberSet);
        ArrayList<Integer> newNumberSet = removeRange(numberSet, lowerBound, upperBound);
        System.out.println(newNumberSet);

    }
    public static ArrayList<Integer> removeRange (ArrayList<Integer> list, int min, int max) {
        ArrayList<Integer> boundedArrayList = new ArrayList<Integer>();
        if (list.isEmpty()) {
            return null;
        } else {
            for (int num : list) {
                if (num < min || num > max) {
                    boundedArrayList.add(num);
                }
            }
        }
        return boundedArrayList;
    }
}
