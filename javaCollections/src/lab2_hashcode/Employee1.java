package lab2_hashcode;

/*HashCode Example of one variable*/
import java.util.Objects;

public class Employee1 {

	public Employee1(int id) {
		super();
		this.id = id;
	}

	public Employee1() {
		super();
	}

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	/*
	 * @Override public int hashCode() { return Objects.hash(id); }
	 */

	public static void main(String[] args) {
		Employee1 e = new Employee1(5);
		int hashcode = e.hashCode();
		System.out.println("hashcode ========= " + hashcode);
	}

}
