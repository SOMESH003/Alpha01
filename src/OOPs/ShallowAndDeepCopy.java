package OOPs;

public class ShallowAndDeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "Somesh";
		s1.roll = 456;
		s1.password = "abc";
		s1.marks[0] = 100;
		s1.marks[1] = 90;
		s1.marks[2] = 80;
		
		Student s2 = new Student(s1);
		s2.password = "xyz";
		s1.marks[2] = 100;
		//Printing object s2 marks
		for(int i=0; i<3; i++) {
			System.out.println(s2.marks[i]);
		}
	}

}

class Student{
	String name;
	int roll;
	String password;
	int[] marks;
	
	//Shallow copy constructor
//	Student(Student s1){
//		marks = new int[3];
//		this.name = s1.name;
//		this.roll = s1.roll;
//		this.marks = s1.marks;		
//	}
	
	//Deep Copy Constructor
	Student(Student s1){
		marks = new int[3];
		this.name = s1.name;
		this.roll = s1.roll;
		for(int i=0; i<3; i++) {
			this.marks[i] = s1.marks[i];
		}
	}
	
	Student(){
		marks = new int[3];
	}
}
