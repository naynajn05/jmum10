package com.tns.scannerclassdemo;

public class TaxCalculation {

	public void calculateTax(Person p) {
		if (p.getGender().equalsIgnoreCase("female") || (p.getAge() > 65)) {
			p.setTax(0);
			System.out.println("Tax is not applicable");
		} else {
			if (p.getIncome() <= 160000) {
				p.setTax(0);
				System.out.println("Tax is not appilcable to this income slab");
			} else if (p.getIncome() > 160000 && (p.getIncome() <= 500000)) 
			{
				p.setTax((p.getIncome()-160000)*10/100);
			} else if (p.getIncome() > 500000 && (p.getIncome() <= 800000)) {
				p.setTax(((p.getIncome()-160000)*20/100)+32000);
			} else {
				p.setTax(((p.getIncome()-160000)*30/100)+94000);
			}
		}
	}

}
