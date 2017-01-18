package com.javagames;

import java.util.*;

public class GameMonitor
{
	static boolean flag = true;
	static boolean flag2 = true;
	static int menu;
	static int score;
	static String ans;
	static String yn;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Quiz quiz = new Quiz();
		Answer answer = new Answer();
		PlayerLevel level = new PlayerLevel();
		while(flag == true)
		{
			score = 0;
			System.out.println("Menu\n1. Game Start\n2. End");
			menu = scan.nextInt();
			if(menu == 1)
			{
				System.out.println("Let's start!!\n");
				flag2 = true;
				while(flag2 == true)
				{
					for(int i = 1; i < 3; i++)
					{
						System.out.print(quiz.quizCases(i));
						ans = scan.next();
						String cases = answer.quizAnswers(i);
						if(ans.equals(cases))
						{
							score ++;
							System.out.println("That's correct!!\n");
							System.out.println("Want some more?(y/n)");
							yn = scan.next();
							if(yn.equals("y"))
							{
								System.out.println("\nAlright!! Do it again!!\n");
							}
							else if(yn.equals("n"))
							{
								System.out.println("OK!\n"+"Your score : "+score+"\nYourLevel : "+level.playerLevel(score));
								System.out.println("\n");
								flag2 = false;
								break;
							}
							else
							{
								System.out.println("Don't get me wrong, mate.\n"+"Your score : "+score+"\nYour Level : "+level.playerLevel(score)+"\nBack to Menu!!\n");
								flag2 = false;
								break;
							}
						}
						else
						{
							score--;
							System.out.println("Nah, minus point!!!");
						}
					}
				}
			}
			else if(menu == 2)
			{
				System.out.println("\nGood bye fellows :)");
				flag = false;
				
			}
			else
			{
				System.out.println("Wrong button, fellows.\nTry again.\n");
			}
		}
	}
}
