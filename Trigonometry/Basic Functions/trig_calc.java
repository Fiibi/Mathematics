import java.util.Scanner;

public class trig_calc {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the trigonometry calculator!");
		Scanner scan = new Scanner(System.in);
		
		//Prompt user for which trigonometry function
		System.out.println("What trigonometry function do you want to use? :"
				+ "\n 1	Sine"
				+ "\n 2	Cosine"
				+ "\n 3 Tan"
				+ "\n 4 Sineh"
				+ "\n 5 Cosh"
				+ "\n 6 Tanh"
				+ "\n 7 Arcsine"
				+ "\n 8 Arccosine"
				+ "\n 9 Arctan\n");
		
		int userChoice = scan.nextInt();
		
		
		switch(userChoice){
		
		case 1: sine(); break;
		case 2: cosine(); break;
		case 3: tan(); break;
		case 4: sineh(); break;
		case 5: cosh(); break;
		case 6: tanh(); break;
		case 7: asine(); break;
		case 8: acos(); break;
		case 9: atan(); break;

		
		default: System.out.println("Invalid Choice.\n Exiting");
		}
		
	}

	public static double sine(){
		
			// Ask for user input
			System.out.print("Enter an angle in degrees: ");
				
			// use scanner to read the console input
			Scanner scan = new Scanner(System.in);
				
			// Assign the user to String variable
			String s = scan.nextLine();
				
			// close the scanner object
			scan.close();
				
			// convert the string input to double
			double value = Double.parseDouble(s);
			// convert the value to radians
			double valueRadians = Math.toRadians(value);
				
			// get the sine of the angle
			double sineValue = Math.sin(valueRadians);
			System.out.println("sine of " + s + " is " + sineValue);
			return sineValue;
	}
	
	public static double cosine(){
		
			// Ask for user input
			System.out.print("Enter an angle in degrees: ");
		
			// use scanner to read the console input
			Scanner scan = new Scanner(System.in);
		
			// Assign the user to String variable
			String s = scan.nextLine();
		
			// close the scanner object
			scan.close();
		
			// convert the string input to double
			double value = Double.parseDouble(s);
			// convert the value to radians
			double valueRadians = Math.toRadians(value);
		
			// get the cosine of the angle
			double cosineValue = Math.cos(valueRadians);
			System.out.println("cosine of " + s + " is " + cosineValue);
			return cosineValue;
		
				
	}
	
	public static double tan(){
			
			// Ask for user input
			System.out.print("Enter an angle in degrees: ");
		
			// use scanner to read the console input
			Scanner scan = new Scanner(System.in);
		
			// Assign the user to String variable
			String s = scan.nextLine();
		
			// close the scanner object
			scan.close();
		
			// convert the string input to double
			double value = Double.parseDouble(s);
			// convert the value to radians
			double valueRadians = Math.toRadians(value);
		
			// get the tan of the angle
			double tanValue = Math.tan(valueRadians);
			System.out.println("tan of " + s + " is " + tanValue);
			return tanValue;
	}
	
	public static double sineh(){
			// Ask for user input
			System.out.print("Enter an angle in degrees: ");
		
			// use scanner to read the console input
			Scanner scan = new Scanner(System.in);
		
			// Assign the user to String variable
			String s = scan.nextLine();
		
			// close the scanner object
			scan.close();
		
			// convert the string input to double
			double value = Double.parseDouble(s);
			// convert the value to radians
			double valueRadians = Math.toRadians(value);
		
			// get the sinh of the angle
			double sinehValue = Math.sinh(valueRadians);
			System.out.println("sinh of " + s + " is " + sinehValue);
			return sinehValue;
	}
	
	public static double cosh(){
		
			// Ask for user input
			System.out.print("Enter an angle in degrees: ");
		
			// use scanner to read the console input
			Scanner scan = new Scanner(System.in);
		
			// Assign the user to String variable
			String s = scan.nextLine();
		
			// close the scanner object
			scan.close();
		
			// convert the string input to double
			double value = Double.parseDouble(s);
			// convert the value to radians
			double valueRadians = Math.toRadians(value);
		
			// get the cosh of the angle
			double cosinehValue = Math.cosh(valueRadians);
			System.out.println("cosh of " + s + " is " + cosinehValue);
			return cosinehValue;
	}
	
	
	public static double tanh(){
		
			// Ask for user input
			System.out.print("Enter an angle in degrees: ");
		
			// use scanner to read the console input
			Scanner scan = new Scanner(System.in);
		
			// Assign the user to String variable
			String s = scan.nextLine();
		
			// close the scanner object
			scan.close();
		
			// convert the string input to double
			double value = Double.parseDouble(s);
			// convert the value to radians
			double valueRadians = Math.toRadians(value);
		
			// get the tanh of the angle
			double tanhValue = Math.tanh(valueRadians);
			System.out.println("tanh of " + s + " is " + tanhValue);
			return tanhValue;
	}
	
	public static double asine(){
		
		// Ask for user input
		System.out.print("Enter an angle in degrees: ");
		
		// use scanner to read the console input
		Scanner scan = new Scanner(System.in);
		
		// Assign the user to String variable
		String s = scan.nextLine();
		
		// close the scanner object
		scan.close();
		
		// convert the string input to double
		double value = Double.parseDouble(s);
		// convert the value to radians
		double valueRadians = Math.toRadians(value);
		
		// get the arcsine of the angle
		double asineValue = Math.asin(valueRadians);
		System.out.println("arcsine of " + s + " is " + asineValue);
		return asineValue;
	}
	
	public static double acos(){
		
		// Ask for user input
		System.out.print("Enter an angle in degrees: ");
		
		// use scanner to read the console input
		Scanner scan = new Scanner(System.in);
		
		// Assign the user to String variable
		String s = scan.nextLine();
		
		// close the scanner object
		scan.close();
		
		// convert the string input to double
		double value = Double.parseDouble(s);
		// convert the value to radians
		double valueRadians = Math.toRadians(value);
		
		// get the arccos of the angle
		double acosineValue = Math.acos(valueRadians);
		System.out.println("arccos of " + s + " is " + acosineValue);
		return acosineValue;
	}
		
	public static double atan(){
			
		// Ask for user input
		System.out.print("Enter an angle in degrees: ");
			
		// use scanner to read the console input
		Scanner scan = new Scanner(System.in);
			
		// Assign the user to String variable
		String s = scan.nextLine();
			
		// close the scanner object
		scan.close();
			
		// convert the string input to double
		double value = Double.parseDouble(s);
		// convert the value to radians
		double valueRadians = Math.toRadians(value);
			
		// get the arctan of the angle
		double atanValue = Math.atan(valueRadians);
		System.out.println("arctan of " + s + " is " + atanValue);
		return atanValue;
	}
}

