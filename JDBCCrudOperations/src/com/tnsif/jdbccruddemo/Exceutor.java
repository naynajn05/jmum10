package com.tnsif.jdbccruddemo;

import java.sql.Connection;

public class Exceutor {

	public static void main(String[] args) {
		Connection cn=DBUtil.getConnection();
		StatementInterfaceDemo.addEmployee(503, "Ashish", 87000d);
		
		StatementInterfaceDemo.showEmp();
		System.out.println("----------------------------------------------");
		System.out.println(StatementInterfaceDemo.updateEmpName(405, "Gauri"));
		StatementInterfaceDemo.updateEmpSalary(405, 75000);
		System.out.println("-------------After Updating Name and Salary------------");
		StatementInterfaceDemo.showEmp();
		StatementInterfaceDemo.deleteEmp(100);
		StatementInterfaceDemo.deleteEmp(504);
		StatementInterfaceDemo.deleteEmp(101);
		System.out.println("-----------After Deleting --------------------");
		StatementInterfaceDemo.showEmp();


	}

}
