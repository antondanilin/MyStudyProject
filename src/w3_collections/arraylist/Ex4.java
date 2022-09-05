package w3_collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("cat");
        myList.add("dog");
        myList.add("swine");

        System.out.println(myList);

        retrieveElementAtSpecifiedIndex(myList, 1);
    }

    static <T> void retrieveElementAtSpecifiedIndex(List<T> arrList, int idx ){
        System.out.println(arrList.get(idx));

    }
}