package tuc.semester;

import java.util.Vector;

public class ReportsManager {
	private String Nameofservice;
	private String Url;
	
	// vectors
	
	// vector for the lessons
	private Vector<Lessons> ListOfLessons;
	
	// vector for the students 
	private Vector<Students> ListOfStudents;
	
	//vector for the reports
	private Vector<Reports> ListOfReports;
	
	// consructors
	public ReportsManager() // "default constructor.. just in case" 
	{
		ListOfLessons = new Vector<Lessons>();
		ListOfStudents = new Vector<Students>();
		ListOfReports = new Vector<Reports>();
	}
	
	public ReportsManager (String Nameofservice, String Url) // main constructor
	{
		this.Nameofservice = Nameofservice;
		this.Url = Url;
		ListOfLessons = new Vector<Lessons>();
		ListOfStudents = new Vector<Students>();
		ListOfReports = new Vector<Reports>();
	}
	

	// methods 
	
	//setters 
	


	public void setNameofservice(String nameofservice) {
		Nameofservice = nameofservice;
	}

	public void setUrl(String url) {
		Url = url;
	}

	// getters
	public String getNameofservice() {
		return Nameofservice;
	}

	public String getUrl() {
		return Url;
	}

	public Vector<Lessons> getListOfLessons() {
		return ListOfLessons;
	}

	public Vector<Students> getListOfStudents() {
		return ListOfStudents;
	}

	public Vector<Reports> getListOfReports() {
		return ListOfReports;
	}
	
	// additions
	
	public void addLesson(Lessons l)
	{
        ListOfLessons.add(l);
    }
    
    public void addStudent(Students s)
    {
        ListOfStudents.add(s);
    }
    
    public void addReport(Reports r)
    {
        ListOfReports.add(r);
    }
	
	//add a new report for a Student
	
	public void addNewReport (Students a, Lessons l)
	{
		if(a.getListsOfLessons().size()>4)
			System.out.println("this Student has enough Lessons. You cannot add more.");
		else
		{
			if (a != null && l != null)
			{
				Reports r = new Reports(a,l);
				this.ListOfReports.add(r);
				a.addReport(r);
				l.addStudentReport(r);
				System.out.println("The report has been added.");
			}
			System.out.println("the name of the Student or the name of the Lesson does not exist. ");
		}
	}
	
	// Finds the stundent giving name as arg
	public Students FindStudentByName ( String Fname , String LName )
	{
		for (int i = 0; i<this.ListOfStudents.size(); i++)
		{
			Students s = this.ListOfStudents.get(i);
			if(s.getFName().equals(Fname) && s.getLName().equals(LName))
			{
				return s;
			}
		}
		return null;
	}
	
	
	// finds a specific lesson
	public Lessons FindLessonBytitle (String title)
	{
		for (int i = 0; i<this.ListOfLessons.size(); i++)
		{
			Lessons l = this.ListOfLessons.get(i);
			if (l.getTitle().equals(title))
			{
				return l;
			}
		}
		return null;
	}
	
	// finds the lessons a student wants to be examined
	public void printStudentsLessons (String Fname , String Lname)
	{
		Students s = this.FindStudentByName(Fname, Lname);
		if (s != null)
		{
			System.out.println("The Lessons this Student has to be examined are: "+s.getStudentsInfo());
			if (s.getListsOfLessons().size()>0 )
			{
				int counter=0;
				int sum=0;
				for(int i =0; i<s.getListsOfLessons().size(); i++)
				{
					Reports r = s.getListsOfLessons().get(i);
					System.out.print("Report Code. " +r.getCode()+" ");
					System.out.println((i+1) + ". " + r.getLesson().getLessonsInfo());
					counter++;
					sum = sum + r.getLesson().getEcts();
				}
				System.out.println("sum of lessons: "+counter + " sum of the ects:" +sum);
			}
		}
		else 
			System.out.println("this student does not exist or they have not reported any lessons. ");
		
	}

	//prints the catalog of all the students
	
	public void printStudents ()
	{
		for(int i=0; i<this.ListOfStudents.size(); i++)
			this.ListOfStudents.get(i).printlnst();
	}
	
	//catalog of lessons
	
	public void printLessons()
	{
		for(int i=0; i<this.ListOfLessons.size(); i++)
			this.ListOfLessons.get(i).println();
	}
	
	
	public void printReportsList()
	{
		if (this.ListOfReports != null)
		{
			for(int i=0; i<this.ListOfReports.size(); i++)
			{
				this.ListOfReports.get(i).printReports();
			}
		}
	}
	
}

//finished