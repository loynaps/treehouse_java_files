import java.util.Scanner;

public class ParsingInts2
{
 public static void main(String[] args){
 	Scanner answerToLife = new Scanner(System.in);

 	int answer;
  System.out.print("Please enter your age ");
	answer = answerToLife.nextInt();
	if (answer < 13) {
			//Insert exit code
			System.out.print("Sorry you have to be at least 13 to use this program.\n");
			System.exit(0);
		}
 }
 //clear && javac ParsingInts2.java && java ParsingInts2
}