import java.util.Scanner;
public class ReverseTimeTable {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean options = true;
        while (options) {
            System.out.println("Menu: ");
            System.out.println("1) Add");
            System.out.println("2) View");
            System.out.println("3) Delete");
            System.out.println("4) Quit");
            System.out.println("Choose an option: ");
                int choice = input.nextInt();
switch (choice) {
    case 1:
        System.out.println("You selected Add.");
        break;
case 2:
        System.out.println("You selected View.");
        break;
case 3:
        System.out.println("You selected Delete.");
        break;
case 4:
        System.out.println("You selected Quit. Qiuting...");
        boolean option = false;
        break;
        default:
        System.out.println("Invalid choice. Please choose again.");
       


		}
	}
}

	}

