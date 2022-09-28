import java.util.Scanner;

public abstract class SurveyQuesAns {
	protected String prompt;
	protected String response;
	
	public SurveyQuesAns(String prompt){  
		this.prompt = prompt;
		this.response = null;
	}
	//ask for question and get the question
	public void askQ(Scanner scan) {
		//print the prompt
		System.out.println(this.prompt);
		//read what user input and save a response IV
		this.response = scan.nextLine();
	}

	//ask for answer to question and get answer
	public void printResponse() {
		System.out.println(this.response);
	}
	
}
