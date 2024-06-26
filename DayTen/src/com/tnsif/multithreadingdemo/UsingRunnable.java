//Program to define implementable class of Runnable interface
package com.tnsif.multithreadingdemo;

public class UsingRunnable implements Runnable {
	Thread t;
	int h, l;
	String msg;

	public UsingRunnable(int l, int h,String msg) {
		this.h = h;
		this.l = l;
		this.msg = msg;
		t = new Thread(this, "Child Thread");
		t.start();
	}

	@Override
	public void run() {
		for (int i = l;i<=h;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Error " + e.getMessage());
			}
			System.out.println(msg + i);
		}
	}



public static void main(String[] args) {
   Runnable r1 = new Runnable() {
      @Override
      public void run() { // anonymous class
         System.out.println("Runnable with Anonymous Class");
      }
   };
   Runnable r2 = () -> {   // lambda expression
      System.out.println("Runnable with Lambda Expression");
   };
   new Thread(r1).start();
   new Thread(r2).start();
}
}
