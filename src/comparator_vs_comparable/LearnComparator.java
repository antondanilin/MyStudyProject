package comparator_vs_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnComparator {

    public static void main(String[] args) {
        Comparator<Duck> byWeight = new Comparator<Duck>() {
            @Override
            public int compare(Duck o1, Duck o2) {
                return o1.getWeight() - o2.getWeight();
            }
        };

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        Collections.sort(ducks);
        System.out.println(ducks);
        Collections.sort(ducks,
                Comparator.comparingInt(Duck::getWeight));

        Collections.sort(ducks, Comparator
                .comparing(Duck::getName)
                .thenComparingInt(Duck::getWeight));

        System.out.println(ducks);

    }
}
