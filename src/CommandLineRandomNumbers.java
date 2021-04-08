import java.util.Random;


public class CommandLineRandomNumbers {

    @SuppressWarnings("null")
    public static void main( String args[] ) {
        int arr[] =  new int[10];
        int i = 0;
        int n  = Integer.parseInt(args[0]);

        Random objGenerator = new Random();
        //Create random number 0 - 100
        double randNumber = Math.random();
        double  d = randNumber * 100;


        //Type cast double to int
        int randomInt = (int)d;
        int max = 0;
        int min = 0;

        while (i < n) {
            randomInt = objGenerator.nextInt(100);
            arr[i] = randomInt;
            // System.out.println("Random No : " + randomInt);
            // update expression
            i++;
            if (i > 0) {
                System.out.println("Random No : " + randomInt);

                if (randomInt < arr[0]) {
                    min = randomInt;

                }
            }
            if (randomInt>max) {
                max = randomInt;
            }
        }
        System.out.println("Maximum number: " + max);
        //  System.out.println("Minimum number: " + min);
    }
}