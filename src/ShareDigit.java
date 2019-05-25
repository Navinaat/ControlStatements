public class ShareDigit {
    public static void main(String[] args) {
        int num1 = 88;
        int num2 = 56;
        System.out.println(hasSharedDigit(num1, num2));
    }

    public static boolean hasSharedDigit(int num1, int num2)
    {
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99))
        {
            int a = num1 / 10;
            int a1 = num1 % 10;
            int b = num2 / 10;
            int b1 = num2 % 10;
            if (a == a1 || a == b || a1 == b1 || b == b1)
            {
                return true;
                }
            else
                {
                    return false;

                }

        }
        return false;
    }
}


