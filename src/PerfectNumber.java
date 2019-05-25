public class PerfectNumber
{
    public static void main(String[] args)
    {
        int num = 8;
        System.out.println(IsPerfectNumber(num));

    }

    public static boolean IsPerfectNumber(int num)
    {
        int total = 0;
        int num1 = num;
        if(num>1){
            for (int i = 1; i <= num; i++)
            {
                if (num % i == 0) {
                    total = total + i;
                    if (num1 == total) {
                        return true;
                    } else {
                        return false;
                    }
                }

            }
        }
        return false;
    }
}






