import java.util.*;

public class Equals {

    public static void main(String[] args) {
        test1();

    }

    private static void print(Object obj) {
        System.out.println(obj);
    }

    private static void test1() {
        Contact contact1 = new Contact(124, "Vasiliy", "+380681234136");
        Contact contact2 = new Contact(124, "Vasiliy", "+380681234136");

        print(contact1.hashCode());
        print(contact2.hashCode());

        print(contact1.equals(contact2));
    }

    private static void test2() {
        Contact contact1 = new Contact(123, "Vasiliy", "+380681234136");
        Contact contact2 = new Contact(123, "Vasiliy", "+380681234136");

        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(contact1);

        print(contacts.contains(contact2));

        print(contacts.indexOf(contact2));

        contacts.remove(contact2);
        print(contacts.size());

    }

    private static void test3() {
        HashSet<Contact> contacts = new HashSet<>();

        Iterator<Contact> itr = contacts.iterator();

        System.out.println("Исходный HashSet");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        Contact contact1 = new Contact(123, "Vasiliy", "+380681234136");

        contacts.add(contact1);

        itr = contacts.iterator();


        System.out.println("После добавления contact1");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Contact contact2 = new Contact(123, "Vasiliy", "+380681234150");

        contacts.remove(contact2);

        itr = contacts.iterator();


        System.out.println("После удаления contact2");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        contacts.add(contact2);
//
//        System.out.printf("c1 was added? %s, c2 was added? %s \n", addC1, addC2);

        print(contacts.size());


    }

    static class Contact {
        int id;
        String name;
        String phone;

        public Contact(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Contact contact)) return false;

            if (id != contact.id) return false;
            if (!Objects.equals(name, contact.name)) return false;
            return Objects.equals(phone, contact.phone);
        }

        @Override
        public int hashCode() {
            int result = id;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            result = 31 * result + (phone != null ? phone.hashCode() : 0);
            return result;
        }
    }

}
