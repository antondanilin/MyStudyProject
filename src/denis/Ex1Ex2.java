package denis;
import java.lang.Math;

public class Ex1Ex2 {
    public static void main(String[] args) {


        //System.out.println(isPowerOfTwoVLob(Integer.parseInt(args[0])));
      //  System.out.println(sumTrue(2.001, 2, 4));
        System.out.println();
        System.out.println(isPowerOfTwo1(-128));
        System.out.println(isPowerOfTwoBinaryArithmetic(0));
        System.out.println(isPowerOfTwoVLob(-64));



    }

    //TODO как написать небольшой тест?
    private static boolean sumTrue(double a, double b, double c){
        return Math.abs(c - (a + b)) <= Math.pow(10, -4);
    }

    private static boolean isPowerOfTwo1(Integer number){


        return Math.abs(number) != 0 && Integer.bitCount(Math.abs(number)) == 1;

    }

    private static boolean isPowerOfTwoBinaryArithmetic(Integer initialNumber){

        int absNumber = Math.abs(initialNumber);

        return  absNumber != 0 && ((absNumber & (absNumber - 1)) == 0);



    }

    private static boolean isPowerOfTwoVLob(Integer initialNumber){

        int absNumber = Math.abs(initialNumber);

        if (absNumber == 1) return true;

        int k = absNumber;
        while (k % 2 == 0 && k != 0) k = k / 2;

        return k == 1;

        }

    }

