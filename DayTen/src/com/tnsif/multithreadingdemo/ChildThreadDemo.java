package com.tnsif.multithreadingdemo;

public class ChildThreadDemo {

	public static void main(String[] args) {
		ChildThread t1=new ChildThread(5,"Hi");
		ChildThread t2=new ChildThread(6,"Hello");
		t1.start();
		//t1.start();  //IllegalThreadStateException
		//t1.run();//single thread program
		//t2.start();
		System.out.println("End of the main method");

	}

}
