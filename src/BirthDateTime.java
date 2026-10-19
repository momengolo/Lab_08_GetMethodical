import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hours = 0;
        int minutes = 0;
        int maxDays = 31;

        year = SafeInput.getRangedInt(in, "Enter the year you were born", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter the month you were born", 1, 12);

        // Only 3 groups here: 31 day months, 30 day months and February
        switch(month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            case 2:
                maxDays = 29;
                break;
        }

        day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, maxDays);
        hours = SafeInput.getRangedInt(in, "Enter the hour you were born", 1, 24);
        minutes = SafeInput.getRangedInt(in, "Enter the minute you were born", 1, 59);

        System.out.printf("\nYou were born on %d/%d/%d at %d:%02d\n", month, day, year, hours, minutes);
    }
}
