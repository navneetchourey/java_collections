package lab2_hashcode;

/*HashCode Example for Multiple variables*/

public class Employee3 {

	private Integer id;
	private String firstName;
	private String lastName;
	private String department;

	public Employee3(int id, String firstName, String lastName, String department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;

	}

	public Employee3() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	public static void main(String[] args) {
		Employee3 e = new Employee3(5, "Navneet", "Chourey", "Technology");
		int hashcode = e.hashCode();
		System.out.println("hashcode: " + hashcode);
	}

}
