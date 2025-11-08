import java.util.*;

class Student {
	int rollno;
	String sname, branch;
	int marks;
	double cgpa;

	public Student(int rno, String name, String branch, int marks, double cgpa) {
		rollno = rno;
		sname = name;
		this.branch = branch;
		this.marks = marks;
		this.cgpa = cgpa;
	}

	public String toString() {
		return rollno + " " + sname + " " + branch + " " + marks +" " + cgpa;
	}
}

class SortByRollNo implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return Integer.compare(s2.rollno, s1.rollno);
	}
}

class SortByName implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s2.sname.compareTo(s1.sname);
	}
}

class SortByBranch implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s2.branch.compareTo(s1.branch);
	}
}

class SortByMarks implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return Integer.compare(s2.marks, s1.marks);
	}
}

class SortByCgpa implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return Double.compare(s2.cgpa, s1.cgpa);
	}
}

public class ArraylistOfRecords4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = Integer.parseInt(sc.nextLine());

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter the details of student" + (i + 1));

			System.out.print("Roll No: ");
			int rollno = Integer.parseInt(sc.nextLine());

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Branch: ");
			String branch = sc.nextLine();

			System.out.print("Marks: ");
			int marks = Integer.parseInt(sc.nextLine());

			System.out.print("CGPA: ");
			double cgpa = Double.parseDouble(sc.nextLine());

			Student s1 = new Student(rollno, name, branch, marks, cgpa);
			arr[i] = s1;
		}
		Arrays.sort(al, new SortByCgpa());

		System.out.println("Highest CGPA: "+arr[0]);
		System.out.println("Lowest CGPA: "+arr[arr.length - 1]);
	}
}
