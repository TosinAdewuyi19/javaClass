import java.util.Scanner;

public class MBTIPersonalityTest {

    public static void main(String[] args) {
        Scanner mbti = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = mbti.next();
        System.out.println("Answer the questions bellow to determine your personality");
        

        String[][] questions = {
            {"\nA. Expend energy, enjoy groups", "\nB. Conserve energy, enjoy one-on-one"},
            {"\nA. Interpret literally", "\nB. Look for meaning and possibilities"},
            {"\nA. Logical, thinking, questioning", "\nB. Empathetic, feeling, accommodating"},
            {"\nA. Organized, orderly", "\nB. Flexible, adaptable"},
            {"\nA. More outgoing, think out loud", "\nB. More reserved, think to yourself"},
            {"\nA. Practical, realistic, experiential", "\nB. Imaginative, innovative, theoretical"},
            {"\nA. Candid, straight forward, frank", "\nB. Tactful, kind, encouraging"},
            {"\nA. Plan, schedule", "\nB. Unplanned, spontaneous"},
            {"\nA. Seek many tasks, public activities, interaction with others", "\nB. Seek private, solitary activities with quiet to concentrate"},
            {"\nA. Standard, usual, conventional", "\nB. Different, novel, unique"},
            {"\nA. Firm, tend to criticize, hold the line", "\nB. Gentle, tend to appreciate, conciliate"},
            {"\nA. Regulated, structured", "\nB. Easy going, live and let live"},
            {"\nA. External, communicative, express yourself", "\nB. Internal, reticent, keep to yourself"},
            {"\nA. Focus on here and now", " B. Look to the future, global perspective, big picture"},
            {"\nA. Tough-minded, just", "\nB. Tender-hearted, merciful"},
            {"\nA. Preparation, plan ahead", "\nB. Go with the flow, adapt as you go"},
            {"\nA. Active, initiate", "\nB. Reflective, deliberate"},
            {"\nA. Facts, things, what is", "\nB. Ideas, dreams, what would be, philosophical"},
            {"\nA. Matter-of-fact, issue-oriented", "\nB. Sensitive, people-oriented, compassionate"},
            {"\nA. Control, govern", "\nB. Latitude, freedom"}
        };

        int[] counts = new int[4];

        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = i; j < 20; j += 4) {
                System.out.print(questions[j][0] + " " + questions[j][1] + "\nSelect A or B: ");
                String response;
                while (true) {
                    response = mbti.next();
                    if (response.equalsIgnoreCase("A") || response.equalsIgnoreCase("B")) {
                        break;
                    } else {
                        System.out.print("Invalid input. Please select A or B: ");
                    }
                }
                if (response.equalsIgnoreCase("A")) {
                    count++;
                }
            }
            counts[i] = count;
            System.out.println("The number of A selected is: " + count);
            System.out.println("The number of B selected is: " + (5 - count));
            System.out.println();
        }

        String mbtiType =
            (counts[0] > 2 ? "E" : "I") +
            (counts[1] > 2 ? "S" : "N") +
            (counts[2] > 2 ? "T" : "F") +
            (counts[3] > 2 ? "J" : "P");

        System.out.println( name + "Your test result shows hat your MBTI type is: " + mbtiType);

         switch (mbtiType) {
            case "ENFJ":
                System.out.println("E.N.F.J (Protagonist) is a personality type with the Extroverted, Intuitive, Feeling, and Judging traits. They are charismatic and inspiring leaders, often driven to help others realize their potential.");
                break;
            case "ENTJ":
                System.out.println("E.N.T.J (Commander) is a personality type with the Extroverted, Intuitive, Thinking, and Judging traits. Bold and imaginative, they are strong-willed leaders who enjoy organizing and directing people and projects.");
                break;
            case "INFP":
                System.out.println("I.N.F.P (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits. Idealistic and loyal to their values, they are driven by their beliefs and desire to make the world a better place.");
                break;
            case "INTJ":
                System.out.println("I.N.T.J (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. Their inner world is often a private, complex one.");
                break;
            case "ESFJ":
                System.out.println("E.S.F.J (Consul) is a personality type with the Extroverted, Sensing, Feeling, and Judging traits. Caring and social, they have a strong sense of duty and are eager to help others.");
                break;
            case "ESTJ":
                System.out.println("E.S..T.J (Executive) is a personality type with the Extroverted, Sensing, Thinking, and Judging traits. Organized and driven, they focus on results and managing tasks efficiently.");
                break;
            case "ISFP":
                System.out.println("I.S.F.P (Adventurer) is a personality type with the Introverted, Sensing, Feeling, and Prospecting traits. Creative and spontaneous, they value freedom and often express themselves through art and other forms of creativity.");
                break;
            case "ISTP":
                System.out.println("I.S.T.P (Virtuoso) is a personality type with the Introverted, Sensing, Thinking, and Prospecting traits. They tend to have an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed.");
                break;
            case "ENFP":
                System.out.println(".E.N.F.P (Campaigner) is a personality type with the Extroverted, Intuitive, Feeling, and Prospecting traits. Enthusiastic and creative, they have a strong sense of possibility and are driven by their values and ideas.");
                break;
            case "ENTP":
                System.out.println("E.N.T.P (Debater) is a personality type with the Extroverted, Intuitive, Thinking, and Prospecting traits. Quick-witted and clever, they enjoy the challenge of ideas and often think outside the box.");
                break;
            case "INTP":
                System.out.println("I.N.T.P (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. These flexible thinkers enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths, mixing willingness to experiment with personal creativity.");
                break;
            case "ISFJ":
                System.out.println("I.S.F.J (Defender) is a personality type with the Introverted, Sensing, Feeling, and Judging traits. Warm and conscientious, they have a strong sense of duty and take pride in their responsibilities.");
                break;
            case "ISTJ":
                System.out.println("I.S.T.J (Logistician) is a personality type with the Introverted, Sensing, Thinking, and Judging traits. These people tend to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.");
                break;
            case "ESFP":
                System.out.println("E.S.F.P (Entertainer) is a personality type with the Extroverted, Sensing, Feeling, and Prospecting traits. Outgoing and spontaneous, they enjoy life in the moment and often seek new experiences.");
                break;
            case "ESTP":
                System.out.println("E.S.T.P (Entrepreneur) is a personality type with the Extroverted, Sensing, Thinking, and Prospecting traits. Bold and perceptive, they take action to make things happen and enjoy living on the edge.");
                break;
            case "INFJ":
                System.out.println("I.N.F.J (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.");
                break;
            default:
                System.out.println("Your personality type is not recognized.");
                break;

        }
    }
}
