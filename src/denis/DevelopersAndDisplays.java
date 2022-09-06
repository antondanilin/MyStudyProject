package denis;

public class DevelopersAndDisplays {

    public static void main(String[] args) {

        DevelopersAndDisplays developersAndDisplays = new DevelopersAndDisplays();

        System.out.println(developersAndDisplays.monitorsCounter(10, 4));

    }

    public int monitorsCounter(int monitors, int programmers) {

        return programmers > monitors ? -1 : monitors % programmers;
    }
}
