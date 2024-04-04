//executor class
package com.tnsif.multithreadingdemo;

public class RunnableDemo {
	public static void main(String[] args) {
		//UsingRunnable ur = new UsingRunnable(10, 20,"Hello");

		/*
		 * Runnable r1=new Runnable() { //anonymous class public void run() {
		 * System.out.println("Hello students"); }
		 * 
		 * };
		 * 
		 * new Thread(r1).start();
		 */
		
		//lambda Expression
		 Runnable r2=()->System.out.println("Lambda Expression");
		new Thread(r2).start();
		
		 
		 /* // lambda expression runnable = () -> {
		 * System.out.println("Runnable with Lambda Expression"); };
		 * 
		 * new Thread(runnable).start();
		 * 
		 * System.out.println("-------------------------------------------------------")
		 * ; int n=5; runnable = () -> { try { for (int i = 1; i <= n; i++) {
		 * System.out.println("Loop iteration: " + i); Thread.sleep(1000); } } catch
		 * (InterruptedException e) { System.err.println("Task interrupted."); } };
		 * 
		 * // Execute the runnable new Thread(runnable).start();
		 */		 
	}
}