package denis;

public class Ex5 {

    public static void main(String[] args) {

        Ex5 ex5 = new Ex5();
        System.out.println(ex5.determineGroup(65));

    }

    public int determineGroup(int age){
        if (age >= 7 && age <= 13){
            return 1;
        } else if (age >=14 && age <= 17) {
            return 2;
        } else if (age >= 18 && age <= 65) {
            return 3;
        }
        else return -1;
    }


}
