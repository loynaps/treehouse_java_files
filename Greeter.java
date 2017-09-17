import java.io.Console;

public class Greeter {
	public static void main(String[] args) {
		Console console = System.console();
		String place = "Loydo Mart";
		console.printf("\n*-----Goodday-----*\n\n");
		String firstName = console.readLine("What is your first name? ");
		console.printf("\nHello! %s Welcome to  %s.\n\n", firstName, place);
	}//clear && javac Greeter.java && java Greeter
}
	