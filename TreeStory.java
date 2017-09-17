import java.io.Console;
 
public class TreeStory {
    
  public static void main(String[] args) {
    Console console = System.console();
    /*  Some terms:
        noun - Person, place or thing
        verb - An action
        adjective - A description used to modify or describe a noun
        Enter your amazing code here!
    */
		String name = console.readLine("Enter your name: ");
		String adjective = console.readLine("Enter an adjective: ");
        //The printf method on console takes multiple parameters therefore the arguments are seperated by commas
		console.printf("%s is very %s. \n", name, adjective);
        //I have just added multiple variables to a format string
		
//clear && javac TreeStory.java && java TreeStory
	}
}
