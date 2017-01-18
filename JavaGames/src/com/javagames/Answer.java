package com.javagames;

public class Answer
{
	static String ans1 = "modify";
	static String ans2 = "add";
	
	public String quizAnswers(int x)
	{
		switch(x)
		{
		case 1:
			return ans1;
		case 2:
			return ans2;
		default:
			return null;
		}
	}
}
