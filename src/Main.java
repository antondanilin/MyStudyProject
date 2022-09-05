import java.util.Objects;

public class Main {



    public static void main(String[] args) {
        System.out.println("Привет");
    }

    static class Contact{
        int id;
        String name;
        String phone;

        public Contact(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Contact contact)) return false;
            return id == contact.id && name.equals(contact.name) && phone.equals(contact.phone);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, phone);
        }
    }
}
