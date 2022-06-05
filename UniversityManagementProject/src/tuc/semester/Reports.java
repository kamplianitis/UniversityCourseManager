package tuc.semester;

import java.util.concurrent.ThreadLocalRandom;

public class Reports {
	
	private Students student;
	private Lessons Lesson;
	private int Code;
	private int Sum = 0;
	
	//constructors 
	
	//"default constructor"
	public Reports() {}

	//main constructor
	
	public Reports (Students s, Lessons l)
	{
		student = s;
		Lesson = l;
		Code = ThreadLocalRandom.current().nextInt(1000, 2000);
		Sum = Sum + l.getEcts();
	}

	public Students getStudent() {
		return student;
	}


	public void setStudent(Students student) {
		this.student = student;
	}


	public Lessons getLesson() {
		return Lesson;
	}


	public void setLesson(Lessons lesson) {
		Lesson = lesson;
	}


	public int getSum() {
		return Sum;
	}


	public void setSum(int sum) {
		Sum = sum;
	}
	
	// prints the Reports of a specific Student
	public void printReports()
	{
		System.out.println(" Students Name:"+student.getFName()+ " "+student.getLName()+ "Report Code. "+ this.getCode()+" List of lessons:  "+student.getListsOfLessons().size()+ "  Sum of Ects"+this.getSum());
		
		
	}

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}
	
	
}
