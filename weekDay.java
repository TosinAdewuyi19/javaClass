import java.util.Scanner;
public class weekDays {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
System.out.print("Enter a number between 1 and 7: ");
	int day = input.nextInt();
if (day == 1) {
	System.out.print("Monday");
}else if (day == 2) {
	System.out.print("Tuesday");
 
}else if (day == 3) {
	System.out.print("Wednesday");
 
}else if (day == 4) {
	System.out.print("Thursday");
 
}else if (day == 5) {
	System.out.print("Friday");
 
}else if (day == 6) {
	System.out.print("Saturday");
 
}else if (day == 7) {
	System.out.print("Sunday");
}else {
	System.out.print("Please enter a number between 1 and 7");
		}

	}



}
