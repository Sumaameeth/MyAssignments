package Week3.Day1;

public class Students {

	public void getStudents(int id) {
		System.out.println("Student id is:"+id);
	}
	
	public void getStudents(int id,String name) {
		System.out.println("Student id is:"+id +" "+"name is: "+name );
	}
	
	public void getStudents(String email,long phoneNo) {
		System.out.println("Student email is:"+email +"phoneNo is: "+phoneNo );
	}
	public static void main(String[] args) {
		Students stu=new Students();
		stu.getStudents(10);
		stu.getStudents(10, "suma");
		stu.getStudents("ss@gmail.com", 12434643);

	}

}
