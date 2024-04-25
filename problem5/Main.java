package problem5;

import java.util.*;

public class Main {
    public static ArrayList<Integer> minToFront(ArrayList<Integer> list) {
        if(list == null || list.isEmpty()) {
            return null;
        }
        else {
            Collections.sort(list);
            return list;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(11);
        intList.add(1);
        intList.add(141);
        intList.add(21);
        System.out.println(intList);
        intList = minToFront(intList);
        System.out.println(intList);
    }
}
