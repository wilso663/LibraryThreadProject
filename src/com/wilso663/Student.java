package com.wilso663;

import java.util.Random;

public class Student implements Runnable
{

	private int id;
	private Book[] books;
	
	public Student(int id, Book[] books)
	{
		this.id = id;
		this.books = books;
	}
	@Override
	public void run()
	{
		Random rand = new Random();
		
		while(true)
		{
			int bookID = rand.nextInt(Constants.NUMBER_OF_BOOKS);
		
			try
			{
				books[bookID].read(this);
			}	
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
	@Override
	public String toString()
	{
		return "Student"+this.id;
	}
	
}
