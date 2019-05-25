public class DiagonalStar
{
    public static void main(String[] args)
    {
        int num1=5;
        PrintSquareStar(num1);
    }
    public static void PrintSquareStar(int num1)
    {
        if(num1>5)
        {
            System.out.println("INVALID VALUE");
        }
        for(int i=1;i<=num1;i++)
        {
            for(int j=1;j<=num1;j++)
            {
                if(i==1||i==num1||j==1||j==num1||i==j||i+j==num1+1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
