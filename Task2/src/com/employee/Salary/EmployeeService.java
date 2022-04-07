package com.employee.Salary;

import com.employee.task.Employee;

public class EmployeeService {
	
	 public double calculateBonus(Employee object) {
		 double bonus= object.getEmpSalary();
		 return 0.33*bonus;
	 }

}
