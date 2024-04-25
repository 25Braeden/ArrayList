package problem9;
import java.util.*;

public class Bonus {
    public static void main(String[] args) throws InvalidDateException {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<CalenderDate> randomDates = new ArrayList<CalenderDate>();

        System.out.println("Enter how many random dates you want: ");
        int bound = scanner.nextInt();
        for(int i = 0; i < bound; i++) {
             int randDay = random.nextInt(31) + 1;
             int randMonth = random.nextInt(12) + 1;
             int randYear = random.nextInt(9999) + 1;
             randomDates.add(new CalenderDate(randMonth, randDay, randYear));
        }

        ArrayList<CalenderDate> sortedDates = new ArrayList<CalenderDate>(randomDates);
        insertionSort(sortedDates);

        System.out.println("Sorted dates: ");
        for(CalenderDate date : randomDates) {
            System.out.println(date.toString());
        }

        System.out.println("Sorted dates: ");
        for(CalenderDate date : sortedDates) {
            System.out.println(date.toString());
        }

    }
    public static void insertionSort(ArrayList<CalenderDate> dates) {
        for (int i = 1; i < dates.size(); i++) {
            CalenderDate key = dates.get(i);
            int j = i - 1;
            while (j >= 0 && dates.get(j).compareTo(key) > 0) {
                dates.set(j + 1, dates.get(j));
                j--;
            }
            dates.set(j + 1, key);
        }
    }
}
