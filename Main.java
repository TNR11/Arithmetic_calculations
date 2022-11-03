package task_2;
/**
 * Assignment task 2: Arithmatic Calculation
 * Author: Aadil Imran, 2022
 */
import static java.lang.System.*;
import java.util.*;

public class Main {
	static Scanner input = new Scanner(in);
	public static void circle() {
		out.print("Enter circle radius: "); //Prompting user for input.
		double radius = Double.parseDouble(input.nextLine()); //passing user entered data into variable "radius".
		double area = Math.PI * radius * radius;
		double diameter = 2 * radius;
		double perimeter = Math.PI * diameter;
		String fmt1 = "%-10s%-13s%-10s\n";
		String fmt2 = "%-10.2f%-13.2f%-10.2f";
		out.printf(fmt1, "Radius", "Perimeter", "Area");
		out.println("-".repeat(28));
		out.printf(fmt2, radius, perimeter, area);
	}
	public static void main(String[] args) {
		circle();
		input.close();
	}
}
