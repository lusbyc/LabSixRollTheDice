import java.util.Scanner;

public class RollTheDice {

	// determines the random value of the first die based on the number
	// of sides
	public static int dieOne(int numSides) {
		return (int) (Math.random() * numSides + 1);
	}

	// determines the random value of the second die based on the number
	// of sides
	public static int dieTwo(int numSides) {
		return (int) (Math.random() * numSides + 1);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String cont = "y";
		int rollCount = 1;

		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println();

		while (cont.equalsIgnoreCase("y")) {

			System.out.println("How many sides does each die have? ");
			int numSides = scan.nextInt();

			System.out.println();
			System.out.println("That's great. Let's Play! ");
			System.out.println();
			System.out.println("Roll " + rollCount + ":");

			System.out.println(dieOne(numSides));
			System.out.println(dieTwo(numSides));
			System.out.println();

			System.out.println("Continue? (y/n)");
			cont = scan.next();

			rollCount++; // incrementally increases the roll count if user continues
			System.out.println();

		}
		scan.close();

		System.out.println("Thanks for Playing!");
	}
}
