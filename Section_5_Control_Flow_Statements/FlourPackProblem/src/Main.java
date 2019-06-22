public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (((bigCount * 5) + (smallCount)) < goal) {
            return false;
        }

        int bigBagsNeeded = goal / 5;

        // Use all big bags possible to reach goal
        // Then check if small bags will cover the kilos remaining to reach the goal
        if (bigBagsNeeded >= bigCount) {
            int kilosOfBig = bigCount * 5;
            int kilosRemaining = goal - kilosOfBig;
            if (smallCount >= kilosRemaining) {
                return true;
            }

        // When there is a surplus of big bags, use only the ones needed
        // Then check if there are small bags to cover any remainder
        } else if (bigBagsNeeded < bigCount) {
            int kilosOfBig = bigBagsNeeded * 5;
            int kilosRemaining = goal - kilosOfBig;
            if (smallCount >= kilosRemaining) {
                return true;
            }
        }
        return false;
    }
}
