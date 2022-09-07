package denis;

public class Ex5 {

    public static void main(String[] args) {

        Ex5 ex5 = new Ex5();
        System.out.println(ex5.determineGroup(88));
    }

    public int determineGroup(int age){

        return (age >= 7 && age <= 13)? 1
                        : (age >=14 && age <= 17)? 2
                        : (age >= 18 && age <= 65)? 3
                        : -1;
    }


}
