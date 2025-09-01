package PriorityQueues;

public class CustomComparator {
	static class Student implements Comparable<Student>{
		 int rno;
		 double perc;
		 String name;
		Student(int rno,double perc,String name){
			this.rno = rno;
			this.perc = perc;
			this.name = name;
		}
		
		
		public int compareTo(Student s) {
			
			return this.rno - s.rno;
		}
		
		   public String toString() {
	            return "Roll No: " + rno + ", Name: " + name + ", Percentage: " + perc;
	        }
	}
	public static void main(String [] args) {
		 Student[] students = new Student[4];
	        students[0] = new Student(103, 78.5, "Bob");
	        students[1] = new Student(101, 87.5, "John");
	        students[2] = new Student(104, 85.3, "Emma");
	        students[3] = new Student(102, 91.2, "Alice");

	       
	        for (Student s : students) {
	            System.out.println(s);
	        }
	}
}
