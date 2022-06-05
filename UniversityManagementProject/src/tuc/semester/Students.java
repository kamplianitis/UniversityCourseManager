package tuc.semester;

import java.util.Vector;


public class Students 
{

	private String  AM;
	private String FName;
	private String LName;
	private String Email;
	private Vector <Reports> ListOfLessons;	
	
	
	//"default" constructor ... in case something goes wrong i guess 
	public Students ()
	{
		ListOfLessons = new Vector<Reports>();
	}
	
	
	// main constructor 
	public Students (String AM, String FName, String LName, String Email)
	{
		this.AM = AM;
		this.FName = FName;
		this.LName = LName;
		this.Email = Email;
		ListOfLessons = new Vector<Reports>();
		
	}

	
	//methods

	// setters and getters
	
	public String getAM() {
		return AM;
	}


	public void setAM(String aM) {
		AM = aM;
	}


	public String getFName() {
		return FName;
	}


	public void setFName(String fName) {
		FName = fName;
	}


	public String getLName() {
		return LName;
	}


	public void setLName(String lName) {
		LName = lName;
	}
	
	
	public Vector<Reports> getListsOfLessons() {
		return ListOfLessons;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	
	// additional methods
	
	public String getStudentsInfo()
	{
		return this.FName + ", " + this.LName + " AM [" +this.AM + "]";
	}
	
	//method to add a report
	
	public void addReport (Reports r)
	{
		ListOfLessons.add(r);
	}
	
	// print methods
	
	public void print ()
	{
		System.out.print("Fist Name: "+this.FName + ", Last Name: " + this.LName + ", AM: " + this.AM + ", email." +this.Email);
	}
	
	public void printlnst()
	{
		System.out.println("Fist Name: "+this.FName + ", Last Name: " + this.LName + ", AM: " + this.AM + ", email." +this.Email);
	}
	
}


// this class is finished

