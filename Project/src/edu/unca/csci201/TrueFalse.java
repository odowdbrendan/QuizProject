package edu.unca.csci201;

public class TrueFalse implements Question {

	String q;
	String correctAnswer;

	//constructor
	public TrueFalse (String question, String answer) {
		this.q = question;
		this.correctAnswer = answer;
	}

	public String getQuestion() {
		return "True or False:  " + q;
	}

	public boolean isCorrectAnswer(String answer) {
		return correctAnswer.equals(answer);
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

}
