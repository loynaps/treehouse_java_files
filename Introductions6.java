import java.io.Console;
//The above imports the console type from the java.io package.
//Java packages are used to bundle related functionality and programs.

public class Introductions6  {
    
   public static void main(String[] args) {
    	Console console = System.console();
			//Welcome to the Introductions program! Your code goes here
			// I have imported java.io.Console. It is a variable called console.
			String firstName = console.readLine("What is your name? ");
			//In the above code we recieve input
			//the readline method prints out text then it captures whatever the user types in afterwards.
			//It therefore can be used to prompt the user for input and capture whatever they type
			console.printf("Hello, there %s !!!!\n", firstName);
			console.printf("%s you are now learning how to write Java\n", firstName);
		}

		//I use the below comand in the terminal
		//clear && javac Introductions6.java && java Introductions6
	}
