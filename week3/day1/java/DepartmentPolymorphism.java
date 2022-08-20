package week3.day1.java;

public class DepartmentPolymorphism extends StudentPolymorphism{
	public void getStudentInfo(String id,String name)
	{
		super.getStudentInfo();
		System.out.println("Get Student Info:"+id+" and "+name+"");
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DepartmentPolymorphism dept = new DepartmentPolymorphism();
		dept.getStudentInfo("56900MCA","Vidhya");
	}

}
