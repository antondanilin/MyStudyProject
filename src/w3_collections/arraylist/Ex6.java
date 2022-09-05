package w3_collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Ex6 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("cat");
        myList.add("dog");
        myList.add("swine");
        myList.add("lion");
        myList.add("bear");

        System.out.println(myList);

        removeThirdElement(myList);

        System.out.println(myList);
        
    }

    static <T> void removeThirdElement(List<T> arrList){
        arrList.remove(3);

    }
}