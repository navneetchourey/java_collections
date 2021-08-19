package lab5List;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Objects;

public class Student {
	
	private Integer rollNo;
	private String name;
	private Integer age;
	private String school;
	private String standard;
	
	public Student(Integer rollNo, String name, Integer age, String school, String standard) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.school = school;
		this.standard = standard;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name, rollNo, school, standard);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(age, other.age) && Objects.equals(name, other.name)
				&& Objects.equals(rollNo, other.rollNo) && Objects.equals(school, other.school)
				&& Objects.equals(standard, other.standard);
	}



	



	public static void main(String[] args) {
		Student s1 = new Student(1,"name1",10,"CMS","5th");
		Student s2 = new Student(2,"name2",10,"CMS","5th");
		Student s3 = new Student(3,"name3",10,"CMS","5th");
		Student s4 = new Student(4,"name4",10,"CMS","5th");
		Student s5 = new Student(5,"name5",10,"CMS","5th");
		Student s6 = new Student(1,"name1",10,"CMS","5th");
		Student s7 = new Student(3,"name3",10,"CMS","5th");
		Student s8 = new Student(1,"name1",10,"ABC","6th");
		 ArrayList<Student> studentList = new ArrayList<Student>();// has duplicate
		   
		 studentList.add(s1);
		 studentList.add(s2);
		 studentList.add(s3);
		 studentList.add(s4);
		 studentList.add(s5);
		 studentList.add(s6);
		 studentList.add(s7);
		 studentList.add(s8);
		    ArrayList<Student> uniqueList = new ArrayList<Student>();// unique Students List
		    for (Student element : studentList) {
		        if (!uniqueList.contains(element)) {
		            System.out.println(element);
		            uniqueList.add(element);
		        }
		    }


	}
	
	
	
	public Integer getRollNo() {
		return rollNo;
	}



	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getSchool() {
		return school;
	}



	public void setSchool(String school) {
		this.school = school;
	}



	public String getStandard() {
		return standard;
	}



	public void setStandard(String standard) {
		this.standard = standard;
	}



	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{ rollNo").append(": ").append(getRollNo()).append(", ")
		.append("name").append(": ").append(getName()).append(", ")
		.append("age").append(": ").append(getAge()).append(", ")
		.append("school").append(": ").append(getSchool()).append(", ")
		.append("standard").append(": ").append(getStandard()).append("}");
	  return sb.toString();
	 
	}
	
	

}
