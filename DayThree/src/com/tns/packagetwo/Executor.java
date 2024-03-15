package com.tns.packagetwo;

import com.tns.packageone.Base;


public class Executor extends Base{
	
	public static void main(String[] args) {
		Executor e=new Executor();
	//	e.intDefault=34;
		e.intProtected=12;
		e.intPublic=90;
		
		e.protectedMethod();
		e.publicMethod();
		//e.defaultmethod();
		
		//e.privateMethod();
				
	}
}
