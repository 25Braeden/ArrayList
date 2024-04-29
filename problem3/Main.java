package problem3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Apple");
        stringList.add("Berry");
        stringList.add("Tomato");
        stringList.add("evem");
        stringList.add("Dragonfruit");
        stringList.add("Watermelon");
        for (int i = 0; i < stringList.size(); i++) {
            String tempFruit = stringList.get(i);
            if(tempFruit.length() % 2 == 0) {
                stringList.remove(tempFruit);
                i--;
            }
        }
        System.out.println(stringList);
    }
}
