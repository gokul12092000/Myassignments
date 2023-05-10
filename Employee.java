package week2day3;

public class Employee{
public void getEmployeeDetails (String empName) {
	System.out.println("employee name:"+empName);
}
public void getEmployeeid(int empId) {
	System.out.println("employee id:"+empId);
}
public void getEmployeeAddress(String empAddress) {
	System.out.println("employee Address:"+empAddress);
}
public void getEmployeeSalary(double empSalary) {
	System.out.println("employeeSalary:"+empSalary);
}
public void getEmployeeMobNumber(long empMobNumber) {
	System.out.println("employeeMobNumber:"+empMobNumber);
}

public static void main(String[] args) {
	Employee company=new Employee();
	company.getEmployeeDetails("gokul");
	company.getEmployeeid(131535);
	company.getEmployeeAddress("chennai");
	company.getEmployeeSalary(50000);
	company.getEmployeeMobNumber(9944519237L);
	
	
	
		

	}

}
