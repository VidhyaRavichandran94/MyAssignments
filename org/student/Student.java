package org.student;

import org.department.Department;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println("Student Name");
	}
   public void studentDept()
  {
	System.out.println("Student Dept");
}
	
   public void studentId()
   {
 	System.out.println("Student Id");
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Student list=new Student();
  list.collegeCode();
  list.collegeName();
  list.collegeRank();
  list.deptName();
  list.studentName();
  list.studentDept();
  list.studentId();
	}

}