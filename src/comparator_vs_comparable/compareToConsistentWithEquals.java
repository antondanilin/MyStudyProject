package comparator_vs_comparable;

public class compareToConsistentWithEquals {

    public static void main(String[] args) {
        Product p1 = new Product(1, new String("pastila"));
        Product p2 = new Product(2, "shokolad");
        Product p3 = new Product(1, new String("pastila"));

        System.out.println(p1.compareTo(p2));

        System.out.println(p1.compareTo(p3));
        System.out.println(p1.equals(p3));
    }
}

class Product implements Comparable<Product>{
    int id;
    String name;

    public boolean equals(Object obj){
        if(!(obj instanceof Product other)) {
            return false;
        }

        return this.id == other.id;
    }


    public int compareTo(Product obj){
        return this.name.compareTo(obj.name);

    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
