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
		return rollno + " " + sname + " " + branch + " " + marks + 		" " + cgpa;
	}
}

class SortByRollNo implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return Integer.compare(s1.rollno, s2.rollno);
	}
}

class SortByName implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.sname.compareTo(s2.sname);
	}
}

class SortByBranch implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.branch.compareTo(s2.branch);
	}
}

class SortByMarks implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return Integer.compare(s1.marks, s2.marks);
	}
}

class SortByCgpa implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return Double.compare(s1.cgpa, s2.cgpa);
	}
}

public class ArraylistOfRecords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = Integer.parseInt(sc.nextLine());

		ArrayList<Student> al = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter the details of student 			" + (i + 1));

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

			al.add(new Student(rollno, name, branch, marks, 			cgpa));
		}

		System.out.println("\n--- Original Student Records ---");
		for (Student s : al) {
			System.out.println(s);
		}

		System.out.println("\n--- Sorted by CGPA ---");
		Collections.sort(al, new SortByCgpa());
		for (Student s : al) {
			System.out.println(s);
		}
	}
}
