package lab3.model;

import java.util.Objects;

public class Employee {

	private Integer id;
	private String firstName;
	private String lastName;
	private String department;

	public Employee(int id, String firstName, String lastName, String department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;

	}

	public Employee() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public static void main(String[] args) {
		Employee e = new Employee(5, "Navneet", "Chourey", "Technology");
		int hashcode = e.hashCode();
		System.out.println("hashcode: " + hashcode);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + "]";
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((department == null) ? 0 : department.hashCode());
	 * result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	 * result = prime * result + ((id == null) ? 0 : id.hashCode()); result = prime
	 * * result + ((lastName == null) ? 0 : lastName.hashCode()); return result; }
	 */

	@Override
	public int hashCode() {
		return 0;
//		return Objects.hash(department, firstName, id, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName);
	}

}
