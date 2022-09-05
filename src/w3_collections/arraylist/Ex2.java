package w3_collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {

        var animals = List.of("cat", "bird", "dolphin");
        iterateTheList(animals);

    }


    static <T> void iterateTheList(List<T> arrList){
        for (T o: arrList
             )
            System.out.println(o);
    }
}
