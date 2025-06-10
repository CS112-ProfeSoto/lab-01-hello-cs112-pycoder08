public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");

        //TESTING//
        // Test the printVoid method for input 5 
        printVoid(5);

        System.out.println();

        // Test the nextPrime method for input 45 (should print 47)
        int primeInput = 45;
        System.out.println("Next prime after " + primeInput + ": " + nextPrime(primeInput));

        System.out.println();

        // Default die
        Dice defaultDie = new Dice();
        System.out.println("Default die:");
        System.out.println(defaultDie.toString());

        System.out.println();

        //  Die #1 made with full constructor
        Dice fullDie1 = new Dice(6);
        System.out.println("Full constructor die:");
        System.out.println(fullDie1.toString());

        System.out.println();

        //  Die #2 made with full constructor
        Dice fullDie2 = new Dice(8);
        System.out.println("Die to be copied:");
        System.out.println(fullDie2.toString());

        System.out.println();

        // Die #3 made using copy constructor
        Dice copyDie = new Dice(fullDie2);
        System.out.println("Copied die:");
        System.out.println(copyDie.toString());

    }

    /**
     * Prints a simple statement for each iteration in a loop 
     * @param printTimes How many iterations the loop should run for
     */
    public static void printVoid(int printTimes)
    {
        for (int iteration = 0; iteration < printTimes; iteration++)
        {
            System.out.println("Iteration: " + (iteration + 1));
        }
    }

    /**
     * Returns the next prime number for a given input from 0 to 100.
     * @param input An integer input from 0 to 100
     * @return The next prime number greater than the input
     */
    public static int nextPrime(int input)
    {
        int[] primes = new int[26];
        primes[0] = 2;
        primes[1] = 3;
        primes[2] = 5;
        primes[3] = 7;
        primes[4] = 11;
        primes[5] = 13;
        primes[6] = 17;
        primes[7] = 19;
        primes[8] = 23;
        primes[9] = 29;
        primes[10] = 31;
        primes[11] = 37;
        primes[12] = 41;
        primes[13] = 43;
        primes[14] = 47;
        primes[15] = 53;
        primes[16] = 59;
        primes[17] = 61;
        primes[18] = 67;
        primes[19] = 71;
        primes[20] = 73;
        primes[21] = 79;
        primes[22] = 83;
        primes[23] = 89;
        primes[24] = 97;
        primes[25] = 101;
        
        for (int prime = 0; prime < primes.length; prime++)
        {
            if (primes[prime] > input)
            {
                return primes[prime];
            }
        }
        return -1; // Return -1 if no prime found

    }
}