public class IsPalidrom {
    public static void main(String[] args)
    {
       int palin=767;
        System.out.println(NumberPalindrom(palin));
    }

    public static boolean NumberPalindrom(int palin) {
        while (palin > 0) {
            int sum = 0;
            int temp = palin;

            int rem = palin % 10;
            sum = sum * 10 + rem;
            palin = palin % 10;
            if (temp == sum) {
                return true;
            } else

                return false;

        }
        return false;

    }
    }