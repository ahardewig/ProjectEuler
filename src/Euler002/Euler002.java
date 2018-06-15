package Euler002;

/**
 * @author Alex Hardewig
 * @date 06/13/2018
 */
public class Euler002 {

    public long recursiveFibonnaci(int number){
        long prevprev;
        long previous = 0;
        long current = 1;
        long total = 0;

        while(true){
            if (current >= number){
                return total;
            }

            prevprev = previous;
            previous = current;
            current = previous + prevprev;

            if (current % 2 == 0) {
                total += current;
            }
        }
    }


}
