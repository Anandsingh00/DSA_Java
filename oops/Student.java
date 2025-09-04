package oops;

public class Student {
	 String name;
	 int Rno;
	double percent;
	final String schoolName="RALB";
	static int noOfStudents;
	//default constructor	
	public Student() {
		
	}
	public Student(String name,int Rno,double percent) {
		this.name = name;
		this.Rno =Rno;
		this.percent = percent;
		noOfStudents++;
	}
	
	public int getRno() {//getter
		return Rno;
	}
	public void setRno(int Rno) {
		this.Rno =Rno;
	}

}
