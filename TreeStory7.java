//1-JavaBasics 09-Censoring Words-Looping Until the Value Passes S3V5
import java.io.Console;
 
public class TreeStory7 {
    
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
    String noun;//variable scope
    boolean isInvalidWord;
    do {
	    noun = console.readLine("Enter a noun:  ");
	    isInvalidWord = (noun.equalsIgnoreCase("dork") || 
	    	  										 noun.equalsIgnoreCase("jerk"));
	    if (isInvalidWord) {
	    	console.printf("That language is not allowed. Try again. \n\n");
	    }
	  } while(isInvalidWord);

    String adverb = console.readLine("Enter an adverb:  ");
    String verb = console.readLine("Enter a verb ending with -ing:  ");

    console.printf("\nYour TreeStory:\n---------------\n");
    console.printf("%s is a %s %s. ", name, adjective, noun);
    console.printf("They are always %s %s.\n", adverb, verb);
		
	}//clear && javac TreeStory7.java && java TreeStory7
	/*
		Every time we open up a block of code,
		like we did on the do, It opens up a new variable scope and code run outside of the scope. So see here's the closing here, and
		here's the noun that we're using and see it's outside of that scope.

		So everything that runs outside of that scope can't see the variables declared inside.
	*/
}
