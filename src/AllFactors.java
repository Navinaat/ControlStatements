public class AllFactors {
    public static void main(String[] args) {
        int a = 12;
        PrintFactors(a);
    }

    public static void PrintFactors(int a) {
        if (a < 1) {
            System.out.println("invalid number");
        }
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }

    }
}
