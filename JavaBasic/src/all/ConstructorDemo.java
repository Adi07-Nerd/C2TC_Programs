package all;
class Student
{
	int id;
	String name,course,email;
	public Student() {
		
	}
	public Student(int id,String name,String Course,String Email)
	{
		this.id=id;
		this.name=name;
		this.course=Course;
		this.email=Email;
	}
	public void display() {
		System.out.println("Student Information:");
		System.out.printf("Name: %s \nId:%d  Course:%s  Email:%s\n",this.name,this.id,this.course,this.email);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Student n1=new Student();
		n1.name="Noto";
		n1.id=07;
		n1.email="NotoGreat@gmail.com";
		n1.course="Pubg";
		
		n1.display();
		
		Student n2=new Student(17,"Aditya","BscIT","adiyadav@gmail.com");
		n2.display();

	}

}
