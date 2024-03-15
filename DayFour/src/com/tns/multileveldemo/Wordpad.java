package com.tns.multileveldemo;

public class Wordpad extends Notepad {
	
	private boolean isBold;

	public Wordpad() {
		
		this.isBold = false;
	}
	
	public void formatText(boolean bold)
	{
		if(bold)
		{
		System.out.println("Content is bold");
		}else
		{
			System.out.println("Content is Normal");
		}
		isBold=bold;
	}
	
	public boolean isBold()
	{
		return isBold;
	}
	

}
