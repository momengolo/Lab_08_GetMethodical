import java.util.Scanner;

public class CheckOut
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        boolean doneCheckingOut = false;
        Scanner in = new Scanner(System.in);
        double itemCost = 0;
        double totalCost = 0;
        int itemCount = 0;  // this is optional

        System.out.println("Check Out:");

        do
        {
            itemCost = getRangedDouble(in, "Enter cost of item ", .50, 9.99);
            totalCost += itemCost;
            itemCount++;

            doneCheckingOut = getYNConfirm(in, "Are you done?");

        }while(!doneCheckingOut);

        System.out.printf("\nYour total for %d items is $%.2f\n", itemCount, totalCost);
    }

    public static double getRangedDouble(Scanner console, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]: ");
            if(console.hasNextDouble())
            {
                retVal = console.nextDouble();
                console.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("\nNumber is out of range [" + low + "-" + high + "]: " + retVal);
                }
            }
            else
            {
                trash = console.nextLine();
                System.out.println("You must enter a double: " + trash);
            }
        }while(!done);

        return retVal;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retVal = true;
        String response = "";
        boolean gotAVal = false;

        do
        {
            System.out.print("\n" + prompt + " [Y/N] ");
            response = pipe.nextLine();
            if(response.equalsIgnoreCase("Y"))
            {
                gotAVal = true;
                retVal = true;
            }
            else if(response.equalsIgnoreCase("N"))
            {
                gotAVal = true;
                retVal = false;
            }
            else
            {
                System.out.println("You must answer [Y/N]! " + response );
            }

        }while(!gotAVal);

        return retVal;
    }
}
