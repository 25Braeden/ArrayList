package problem2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> switchUp = new ArrayList<String>();
        switchUp.add("one");
        switchUp.add("two");
        switchUp.add("three");
        switchUp.add("four");
        switchUp.add("five");
        switchUp.add("six");

        SwitcheRoo(switchUp);

        System.out.println(switchUp);
    }
    public static void SwitcheRoo(ArrayList<String> switchUp) {
        if (switchUp.size() % 2 == 0) {
            for (int i = 0; i < switchUp.size(); i += 2) {
                String temp = switchUp.get(i);
                switchUp.set(i, switchUp.get(i + 1));
                switchUp.set(i + 1, temp);
            }
        } else {
            for (int i = 0; i < switchUp.size() - 1; i += 2) {
                String temp = switchUp.get(i);
                switchUp.set(i, switchUp.get(i + 1));
                switchUp.set(i + 1, temp);
            }
        }
    }
}
