package com.tns.multileveldemo;


//Child  class
public class Word extends Wordpad {
	
	private boolean spellCheckEnable;

	public Word() {
		
		this.spellCheckEnable = true;
	}
	
	public void spellCheck()
	{
		if(spellCheckEnable)
		{
			System.out.println("Spell check is enabled");
			
		}else
		{
			System.out.println("Spell check is disabled");
		}
	}
	
	
	
}
