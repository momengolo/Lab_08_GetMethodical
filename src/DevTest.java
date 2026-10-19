import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("getNonZeroLenString returned: " + name);

        int anyInt = SafeInput.getInt(in, "Enter any integer");
        System.out.println("getInt returned: " + anyInt);

        double anyDouble = SafeInput.getDouble(in, "Enter any double");
        System.out.println("getDouble returned: " + anyDouble);

        int rangedInt = SafeInput.getRangedInt(in, "Enter an integer in range", 1, 10);
        System.out.println("getRangedInt returned: " + rangedInt);

        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double in range", 1.5, 9.5);
        System.out.println("getRangedDouble returned: " + rangedDouble);

        boolean confirm = SafeInput.getYNConfirm(in, "Do you like this library?");
        System.out.println("getYNConfirm returned: " + confirm);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("getRegExString returned: " + ssn);
    }
}
