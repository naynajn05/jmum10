package com.tnsif.multithreadingdemo;

public class ChildThread extends Thread{
	
	private int no;
	private String msg;
	
	
	public ChildThread(int no, String msg) {
		
		this.no = no;
		this.msg = msg;
	}
	
	@Override
	public void run()
	{
		for(int i=1;i<=no;i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println("Error ocurred "+e.getMessage());
			}
		System.out.println(msg+i+Thread.currentThread().getName());
		}
		
	}
	

}
