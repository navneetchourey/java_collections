package lab3.dao;

import java.util.HashMap;
import java.util.Map;

import lab3.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	public static Map<Integer,Employee> empMap = new HashMap<Integer,Employee>();
	
	@Override
	public Map<Integer, Employee> createEmployee(Employee employee) {
	
		if(empMap!=null) {		
			empMap.put(employee.getId(), employee);
		}
		else {
			empMap = new HashMap<Integer,Employee>();
			empMap.put(employee.getId(), employee);
		}
		return empMap;
	}

	@Override
	public Employee findEmployeeById(Integer employeeId) {
		Employee emp = EmployeeDaoImpl.empMap.get(employeeId);
		if(emp==null) {
			throw new RuntimeException("Employee Not Found");
		}
		return emp;
	}

}
