package denis;

public class Ex6 {

    public static void main(String[] args) {
        int[] a =  {34, 33, 42, 22, 5, 6, 6, 1, -3};
        printOddNumbers(a);

    }

    static void printOddNumbers(int[] a){

        StringBuilder result = new StringBuilder();

        for (int i : a) {
            if(i % 2 !=0){
                result.append(i).append(", ");
            }
        }

        result.delete(result.length() - 2, result.length() - 1);

        System.out.println(result);
    }
}
