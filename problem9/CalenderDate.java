package problem9;

public class CalenderDate {

    private int month;
    private int date;
    private int year;


    public CalenderDate (int month, int date, int year) throws InvalidDateException{

        if (month < 1 || month > 12) {
            throw new InvalidDateException("Invalid month: " + month);
        }

        if (date < 1 || date > 31) {
            throw new InvalidDateException("Invalid date: " + date);
        }

        this.month = month;
        this.date = date;
        this.year = year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDate() {
        return this.date;
    }

    public int getYear() {
        return this.year;
    }

    public int compareTo(CalenderDate date) {
        if (this.year != date.year) {
            return Integer.compare(this.year, date.year);
        }
        else if (this.month != date.month) {
            return Integer.compare(this.month, date.month);
        }
        else {
            return Integer.compare(this.date, date.date);
        }
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", month, date, year);
    }
}
