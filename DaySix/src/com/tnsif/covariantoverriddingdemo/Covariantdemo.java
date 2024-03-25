package com.tnsif.covariantoverriddingdemo;

 class Color
{
	public Color getColor()
	{
		Color c=new Color();
		return c;
				
	}
}

 class Red extends Color
 {
	 public Red getColor()
	 {
		Red r=new Red();
		return r;
	 }
 }
 
 class Blue extends Red
 {
	 public Blue getColor()
	 {
		Blue b=new Blue();
		return b;
	 } 
 }

public class Covariantdemo {

	public static void main(String[] args) {
		Color c1=new Color();
		Color c2=c1.getColor();
		
		Red r1=new Red();
		Red r2=r1.getColor();

	}

}
