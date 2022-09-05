package w3_collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Ex8 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("cat");
        myList.add("dog");
        myList.add("swine");
        myList.add("lion");
        myList.add("bear");

        System.out.println(myList);

//        System.out.println(searchElement(myList, "cat"));

        System.out.println(myList);
        
    }

    static <T> boolean sortArrayList(List<T> arrList, T element){
        return arrList.contains(element);

    }
}