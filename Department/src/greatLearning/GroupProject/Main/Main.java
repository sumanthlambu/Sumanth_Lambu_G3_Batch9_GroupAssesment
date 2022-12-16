package greatLearning.GroupProject.Main;

import greatLearning.GroupProject.Department.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Object Creation
		AdminDepartment AD = new AdminDepartment(); 
		Hrdepartment HR= new Hrdepartment();
		TechDepartment TD= new TechDepartment();
		
		//AdminDept output
		System.out.println("Welcome to "+ AD.departmentName());
		System.out.println(AD.getTodaysWork());
		System.out.println(AD.getWorkDeadline());
		System.out.println(AD.isTodayAHoliday() +"\n");
		
		//HrDept Output
		System.out.println("Welcome to "+ HR.departmentName());
		System.out.println(HR.doActivity());
		System.out.println(HR.getTodaysWork());
		System.out.println(HR.getWorkDeadline());
		System.out.println(HR.isTodayAHoliday()+ "\n");

		//TEchDept Output
		System.out.println("Welcome to "+ TD.departmentName());
		System.out.println(TD.getTodaysWork());
		System.out.println(TD.getWorkDeadline());
		System.out.println(TD.getTechStackInformation());
		System.out.println(TD.isTodayAHoliday()+ "\n");		
	}

}
