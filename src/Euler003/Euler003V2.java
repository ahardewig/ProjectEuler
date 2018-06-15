package Euler003;

/**
 * @author Alex Hardewig
 * @date 06/14/2018
 */
public class Euler003V2 {



    public long primeFactorization(long num){
        long divisor;
        while (true){
            divisor = findSmallestFactor(num);

            if (divisor < num){
                num = num / divisor;
            }
            else {
                return num;
            }
        }

    }

    //this will always return a prime number because we start at 2 and increment
    //we will never return 4 bc if divisible by 4 then it is also divisible by 2 and would have
    //return 2 already. Can't return 6 because 2 and 3 would have return already, etc.
    private long findSmallestFactor(long number) {
        long i;
        for (i = 2; i <= Math.sqrt(number);i++){
            if (number % i == 0){
                return i;
            }
        }
        return number;


    }


}
