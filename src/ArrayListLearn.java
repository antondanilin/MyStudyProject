import java.time.LocalDate;
import java.util.*;

public class ArrayListLearn {
    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<>(3); // 10
//        stringList.add("fisrt");
//        stringList.add("second");
//        stringList.add("third");
//        stringList.add(1,"string");
//        stringList.forEach(System.out::println);
//        System.out.println();
//
//
//        var it = stringList.iterator();
//        it.next();
//        it.remove();
//        stringList.forEach(System.out::println);
//
//        var staff = new LinkedList<String>();
//        staff.add("Amy");
//        staff.add("Bob");
//        staff.add("Carl");
//        var iter = staff.listIterator();
//        iter.next();
//        iter.add("Juliet");
//        System.out.println(staff.toString());
//
//        var sorter = new TreeSet<>();
//        sorter.add("Bob");
//        sorter.add("Amy");
//        sorter.add("Carl");
//        sorter.forEach(System.out::println);

        var pq = new PriorityQueue<LocalDate>();
        pq.add(LocalDate.of(1906, 12, 9)); // G. Hopper
        pq.add(LocalDate.of(1815, 12, 10)); // A. Lovelace
        pq.add(LocalDate.of(1903, 12, 3)); // J. von Neumann
        pq.add(LocalDate.of(1910, 6, 22)); // K. Zuse

        pq.forEach(System.out::println);
        System.out.println();
        while (!pq.isEmpty()) System.out.println(pq.remove());
        pq.forEach(System.out::println);

        ArrayList<String> mylist = new ArrayList<>();



    }
}
