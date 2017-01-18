package com.javagames;

public class PlayerLevel 
{

	static String level;
	
	public String playerLevel(int x)
	{
		if(x>7)
		{
			level = "Expert!!";
		}
		else if(x>4)
		{
			level = "Intermediate!!";
		}
		else if(x>0)
		{
			level = "Well User!!";
		}
		else
		{
			level = "Go to study more, man!!";
		}
		return level;
	}
}
