import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0, count = 0;
        System.out.println("Enter the Number");
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            sum += num;
            count++;
        }
        if (count == 0)
        {
            System.out.println("sum = " + (int) sum + " " + "avg = 0");
        } else {
            double casting = sum / count;
            System.out.println("sum= " + (int) sum + " " + "avg = " + Math.round(casting));
        }
    }
}