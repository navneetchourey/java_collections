package lab3.dao;

import java.util.Map;

import lab3.model.Employee;

public interface EmployeeDao {
	
	public Map<Integer,Employee> createEmployee(Employee employee); 
	
	public Employee findEmployeeById(Integer employeeId); 

}
