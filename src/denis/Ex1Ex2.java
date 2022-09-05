package denis;
import java.lang.Math;

public class Ex1Ex2 {
    public static void main(String[] args) {


        //System.out.println(isPowerOfTwoVLob(Integer.parseInt(args[0])));
        System.out.println(sumTrue(2.0001, 2, 4));



    }

    //TODO как написать небольшой тест?
    private static boolean sumTrue(double a, double b, double c){
        double check = a + b;
        double accuracy = Math.pow(10, -4);
        return Math.abs(c - check) <= accuracy;

    }

    private static boolean isPowerOfTwo1(Integer number){

        int absNumber = Math.abs(number);

        return absNumber != 0 && (Integer.highestOneBit(absNumber) == absNumber);

    }

    private static boolean isPowerOfTwoBinaryArithmetic(Integer initialNumber){

        int absNumber = Math.abs(initialNumber);

        return (absNumber * ( absNumber & (absNumber - 1) ) == 0);


    }

    private static boolean isPowerOfTwoVLob(Integer initialNumber){

        int absNumber = Math.abs(initialNumber);

        if (absNumber == 0 || absNumber == 1) return true;

        int k = absNumber;
        while (k % 2 == 0) k = k / 2;

        return k == 1;

        }

    }

