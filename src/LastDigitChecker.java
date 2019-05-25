public class LastDigitChecker
{
    public static void main(String[] args)
    {
        int a=20;
        int b=51;
        int c=11;
        System.out.println(hassamelastdigit(a,b,c));
    }
    public static boolean hassamelastdigit(int a,int b,int c)
    {
        if ((a >= 10 && a <= 1000) && (b >= 10 && b<= 1000)&& (c >= 10 && c<= 1000))
        {
            int n1= a % 10;
            int n2 = b% 10;
            int n3=c%10;
            if (n1 == n2 || n2 == n3 || n3 == n1)
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

