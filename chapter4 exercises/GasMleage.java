import java.util.Scanner;
public class GasMilleage {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double totalMiles = 0;
    double totalGallons = 0;

    while (true) {
        System.out.print("Enter miles driven or 0 to quit: ");
        double miles = input.nextInt();
        if (miles == 0) {
           break;
}

        System.out.print("Enter gallons used: ");
        double gallons = input.nextInt();
        double mpg = (double)miles / gallons;
        System.out.printf("Miles per gallon for the trip is: %.2f\n", mpg);
        
        totalMiles += miles;
        totalGallons += gallons;
        double combinedMpg= totalMiles / totalGallons;
    
        System.out.printf("Combined miles per gallon: %.2f%n", combinedMpg);
}

        System.out.println("Program ended.");
	}
}




        
