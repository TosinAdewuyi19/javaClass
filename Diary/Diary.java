import java.util.scanner;
import java.util.ArrayList;
public class userDiary {
	private static String diaryPassword = "defaultPassword";
	private static boolean isLocked = false;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		
		
	while (!exit) {
		System.out.println("User Diary");
		System.out.println("What do you want to do");
		System.out.println("1 to Create Diary");		
		System.out.println("2 to Update Diary");	
		System.out.println("3 to Lock Diary");	
		System.out.println("4 to Unlock Diary");		
		System.out.println("5 to Add Entry");	
		System.out.println("6 to Delete Entry");
		System.out.println("7 to Find Entry by ID");
		System.out.println("8 to Exit");
		System.out.println("Enter your choice: ");
		int choice = input.nextInt();
		input.nextLine();
	
	switch (choice) {
		case 1:
			createDiary(input);
			break;
		case 2:
			updateDiary();
			break;
		case 3:
			lockDiary(input);
			break;
		case 4:
			unlockDiary(input);
			break;
		case 5:
			addEntry();
			break;
		case 6:
			deleteEntry();
			break;
		case 7:
			findEntry();
			break;
		case 8:
			exit = true;
			System.out.println("Exiting....");
			break;
		default:
		System.out.println("Invalide option");
		}
	}
	}
	
	public diary() {
	String[]  entries = new ArrayList<>();
	
	public static void createDiary(Scanner input) {
	System.out.print("Enter Diary ID: ");
	String diaryName = input.nextLine();
	System.out.print("Diary '" + diaryName + "' created.");
	   
	}
	
	public static void updateDiary() {
		if (isLocked){
			System.out.println("Diary is locked. Please enter password to unlock");
			return;
		}
		System.out.println("Update Diary ");
	}
	
	public static void lockDiary(Scanner input) {
		System.out.println("Enter new password to lock the diary: ");
		diaryPassword = input.nextLine();
		isLocked = true;
		System.out.println("Diary locked");
	}
	
	public static void unlockDiary(Scanner input) {
		System.out.println("Enter password to unlock the diary: ");
		String password = input.nextLine();
		if (password.equals(diaryPassword)) {
			isLocked = false;
			System.out.println("Diary unlocked.");
		}else {
			System.out.println("Incorrect password. please enter correct password: ");
		}
	}
	
	public static void addEntry() {
		if (isLocked) {
			System.out.println("Diary is locked. Please enter password to unlock");
			return;
		}
		System.out.println("Add Entry");
	}	
	public static void deleteEntry() {
		if (isLocked) {
			System.out.println("Diary is locked. Please enter password to unlock");
			return;
		}
		System.out.println("Enter Diary Entry to delete ");
	}
	
	public static void findEntry() {
		if (isLocked) {
			System.out.println("Diary is locked. Please enter password to unlock");
			return;
		}
			System.out.println("Find Entry by ID ");
	}


}

	