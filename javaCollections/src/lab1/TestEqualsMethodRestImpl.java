package lab1;

import lab3.model.Employee;

public class TestEqualsMethodRestImpl {

	public static void main(String[] args) {
		String str1 ="abc";
		String str2 ="abc";
		
		
		if(str1.equals(str2)) {
			System.out.println("Strings are equal");
		}
		
		
		StringBuffer sb1 =new StringBuffer("Hello ");  
		StringBuffer sb2 =new StringBuffer("Hello ");  
		if(sb1.equals(sb2)) {
			System.out.println("String Buffers are equal");
		}
		else {
			System.out.println("String Buffers are not equal");
		}
		
	
		Employee emp1 = new Employee(1, "emp1", "surname1", "dept1");
		Employee emp2 = new Employee(1, "emp2", "surname1", "dept1");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		if (emp1.equals(emp2)) {
			System.out.println("Employees are Equal");
		} else {
			System.out.println("Employees are not Equal");

		}

	}

}
