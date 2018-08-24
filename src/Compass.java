import java.util.Scanner;

public class Compass {

	//private String north;
	//private String east;
	//private String south;
	//private String west;
	//private String playerPos;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean badInput = true;
		int input = 0;
		do {
			System.out.println("Please enter a number");
			try {
				input = Integer.parseInt(sc.nextLine());
				badInput = false;
			} catch (Exception ex) {
				System.out.println("Please enter a valid number");
			}
		} while (badInput);
		System.out.println("Your position is: " + input);
	}
}
