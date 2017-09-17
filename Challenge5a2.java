import java.io.Console;
 
public class Challenge5a2 {
    
   public static void main(String[] args) {
    Console console = System.console();
		//Add an if statement that checks to see if firstExample is equal to secondExample. If it is, print out "first is equal to second".	

		//Add another if statement that checks if the firstExample is equal ignoring case to thirdExample. If it, is print out "first and third are the same ignoring case".
		String firstExample = "hello";
		String secondExample = "hello";
		String thirdExample = "HELLO";

		if (firstExample == secondExample) {
			console.printf("first is equal to second\n");
		}

		if (firstExample.equalsIgnoreCase(thirdExample)) {
			console.printf("first and third are the same ignoring case\n");
		}

		}
	}//clear && javac Challenge5a2.java && java Challenge5a2
 