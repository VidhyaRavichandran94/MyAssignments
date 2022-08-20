package week3.day1.java;

public class CollegePolymorphism{
	
	public void getStudentInfo(String id)
	{
		System.out.println("Get Student Info:"+id+"");
	}	
	
	public void getStudentInfo(String id, String name)
	{
		System.out.println("Get Student Info:"+id+" and "+name+"");
	}	
	
	public void getStudentInfo(String id, String email, String phone)
	{
		System.out.println("Get Student Info:"+id+" and "+email+" and "+phone+"");
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollegePolymorphism dept = new CollegePolymorphism();
		dept.getStudentInfo("56900MCA");
		dept.getStudentInfo("56900MCA", "Vidhya");
		dept.getStudentInfo("56900MCA","Vidhya@gmail.com","9876543210");
	}

}
