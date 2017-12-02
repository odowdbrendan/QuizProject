//Defines a short answer question

package edu.unca.csci201;

public class TrueFalse implements Question {

	private String q;
	private String correctAnswer;

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
