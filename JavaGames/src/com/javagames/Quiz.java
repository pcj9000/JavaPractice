package com.javagames;

public class Quiz
{
	static String quiz1 = "Quiz. Make partial or minor changes to (something)\n";
	static String quiz2 = "Quiz. Join (something) to something else so as to increase the size, number, or amount\n";
	
	String quizCases(int x)
	{
		switch(x)
		{
		case 1:
			return quiz1;
		case 2:
			return quiz2;
		default:
			return null;
		}
	}
}
