import java.io.Console;
 
public class Introductions5b {
    
   public static void main(String[] args) {
    	Console console = System.console();
			//Welcome to the Introductions program! Your code goes here
			//lets change name from Loyo to Nobuhle
			String firstName = "Nobuhle";
			//above we only changed in one place in order to update both lines below
			console.printf("Hello, my name is %s\n", firstName);
			// % is a format specifyer s stands for string 
			console.printf("%s is learning how to write Java\n", firstName);
			// \n is an escape character
			
		}
		//I use the below comand in the terminal
		//clear && javac Introductions5b.java && java Introductions5b
	}
