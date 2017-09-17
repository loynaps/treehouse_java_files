import java.io.Console;
 
public class c702 {
    
  public static void main(String[] args) {
   Console console = System.console();
   
   String response;

   //2.Now continually prompt the user in a do while loop. The loop should continue running as long as the response is No. Don't forget to declare response outside of the do while loop.

   //The do while loop keeps asking the same question until "yes" is entered
   //So we want to keep repeating when "no" is typed
   //Exit the loop when "yes" is entered

    do{
    response = console.readLine("Do you understand do while loops? ");  // "yes" or "no" is stored in the response variable 
    // when someone types "no" the loop repeats
    // when someone types "yes" the loop is exited
    
    }while(response.equalsIgnoreCase("no"));
  }

}
