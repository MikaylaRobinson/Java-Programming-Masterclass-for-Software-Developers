public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getLargestPrime(int number){
        if (number < 2) {
            return -1;
        }

        int finalNumber = 0;
        for (int primeCandidate = 2; primeCandidate <= number; primeCandidate++) {
            if (number % primeCandidate == 0) {
                boolean isPrime = true;
                for (int divisor = 2; divisor < primeCandidate; divisor++)
                {
                    if (primeCandidate % divisor == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    finalNumber = primeCandidate;
                }
            }
        }
        return finalNumber;
    }
}
