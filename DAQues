
import java.util.Scanner;

public class DAQues extends SurveyQuesAns {
	String threeVal;
	String twoVal;
	String oneVal;
	
	public DAQues(String prompt, String answer) {
		super(prompt);
		// TODO Auto-generated constructor stub
		this.threeVal = "Disagree";
		this.twoVal = "Neutral";
		this.oneVal = "Agree";
	}
	
	protected void askQ() { 
		//Scanner scan = new Scanner(System.in);
		System.out.println("Enter a statement that you either agree, neutral, or disagree.");
		String statement = this.prompt;
		System.out.println(statement);
	}
	
	protected void enterStatement() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1 for Agree, 2 for Neutral, and 3 for Disagree.");
		int userStatement = scan.nextInt();
		String answer = "";
		if (userStatement == 1) {
			answer = this.oneVal;
			System.out.println(answer);
		}
		else if (userStatement == 2) {
			answer = this.twoVal;
			System.out.println(answer);
		}
		else if (userStatement == 3) {
			answer = this.threeVal;
			System.out.println(answer);
		}
		else {
			System.out.println("Input Invalid!");
		}
		
	}
	
	public void printResponse() {
		System.out.println(this.response);
	}
	
	public static void main(String[] args) {
		for (int i =0; i < 2; i++) {
			DAQues da = new DAQues("Hi", "1"); //HARD CODED HERE NEEDS TO CHANGE TO USER INPUT
			da.askQ();
			da.enterStatement();
		}
		
	}

}
