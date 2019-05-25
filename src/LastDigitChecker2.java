public class LastDigitChecker2 {
    public static void main(String[] args) {
        int x = 25;
        System.out.println(IsValid(x));
    }

    public static boolean IsValid(int x) {
        if (x >= 10 && x <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}