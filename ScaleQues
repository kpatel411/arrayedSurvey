
import java.util.Scanner;

public class ScaleQues extends SurveyQuesAns {
	String fiveVal;
	String fourVal;
	String threeVal;
	String twoVal;
	String oneVal;
	
	public ScaleQues(String prompt, String answer) {
		super(prompt);
		// TODO Auto-generated constructor stub
		this.fiveVal = "five";
		this.fourVal = "four";
		this.threeVal = "three";
		this.twoVal = "two";
		this.oneVal = "one";
	}
	
	protected void askQ() {
		//Scanner scan = new Scanner(System.in);
		System.out.println("Enter a statement.");
		String statement = this.prompt;
		System.out.println(statement);
	}

	protected void enterStatement() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number word one-five, where one is little statisfaction and five is most statisfaction.");
		String response = scan.nextLine();
		String answer = "";
		if (response == this.fiveVal) {
			answer = this.fiveVal;
			System.out.println(answer);
		}
		else if (response == this.fourVal) {
			answer = this.fourVal;
			System.out.println(answer);
		}
		else if (response == this.threeVal) {
			answer = this.threeVal;
			System.out.println(answer);
		}
		else if (response == this.twoVal) {
			answer = this.twoVal;
			System.out.println(answer);
		}
		else if (response == this.oneVal) {
			answer = this.oneVal;
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
		for (int i = 0; i < 2; i++) {
			ScaleQues scale = new ScaleQues("Hi", "one"); //HARD CODED HERE NEEDS TO CHANGE TO USER INPUT
			scale.askQ();
			scale.enterStatement();
		}
	}
}
