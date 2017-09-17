//1-JavaBasics 07-Using Logical ORs S3V4
import java.io.Console;
 
public class TreeStory6 {
    
  public static void main(String[] args) {
    Console console = System.console();
    /*  Some terms:
    noun - Person, place or thing
    verb - An action
    adjective - A description used to modify or describe a noun
    Enter your amazing code here!
    */
    //__Name__is a __adjective__ __noun__. They are always __adverb__ __verb__.
    String ageAsString = console.readLine("How old are? ");
    int age = Integer.parseInt(ageAsString);//this converts a string to an interger
    //Switching between types is often called type casting
    
    if (age<13) {
       //Insert exit code
       console.printf("Sorry you must be 13 to use this program\n");
       System.exit(0);
       //System is a global system method with a method on it called exit, 
       //The exit method takes arguments for the status code
       //The value 0 means the system exited intentially any other non zero value means otherwise
    }

    String name = console.readLine("Enter a name:  ");
    String adjective = console.readLine("Enter an adjective:  ");
    String noun = console.readLine("Enter a noun:  ");
    if (noun.equalsIgnoreCase("dork") || 
    	  noun.equalsIgnoreCase("jerk") ||
    	  noun.equalsIgnoreCase("nerd")) {
    	console.printf("That language is not allowed. Exiting. \n\n");
    	System.exit(0);
    }
    String adverb = console.readLine("Enter an adverb:  ");
    String verb = console.readLine("Enter a verb ending with -ing:  ");

    console.printf("\nYour TreeStory:\n---------------\n");
    console.printf("%s is a %s %s. ", name, adjective, noun);
    console.printf("They are always %s %s.\n", adverb, verb);
		
	}//clear && javac TreeStory6.java && java TreeStory6
}
