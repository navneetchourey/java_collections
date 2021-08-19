package lab2_hashcode;

import java.util.Objects;

/*HashCode Example of two variables*/

public class Employee2 {

	private int id;
	private String name;

	public Employee2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee2() {
		super();
	}

	/*
	 * @Override public int hashCode() { return Objects.hash(id, name); }
	 */
	
	 @Override
	    public int hashCode() {
	        return Objects.hash(id)+this.name.hashCode();
	    }


	public static void main(String[] args) {
		Employee2 e = new Employee2(5, "abc");
		int hashcode = e.hashCode();
		System.out.println("hashcode ========= " + hashcode);
	}
	
		/*
		 * @Override public int hashCode() { final int prime = 31; int result = 1;
		 * result = prime * result + ((department == null) ? 0 : department.hashCode());
		 * result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		 * result = prime * result + ((id == null) ? 0 : id.hashCode()); result = prime
		 * * result + ((lastName == null) ? 0 : lastName.hashCode()); return result; }
		 */
}
