package week1.day1;

public class Student {
	String name = "Balan";
	int rollno =3424;
	public void College()
	{
		String collegename ="AUTT";
		System.out.println(collegename);
	}
	public void regnumber() {
		long regnumber = 6786876765L;
		System.out.println(regnumber);

	}
	 public void deptname() {
		String name ="civil";
	}
	public static void main(String[] args) {
		Student object = new Student();
		System.out.println("Name: "+object.name);
		System.out.println("Roll no: "+object.rollno);
		object.regnumber();
		object.College();
	}
}
