public class Patterns {
public static void main(String[] args) {
System.out.print("Pattern A");

for (int i =1; i <= 5; i++) {
	System.out.print("*".repeat(i));
}

System.out.print("\nPattern B");


for (int i = 1; i <= 5; i++) {
	String stars = "*".repeat(i);
System.out.println(stars + " " + stars);
}

}

}