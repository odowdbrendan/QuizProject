package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {

	//creates an array of 25 questions
	private Question [] listOfQuestions;
	
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

			String userAnswer = scan.nextLine();

			if (listOfQuestions[i].isCorrectAnswer(userAnswer))
				grade++;
		}
		
		double score = grade/25;
		System.out.println("Your score on this quiz was: " + score);
		if (score > 0.90) {
			System.out.println("Awesome Job! You got an A!!");
		} else if (score > 0.8 && score < 0.9) {
			System.out.println("Good Job! You got an B!");
		} else if (score > 0.7 && score < 0.8) {
			System.out.println("Oh dear, you got an C.");
		} else if (score > 0.6 && score < 0.7) {
			System.out.println("Well, you got an D.");
		}else if (score < 0.6) {
			System.out.println("FAIL! You got an F!!");

			scan.close();
		}
	}	
}


