package Euler001;

/**
 *
 * @author Alex Hardewig
 * @date 6/13/18
 */
public class Euler001 {

    public int findSumOfMultiples() {
        int total = 0;
        for (int i = 1; i < 1000; i++){
            if (isMultipleOf3(i) || isMultipleOf5(i)){
                total += i;
            }
        }
        return total;
    }


    private boolean isMultipleOf3(int number){
        return (number % 3 == 0);
    }

    private boolean isMultipleOf5(int number){
        return (number % 5 == 0);
    }

}
