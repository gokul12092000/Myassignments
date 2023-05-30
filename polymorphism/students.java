package polymorphism;

public class students {
	public void getStudentInfo(int id) {
		System.out.println( id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println( id+", "+name);
	}
	public void getStudentInfo(String email,long phonenumber) {
		System.out.println( email+","+ phonenumber);
	}
	public static void main(String[] args) {
		students stu=new students();
		stu.getStudentInfo(123);
		stu.getStudentInfo("gokul", 654);
		stu.getStudentInfo("gokul123@gmail.com", 9087742295l);

	}
	
		
	}


