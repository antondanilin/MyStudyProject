package w3_collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("cat");
        myList.add("dog");
        myList.add("swine");

        System.out.println(myList);

        updateSpecificElement(myList, 1, "koza");

        System.out.println(myList);
        
    }

    static <T> void updateSpecificElement(List<T> arrList, int idx, T element ){
        arrList.set(idx, element);

    }
}