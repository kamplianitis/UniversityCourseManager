package tuc.semester;

import java.util.Vector;

public class Lessons {
	
	//variables
	
	private String code;
	private String title;
	private String sxoli;
	private int ects;
	
	
	private Vector<Reports> ListOfStudents;
	
	
	//constructors
	
	//default constructor
	public Lessons() 
	{
		ListOfStudents = new Vector<Reports>();
	}
	
	// main constructor
	
	public Lessons(String code, String title, String sxoli, int ects )
	{
		this.code = code;
		this.title = title;
		this.sxoli = sxoli;
		this.ects = ects;	
		ListOfStudents = new Vector<Reports>();
	}


	public void setCode(String code) {
		this.code = code;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setSxoli(String sxoli) {
		this.sxoli = sxoli;
	}

	public void setEcts(int ects) {
		this.ects = ects;
	}

	public String getCode() {
		return code;
	}
	
	public String getTitle() {
		return title;
	}

	public String getSxoli() {
		return sxoli;
	}

	public int getEcts() {
		return ects;
	}
	
	public Vector<Reports> getListOfStudents() {
		return ListOfStudents;
	}

	public String getLessonsInfo () {
		return this.code + "  Title" +this.title+ " " +this.sxoli+ " ects: " +this.ects ;
	}
	
	
	// adder of students on a specific lesson
	public void addStudentReport(Reports r) {
		ListOfStudents.add(r);
	}
	
	
	// print methods
	
	//Method used to print Lesson Information
	public void print(){
		System.out.print("Title: "+this.title+ ", sxoli: " + this.sxoli+ ", code: "+this.code+ ", ects: "+this.ects);
	}
	
	public void println(){
		System.out.println("Title: "+this.title+ ", sxoli: " + this.sxoli+ ", code: "+this.code+ ", ects: "+this.ects);
	}
}


//finished i think