package problem9;

public class Main {
    public static void main(String[] args) throws InvalidDateException {

        CalenderDate firstDate = new CalenderDate(3, 11, 2024);
        CalenderDate secondDate = new CalenderDate(3, 12, 2024);
        CalenderDate thirdDate = new CalenderDate(3, 13, 2024);

        int x = firstDate.compareTo(secondDate);
        System.out.println(x);

        System.out.println(thirdDate.toString());
    }
}
