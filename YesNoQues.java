
import java.util.Scanner;

public class YNQues extends SurveyQuesAns {

	public YNQues(String prompt, String answer) {
		super(prompt);
		// TODO Auto-generated constructor stub
	}
	
	protected void askQ() { 
		//Scanner scan = new Scanner(System.in);
		System.out.println("Enter a statement.");
		String statement = this.prompt;
		System.out.println(statement);
		
	}
	
	protected void enterStatement() {
		String userAnswer; 
		Scanner scnr = new Scanner(System.in);
		System.out.println("Respond with yes or no to the statement.");
		String input = scnr.nextLine();
			
		if (input == "yes") {
			userAnswer = "Yes";
			//System.out.print("yes");
		}
		else if (input == "no") {
			userAnswer = "No";
			//System.out.print("no");
		}
		else {
			userAnswer = "Invalid Response"; 
			//System.out.print("Invalid Response");
		}
		System.out.println(userAnswer);
		
	}
	
	public void printResponse() {
		System.out.println(this.response);
	}
	
	
	public static void main(String[] args) {
		for (int i =0; i < 2; i++) {
			YNQues yn = new YNQues("", "yes"); //HARD CODED HERE NEEDS TO CHANGE TO USER INPUT
			yn.askQ();
			yn.enterStatement();
		}
		
	}
}
