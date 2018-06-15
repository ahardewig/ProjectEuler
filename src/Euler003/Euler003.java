package Euler003;

/**
 * @author Alex Hardewig
 * @date 06/13/2018
 */
public class Euler003 {

    //VERY inefficient solution. See V2


    private boolean isPrime(long num){
        for (long i = 2; i < Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    private boolean isFactor(long i, long num){
        return num % i == 0;
    }


    public long findLargestPrimeFactor(long num){
        for (long i = num; i > 0; i--){
            //System.out.println(i);
            if (isPrime(i) && isFactor(i, num)){
                return i;
            }
        }
        return -1;
    }




}
