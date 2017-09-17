import java.io.Console;
 
public class Challenge5a1 {
    
   public static void main(String[] args) {
    Console console = System.console();
		//Add an if statement that checks to see if firstExample is equal to secondExample. If it is, print out "first is equal to second".	
		String firstExample = "hello";
		String secondExample = "hello";
		String thirdExample = "HELLO";

		if (firstExample == secondExample) {
			console.printf("first is equal to second\n");
		}

		}
	}//clear && javac Challenge5a1.java && java Challenge5a1
 