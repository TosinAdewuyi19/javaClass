import java.util.Arrays;
import java.util.Scanner;

public class menstrualFlowApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine();
		System.out.println(" ");
		
		System.out.printf("Hello %s, Here is a breif lecture on Menstrual cycle: The menstrual cycle cycle consists of four phases %n", name);
		System.out.println(" ");
		System.out.println("Stage 1: Menstruation: This is a stage where the Uterus lining is shed, usualy last for (3 to 5 days");
		System.out.println(" ");
		System.out.println("Stage 2: Follicular phase: This is a stage where primary follicle develops into a mature Graffian follicle, and the endometrium proliferates.");
		System.out.println(" ");
		System.out.println("Stage 3: Ovulatiry phase: This is the mid-cycle phase when ovulation occours(around da 13-17)");
		System.out.println(" ");
		System.out.println("Stage 4: Luteal phase: In this phase, the follicle that release the egg produces hormone that thicken the ripen of the uterus to get it ready for pregnancy.");
		System.out.println(" ");
		System.out.println("NOTE!!!: Every woman's menstrual cycle is unique, the lengthof each cycle and its phases can vary base on your age and other factors, so it is mportant for you to get familiar with your cycle");
		System.out.println(" ");

        System.out.print("Enter the first day of your last menstrual cycle (DD): ");
        int recentMenstrualDate = input.nextInt();

        System.out.print("Enter the month of your last menstrual cycle (MM): ");
        int previousMenstrualMonth = input.nextInt();

        System.out.print("Enter the year of your last menstrual cycle (YYYY): ");
        int previousMenstrualYear = input.nextInt();

        System.out.print("Enter the length of your menstrual cycle (in days): ");
        int cycleLength = input.nextInt();

        System.out.printf("Hello %s, Welcome to LEGIT MENSTRUAL APP. Here is the summary of your Menstrual cycle:%n", name);
        System.out.println("Your period flow lasts for 5 days.");

        int currentDate = recentMenstrualDate;
        int currentMonth = previousMenstrualMonth;
        int currentYear = previousMenstrualYear;

        for (int count = 0; count < 5; count++) {
            System.out.printf("Day %d: %02d-%02d-%d%n", (count + 1), currentDate, currentMonth, currentYear);
            int[] nextDate = addDays(currentDate, currentMonth, currentYear, 1);
            currentDate = nextDate[0];
            currentMonth = nextDate[1];
            currentYear = nextDate[2];
        }

        int[] ovulationStart = addDays(currentDate, currentMonth, currentYear, 12);
        int[] ovulationEnd = addDays(currentDate, currentMonth, currentYear, 16);

        System.out.println("Ovulation period:");
        System.out.printf("Start: %02d-%02d-%d%n", ovulationStart[0], ovulationStart[1], ovulationStart[2]);
        System.out.printf("End: %02d-%02d-%d%n", ovulationEnd[0], ovulationEnd[1], ovulationEnd[2]);

        int[] nextPeriod = addDays(currentDate, currentMonth, currentYear, cycleLength);

        System.out.println("Your next period will be on:");
        System.out.printf("Predicted Date: %02d-%02d-%d%n", nextPeriod[0], nextPeriod[1], nextPeriod[2]);
    }

    public static int[] addDays(int day, int month, int year, int daysToAdd) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        for (int count = 0; count < daysToAdd; count++) {
            day++;
            if (day > daysInMonth[month - 1]) {
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                    if (isLeapYear(year)) {
                        daysInMonth[1] = 29;
                    }
                }
            }
        }
        return new int[]{day, month, year};
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
