public class CtoFTableDisplay
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        double faren = 0;
        double celsius = 0;

        System.out.printf("\n%10s%12s", "Celsius", "Farenheit");
        System.out.print("\n----------------------");

        for(int x = -100; x <= 100; x++)
        {
            System.out.printf("\n%10d%12.2f", x, CtoF(x));
        }
    }

    public static double CtoF(double celsius)
    {
        return celsius * 9.0/5 + 32;
    }
}
