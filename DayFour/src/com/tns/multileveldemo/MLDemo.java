package com.tns.multileveldemo;

public class MLDemo {

	public static void main(String[] args) {
	Word word=new Word();
	word.write("Hellooo ");
	word.display();
	word.formatText(true);
	word.spellCheck();
	word.display();

	}

}
