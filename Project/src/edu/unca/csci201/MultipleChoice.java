package edu.unca.csci201;

public class MultipleChoice implements Question {

	//question
	private String q;
	//answer choices
	private String a,b,c,d;
	//correct answer
	private String correctAnswer;

	// constructor
	public MultipleChoice(String question, String A, String B, String C, String D, String answer) {
		this.q = question;
		this.a = A;
		this.b = B;
		this.c = C;
		this.d = D;
		this.correctAnswer = answer;
	}

	public String getQuestion() {
		String multipleChoice = q + "\n A." + a + "\n B." + b + "\n C." + c + "\n D." + d;
		return multipleChoice;
	}

	public boolean isCorrectAnswer(String answer) {
		return correctAnswer.equals(answer);
	}


	public String getCorrectAnswer() {		
		return correctAnswer;
	}

}
