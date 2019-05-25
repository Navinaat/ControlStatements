public class FlourPack {
    public static void main(String[] args)
    {
        int BigCount = 2;
        int SmallCount = 3;
        int Goal = 12;
        System.out.println(canPack(BigCount, SmallCount, Goal));
    }

    public static boolean canPack(int BigCount, int SmallCount, int Goal)
    {
        int b = BigCount * 5;
        int s = SmallCount * 1;
        int g = b + s;
        if (BigCount >= 0 && SmallCount >= 0 && Goal >= 0) {
            if (b <= Goal) {
                if (g >= Goal) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}

