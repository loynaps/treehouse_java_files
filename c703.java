import java.io.Console;
 
public class c703 {
    
  public static void main(String[] args) {
   Console console = System.console();
   
   String response;
			
   do {
  		response = console.readLine("Do you understand do while loops? ");
			} while (response.equals("no") || response.equals("n"));

			//3.Finally, using console.printf print out a formatted string that says "Because you said <response>, you passed the test!"

			//After the loop exits, the following line prints to the console
		console.printf("Because you said %s, you passed the test! \n",response); //task 3
	}
}
