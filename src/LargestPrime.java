public class LargestPrime {
    public static void main(String[] args) {
        int num = 754;
        System.out.println(GetLargestPrime(num));
    }

    public static int GetLargestPrime(int num) {
        for (int i = num - 1; i >= 1; i--) {
            if ((num % i == 0) && (isPrime(i))) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num/ 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}