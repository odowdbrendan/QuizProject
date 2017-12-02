//This is the Question interface which defines what methods are required from all types of questions

package edu.unca.csci201;

public interface Question {
	public String getQuestion();
	public boolean isCorrectAnswer(String answer);
	public String getCorrectAnswer();
}




