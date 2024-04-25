package problem6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> duplicates = new ArrayList<String>();
        duplicates.add("Apple");
        duplicates.add("Apple");
        duplicates.add("Berry");
        duplicates.add("Berry");
        duplicates.add("Cherry");
        duplicates.add("Cherry");
        System.out.println(duplicates);
        ArrayList<String> noMoreDuplicates = removeDuplicates(duplicates);
        System.out.println(noMoreDuplicates);
    }
    public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        ArrayList<String> uniqueList = new ArrayList<String>();
        if (list.isEmpty()) {
            return null;
        } else {
            for (String element : list) {
                if (!uniqueList.contains(element)) {
                    uniqueList.add(element);
                }
            }
        }
        return uniqueList;
    }
}
