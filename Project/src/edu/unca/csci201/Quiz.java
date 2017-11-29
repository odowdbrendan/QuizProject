package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {

	//creates an array of 25 questions
	Question [] listOfQuestions;

	//constructor
	public Quiz () {
		listOfQuestions = new Question [25];
	}

	int currentQuestion = 0;
	
	public void addQuestion(Question q) {

		listOfQuestions[currentQuestion] = q;
		currentQuestion++;
	}

	double grade = 0;
	
	public void giveQuiz() {
		System.out.println("Rules of the Quiz: For Multiple Choice Questions type Capital Letter, For Short Answer and True/False answer must start with a capital letter! Good Luck!");
		System.out.println();
		Scanner scan = new Scanner (System.in);

		for (int i=0; i<25; i++) {
			System.out.println(listOfQuestions[i].getQuestion());
			
			String userAnswer = scan.next();
			
			if (listOfQuestions[i].isCorrectAnswer(userAnswer))
				grade++;
		}

		System.out.println("Your score on this quiz was: " + grade/25);
		scan.close();
	}
}
