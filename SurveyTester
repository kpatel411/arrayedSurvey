//import java.util.Scanner;

public class SurveyTester {

	public void timeAssoc() {
		GenericQueue<SurveyQuesAns> survey = new GenericQueue<SurveyQuesAns>();
		
		SurveyQuesAns a = new TimeAssocQues("prompt" , "a", "l");
		SurveyQuesAns b = new TimeAssocQues("prompt" , "a", "l");
		
		survey.enqueue(a);
		survey.enqueue(b);
	}
	
	public void yesNoQues() {
		GenericQueue<SurveyQuesAns> survey = new GenericQueue<SurveyQuesAns>();
		
		SurveyQuesAns a = new YNQues("prompt" , "a");
		SurveyQuesAns b = new YNQues("prompt" , "a");
		
		survey.enqueue(a);
		survey.enqueue(b);
	}
	
	public void disAgreeQues() {
		GenericQueue<SurveyQuesAns> survey = new GenericQueue<SurveyQuesAns>();
		
		SurveyQuesAns a = new DAQues("prompt" , "a");
		SurveyQuesAns b = new DAQues("prompt" , "a");
		
		survey.enqueue(a);
		survey.enqueue(b);
	}
	
	public void scaleQuestion() {
		GenericQueue<SurveyQuesAns> survey = new GenericQueue<SurveyQuesAns>();
		
		SurveyQuesAns a = new ScaleQues("prompt" , "a");
		SurveyQuesAns b = new ScaleQues("prompt" , "a");
		
		survey.enqueue(a);
		survey.enqueue(b);
	}
	public static void main(String [] args) {
		SurveyTester test = new SurveyTester();
		test.timeAssoc();
		test.yesNoQues();
		test.disAgreeQues();
		test.scaleQuestion();
		
		
		// adminster the survey
		
		//create an array to store answer (same size as queue)
		//int surveyArray[] = new int[10];
		//create a scanner
		//Scanner scan = new Scanner(System.in);
		//String input = scan.nextLine();
		//create and index ini to 0
		//int index = 0;
		//while the queue is not empty
		//while (surveyArray != 0 ) {
			//dequeue an item and save to a variable 
			//call ask question on the variable; pass the scanner as input
			//add variable to array (countIndex)
			//increment index
			//index++;
		//}
		//print responses 
	
	}
}
