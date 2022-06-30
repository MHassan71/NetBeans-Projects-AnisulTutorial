
package randomTest;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        
        /*Random rand = new Random();
        int randomNumber = rand.nextInt(6) + 5;*/
        
        int randomNumber = (int) (Math.random()*5) + 1;
        System.out.println("Random numbers = " + randomNumber);
    }
}
