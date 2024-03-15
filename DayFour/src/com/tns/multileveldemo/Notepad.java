package com.tns.multileveldemo;

public class Notepad {
	
	protected String content;

	public Notepad() {
		
		this.content = "";
	}
	
	public void write(String text)
	{
		content=text;
		//System.out.println(content+text);
	}
	
	public void display()
	{
		System.out.println("content is "+content);
	}


}
