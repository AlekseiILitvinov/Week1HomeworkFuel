import java.util.Scanner;

/**
 * Homework for Week 1. Task: write a program, calculating the remaining distance for the car to go from the fuel
 * left and the consumption per 100 km. </br>
 * Ways to improve: add conditional logic to provide the calculations in miles and gallons.
 *
 * @author Aleksei Litvinov
 */
public class Main {
	public static void main(String[] args) {
		int fuelLeft = 33; //default fuel left
		int usagePerHundred = 15; //default fuel consumption

		//Uncomment the lines below for extra interactivity
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Please enter the fuel remaining: ");
//		fuelLeft = scanner.nextInt();
//		System.out.print("Please enter your car's fuel consumption (per 100 km.): ");
//		usagePerHundred = scanner.nextInt();

		int distanceRemaining = fuelLeft * 100 / usagePerHundred;
		System.out.println("With " + fuelLeft + " L of fuel left and " + usagePerHundred + " L used per 100 km Your " +
				"car can travel approximately another " + distanceRemaining + " km.");
		if (distanceRemaining < 50) {
			System.out.println("Please refuel soon!");
		}
	}
}
