import java.util.Scanner;
public class MBTIpersonalityTest {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name: ");
        String name = input.next();
    System.out.print("Answer the questions bellow to determine your personality");

String[][] Questions = {
{" A. Expend energy", "\nB. conserve energy, enjoy one-one"}
{" A. Interpret literally", "\nB. look for meaning and possibility"}
{" A. Logical thinking, questioning", "\nB. empathetic, feeling, accommodating"}
{" A. Organized, orderly", "\nB. flexible, adaptable"}
{" A. More outgoing, think out loud", "\nB. More reserved, think to yourself"}
{" A. Practical, realistic, experiential", "\nB. Imaginative, innovative, theoretical"}
{" A. Candid straight forward, frank", "\nB. Tactful, kind, encouraging"}
{" A. Plan, schedule", "\nB Unplanned, spontaneous"}
{" A. Seek many tasks, public activities, interaction with others", "\nB. Seek private, solitary activities with quiet to concentrate"}
{" A. Standard, usual, conventional" "\nB. Different, novel, unique"} 
{" A. Firm, tend to criticize, hold the line", "\nB. Gentle, tend to appreciate, conciliate"}
{" A. Regulated structured" "\nB. Easygoing, "live" and "let live""}
{" A. External, communicative, express yourself" "\nB. Internal, reticent, keep to yourself"}
{" A. Focus on here-and-now", "\nB. Look to the future, global perspective, "big picture""}
{" A. tough-minded, just", "\nB. tender-hearted, merciful"}
{" A. preparation, plan ahead", "\nB. Go with the, adapt as you go"}
{" A. Active, initiate", "\nB. Reflective, deliberate"}
{" A. Facts things, "what is", "\nB. Ideas, dreams, "what could be", philosophical"}
{" A. Matter of fact, issue oriented", "\nB. Sensitive, people-oriented, compassionate"}
{" A. Control, govern", "\nB. Latitude, freedom"}
};
  


    int[] counts = new int[4];

        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = i; j < 20; j += 4) {
                System.out.print(questions[j][1] + " " + questions[j][2] + "\nSelect A or B: ");
                String response
                while (true) {
                    response = input.next();
                    if (response.equalsIgnoreCase("A") || response.equalsIgnoreCase("B")) {
                        break;
                    } else {
                        System.out.print("Invalid input. Please select A or B: ");
                    }
                    if (response.equalIgnoreCase("A")) {
                        count++;
		}
	}
            counts[i] = count;
            System.out.println("The number of A selected is: " + count);
            System.out.println("The number of B selected is: " + (5 - count));
            
            String mbtiType =
            count[0] > ? "E" : "I" +
            count[1] > ? "S" : "N" +
            count[2] > ? "T" : "F" +
            count[3] > ? "J" : "P" +
        
            System.out.print("Your test result shows that 


	





}

    }  
    