 * @author Khushi Patel
 *
 */
//import java.util.Timer; 
import java.util.Scanner;


public class TimeAssocQues extends SurveyQuesAns{
	//instance variables
	private long startTime;
	private long stopTime;
	private String correctA;
	private String incorrectA;
	Scanner scan;
	
	
	public TimeAssocQues(String prompt, String answer, String wrong) {
		super(prompt);
		this.startTime = -1;
		this.stopTime = -1;
		this.correctA = answer;
		this.incorrectA = wrong;
	}
	
	//METHODS
	
	public void askQ() {
		//print the prompt
		System.out.println(super.prompt);
		//get start time
		this.start();
		//read what user input and save a response IV
		super.response = scan.nextLine();
		//get stop time
		this.stop();
		System.out.print(this.correctA);
	}
	
	void start() {
		 this.startTime = System.currentTimeMillis();
		 System.out.println("the current start time is: " + this.startTime);
	}
		  
	void stop() {
		 this.stopTime = System.currentTimeMillis();
		 System.out.println("the current stop time is: " + this.stopTime);
	}
	void interact() {
		  System.out.println("Type s + return to start the watch.");
		  String line = scan.nextLine();
		  // actually starts regardless of what is typed
		  this.start();
		  System.out.println("Type s + return to stop the watch.");
		  line = scan.nextLine();
		  // actually starts regardless of what is typed	
		  this.stop();
		  this.elapsedTime();
	  }
	//create a method that shows the time taken/elapsed 
	protected void elapsedTime() {
		long reportTime = stopTime - startTime;
		long totalS = reportTime / 1000;
		long minutes = totalS / 60;
		long seconds = totalS % 60;
		String message = "Your most recent survey time is " + minutes + "minutes and " + seconds
				+ " seconds.";
		System.out.println(message);
	}
	
	public void printResponse() {
		System.out.println(this.response);
		this.elapsedTime();
	}


	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			TimeAssocQues scale = new TimeAssocQues("hi", "1", "p"); //HARD CODED HERE NEEDS TO CHANGE TO USER INPUT
			scale.askQ();
			scale.interact();
			scale.printResponse();
		}
	}
}

