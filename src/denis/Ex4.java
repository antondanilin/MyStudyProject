package denis;

import java.math.BigInteger;

public class Ex4 {

    public static void main(String[] args) {
        System.out.println(factorial(6));

    }

    static BigInteger factorial(int num){

        BigInteger k = BigInteger.ONE;
        BigInteger product = BigInteger.ONE;


        while (k.compareTo(BigInteger.valueOf(num)) < 0){
            k = k.add(BigInteger.ONE);
            product = product.multiply(k);
        }

        return product;
    }
}
