package lab5List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StudentSet {



	  
    // Function to remove duplicates from an ArrayList
    public static  ArrayList<Student> removeDuplicates(ArrayList<Student> list)
    {
  
        // Create a new LinkedHashSet
        Set<Student> set = new LinkedHashSet<Student>();
  
        // Add the elements to set
        set.addAll(list);
  
        // Clear the list
        list.clear();
  
        // add the elements of set
        // with no duplicates to the list
        list.addAll(set);
  
        // return the list
        return list;
    }
  
    // Driver code
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
  
        // Remove duplicates
        ArrayList<Student>
            newList = removeDuplicates(studentList);
  
        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList size with duplicates removed: "
                           + newList.size());
        System.out.println("ArrayList with duplicates removed: "
                + newList);
    }

}
