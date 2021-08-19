package lab3.view;

import java.util.Scanner;

import lab3.dao.EmployeeDao;
import lab3.dao.EmployeeDaoImpl;
import lab3.model.Employee;

public class EmployeeRestImpl {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "emp1", "surname1", "dept1");
		Employee emp2 = new Employee(2, "emp2", "surname2", "dept2");
		Employee emp3 = new Employee(3, "emp3", "surname3", "dept3");
		Employee emp4 = new Employee(4, "emp4", "surname4", "dept4");
		Employee emp5 = new Employee(5, "emp5", "surname5", "dept5");
		Employee emp6 = new Employee(5, "emp5", "surname5", "dept5");
		

		EmployeeDao empDao = new EmployeeDaoImpl();
		empDao.createEmployee(emp1);
		empDao.createEmployee(emp2);
		empDao.createEmployee(emp3);
		empDao.createEmployee(emp4);
		empDao.createEmployee(emp5);
		System.out.println("HashMap : "+EmployeeDaoImpl.empMap);
		
//		EmployeeDao empDao = new EmployeeDaoImpl();
		Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter EmpId : ");
        Integer input = scanObj.nextInt();
		Employee emp = empDao.findEmployeeById(input);	
		System.out.println("Employee : "+emp);


		
	}

}
