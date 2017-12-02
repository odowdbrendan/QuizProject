/*

@author Brendan O'Dowd
@Computer Science 201
@Final Project
@12/5/2017

This project defines a quiz system in which there are three different types of questions.  The user types in there answers and at the end
is given a score out of 25. 

 */
package edu.unca.csci201;

public class QuizTime {

	public static void main(String[] args) {

		MultipleChoice question1 = new MultipleChoice("What is 1+1?", "3", "1", "2", "100", "C");
		TrueFalse quesiton2 = new TrueFalse("China has the largest population in the world", "True");
		ShortAnswer question3 = new ShortAnswer("What is my middle name?", "Patrick");

		MultipleChoice question4 = new MultipleChoice("What is the capital of England?", "London", "Paris", "Berlin", "DC", "A");
		TrueFalse question5 = new TrueFalse("Moldova is in Europe.", "True");
		ShortAnswer question6 = new ShortAnswer("What is the name of the singer of 'The A Team' ?", "Ed Sheeran");

		MultipleChoice question7 = new MultipleChoice("What nationality is Lionel Messi?", "English", "Irish", "Brazilian", "Argentinian", "D");
		TrueFalse question8 = new TrueFalse("Leeds United > Real Madrid.", "True");
		ShortAnswer question9 = new ShortAnswer("Name the seventh planet from the sun.", "Uranus");

		MultipleChoice question10 = new MultipleChoice("On the 2011 Czech Republic census, 15,070 people listed their religion as ___", "Harry Potter", "Holy Roman Empire", "Jedi", "Lady Gaga", "C");
		TrueFalse question11 = new TrueFalse("An ear of corn always has an uneven number of rows.", "False");
		ShortAnswer question12 = new ShortAnswer("What is the world's longest river?", "Amazon");

		MultipleChoice question13 = new MultipleChoice("The ____ originated in Croatia.", "Chain Saw", "Ballpoint Pen", "Box Office", "Necktie", "D");
		TrueFalse question14 = new TrueFalse("Arachibutyrophobia is the fear of peanut butter.", "True");
		ShortAnswer question15 = new ShortAnswer("Name the world's largest ocean.", "Pacific");

		MultipleChoice question16 = new MultipleChoice("Between 1900 and 1920, ____ was an Olympic event.", "Sack Race", "Tug of War", "Three Legged Race", "Egg on Spoon", "B");
		TrueFalse question17 = new TrueFalse("People drink more coffee per capita in France than in any other country.", "False");
		ShortAnswer question18 = new ShortAnswer("What is the national anthem of USA?", "Star Spangled Banner");

		MultipleChoice question19 = new MultipleChoice("George Washington insisted his Continental Army be permitted a quart of ____ as part of their daily rations.", "Melted Chocolate", "Gravy", "Goat Milk", "Beer", "D");
		TrueFalse question20 = new TrueFalse("The average gatorade bottle is more expensive than powerade.", "True");
		ShortAnswer question21 = new ShortAnswer("What city was I born in?", "Chicago");

		MultipleChoice question22 = new MultipleChoice("Deipnophobia is the fear of ________.", "Dinner Conversations", "Police", "Cheese", "Women", "A");
		TrueFalse question23 = new TrueFalse("A watermelon is about 55% water by weight.", "False");
		ShortAnswer question24 = new ShortAnswer("How many sides in a triangle (word answer)?", "Three");
		MultipleChoice question25 = new MultipleChoice("What is the greatest football team in the world?", "Chelsea", "MK Dons", "LEEDS UNITED", "Man United", "C");

		Quiz quiz = new Quiz();
		quiz.addQuestion(question1);
		quiz.addQuestion(quesiton2);
		quiz.addQuestion(question3);
		quiz.addQuestion(question4);
		quiz.addQuestion(question5);
		quiz.addQuestion(question6);
		quiz.addQuestion(question7);
		quiz.addQuestion(question8);
		quiz.addQuestion(question9);
		quiz.addQuestion(question10);
		quiz.addQuestion(question11);
		quiz.addQuestion(question12);
		quiz.addQuestion(question13);
		quiz.addQuestion(question14);
		quiz.addQuestion(question15);
		quiz.addQuestion(question16);
		quiz.addQuestion(question17);
		quiz.addQuestion(question18);
		quiz.addQuestion(question19);
		quiz.addQuestion(question20);
		quiz.addQuestion(question21);
		quiz.addQuestion(question22);
		quiz.addQuestion(question23);
		quiz.addQuestion(question24);
		quiz.addQuestion(question25);

		quiz.giveQuiz();

	}
}
