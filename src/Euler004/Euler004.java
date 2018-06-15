package Euler004;

/**
 * @author Alex Hardewig
 * @date 06/14/2018
 */
public class Euler004 {
    //brute force solution


    public long getLargestPalindrome(int numDigits){
        long lowerBound = (long) Math.pow(10, numDigits-1);
        long upperBound = (long) Math.pow(10, numDigits);
        long maxProduct = 0;
        long product;


        for (long i = lowerBound; i < upperBound; i++){
            for (long j = lowerBound; j < upperBound; j++){
                product = i*j;

                if (product > maxProduct && isPalindrome(product)){
                    maxProduct = product;
                }
            }
        }
        return maxProduct;

    }

    private boolean isPalindrome(long product) {
        //only true for even number of digits
        //return product % 11 == 0;

        String test = String.valueOf(product);
        char[] arr = test.toCharArray();
        int j = test.length()-1;


        for (int i = 0; i < test.length()/2; i++){
            if (i >= j){
                continue;
            }
            else if (arr[i] != arr[j]){
                return false;
            }

            j--;

        }
        return true;
    }

}
