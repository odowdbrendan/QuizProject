//Defines a short answer question. 

package edu.unca.csci201;

public class ShortAnswer implements Question {

	private String q;
	private String correctAnswer;

	public ShortAnswer (String question, String answer) {
		this.q = question;
		this.correctAnswer = answer;
	}

	public String getQuestion() {
		return q;
	}

	public boolean isCorrectAnswer(String answer) {
		return correctAnswer.equals(answer);
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

}
