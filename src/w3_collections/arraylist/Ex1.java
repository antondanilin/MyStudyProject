package w3_collections.arraylist;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        Ex1 foo = new Ex1();
        foo.ex();

    }

    public void ex (){

        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.add("White");
        colorsList.add("Black");
        colorsList.add("Red");
        colorsList.add("Yellow");

        System.out.println(colorsList);

    }
}
