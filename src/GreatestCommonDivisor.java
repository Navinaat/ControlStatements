public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int first = 7;
        int second = 5;

        System.out.println(getgreatestcommondivisor(first, second));
    }

    public static int getgreatestcommondivisor(int first, int second) {
        int a;
        if (first >= 0 && second >= 10) {
            int count = 0;
            for (int i = 2; i <= GreatestCommonDivisor(first, second); i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    count = i;
                }
                count = i;
            }
            return count;
        }
        return -1;
    }
    public static int GreatestCommonDivisor(int num1,int num2)

    {
        if(num1>num2)
        {
            return num2;
        }
        return num1;

   }

}





