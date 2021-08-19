package lab5List;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import lab3.model.Employee;

public class StudentJava8 {

    public static void main(String args[])
    {
  
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
		List<Student> uniqueEmployee = studentList.stream()
                 .distinct()               // it will remove duplicate object, It will check duplicate using equals method
                 .collect(Collectors.toList());
        System.out.println("ArrayList size with duplicates removed: "
                + uniqueEmployee.size());
        System.out.println("ArrayList with duplicates removed: "
                + uniqueEmployee);
    }

}
