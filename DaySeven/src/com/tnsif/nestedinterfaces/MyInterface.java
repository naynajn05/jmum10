//Nested Interface
package com.tnsif.nestedinterfaces;

public interface MyInterface {
	 void calculateArea();
	    interface MyInnerInterface {
	       int  id = 20;
	       void print();     
	    }
}