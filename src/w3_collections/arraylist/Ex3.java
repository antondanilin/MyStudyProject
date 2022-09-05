package w3_collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("cat");
        myList.add("dog");
        myList.add("swine");

        System.out.println(myList);

        insertElementIntoFirstPosition(myList, "sparrow");

        System.out.println(myList);


    }


    static <T> void insertElementIntoFirstPosition(List<T> arrList, T element ){
        arrList.add(0, element);

    }
}