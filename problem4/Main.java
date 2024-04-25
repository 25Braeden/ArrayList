package problem4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> doubleMe = new ArrayList<String>();
        doubleMe.add("bam");
        doubleMe.add("wam");
        doubleMe.add("lam");

        doubleMe = doubleArray(doubleMe);
        System.out.println(doubleMe);
    }

    public static ArrayList<String> doubleArray(ArrayList<String> list) {
        ArrayList<String> doubledList = new ArrayList<String>();
        for (String element : list) {
            doubledList.add(element);
            doubledList.add(element);
        }
        return doubledList;
    }
}