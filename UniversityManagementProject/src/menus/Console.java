

package menus;

// import the classes so i can use them and their utilities on main.
import tuc.semester.ReportsManager;
import tuc.util.StandardInputRead;
import tuc.semester.Lessons;
import tuc.semester.Students;

public class Console {

	public static void main(String[] args)
	{
		// console creation
		
		ReportsManager manager = new ReportsManager("TUC", "www.tuc.com");
		
		// Students that are on the system
		manager.addStudent(new Students("1234567890", "Nikos9", "Papadopoulos", "email.com"));
		manager.addStudent(new Students("0123456789", "Nikos8", "Papadopoulos", "email.com"));
		manager.addStudent(new Students("2345678901", "Nikos7", "Papadopoulos", "email.com"));
		manager.addStudent(new Students("3456789012", "Nikos6", "Papadopoulos", "email.com"));
		manager.addStudent(new Students("4567890123", "Nikos5", "Papadopoulos", "email.com"));
		manager.addStudent(new Students("5678901234", "Nikos4", "Papadopoulos", "email.com"));
		manager.addStudent(new Students("6789012345", "Nikos3", "Papadopoulos", "email.com"));
		manager.addStudent(new Students("7890123456", "Nikos2", "Papadopoulos", "email.com"));
		manager.addStudent(new Students("8901234567", "Nikos1", "Papadopoulos", "email.com"));
		manager.addStudent(new Students("9012345678", "Nikos", "Papadopoulos", "email.com"));
		
		// Lessons on the system
		
		
		manager.addLesson(new Lessons ("123ABC","Title","ece",1));
		manager.addLesson(new Lessons ("125ACD","Title1","ece",2));
		manager.addLesson(new Lessons ("124AUC","Title2","ece",3));
		manager.addLesson(new Lessons ("128AUE","Title3","ece",4));
		manager.addLesson(new Lessons ("125UEA","Title4","ece",5));
		manager.addLesson(new Lessons ("126UEA","Title5","ece",6));
		manager.addLesson(new Lessons ("125GGG'","Title6","ece",7));
		
		
		// Reports
		
		manager.addNewReport(manager.FindStudentByName("Nikos9", "Papadopoulos"), manager.FindLessonBytitle("Title"));
		manager.addNewReport(manager.FindStudentByName("Nikos8", "Papadopoulos"), manager.FindLessonBytitle("Title1"));
		manager.addNewReport(manager.FindStudentByName("Nikos", "Papadopoulos"), manager.FindLessonBytitle("Title"));
		manager.addNewReport(manager.FindStudentByName("Nikos7", "Papadopoulos"), manager.FindLessonBytitle("Title3"));
		
		
		
		
		
		// Creation of the menu	
		// REAL menu
		int userschoice = 0;
		StandardInputRead reader = new StandardInputRead();
		while( userschoice != 7 ) {
			printChoices();
		String userInput = reader.readString("What would you like to do? ");
		if(userInput == null)
		{
			continue;
		}
		else
		{
			try
			{
				userschoice = Integer.parseInt(userInput);
			}
			catch (NumberFormatException ex)
            {
                userschoice = 0;
            }
		}
           
                
                // make the menu switch 
		 		String Fname, Lname, title;
                switch (userschoice)
                {
                case 0:
                	continue;
                case 1: // add a Lessons
                	String Code, tittle, sXoli;
                	int Ects;
                	
                	Code = reader.readString("Read the lesson code ");
                	tittle = reader.readString("Read the Lesson title ");
                	sXoli = reader.readString("Read the sxoli ");
                	Ects = reader.readPositiveInt("Read the ECTS ");
                	
                	if (Code != null && tittle != null && sXoli != null && Ects > 0)
                	{
                		manager.addLesson(new Lessons (Code, tittle, sXoli, Ects));
                		System.out.println("The Lesson has been added.");
                		reader.readString("Press any key.");
                	}
                	else
                	{
                		System.out.println("No enough correct information about the Lesson.");
                		reader.readString("Press any key.");
                	}
                	break;
                case 2:
                	System.out.println("The available Lessons are: ");
                	manager.printLessons();
                	reader.readString("Press any key.");
                	break;
                case 3:
                	String Firstname, Lastname, aM, EMail;
                	Firstname = reader.readString("Read the first name of the Student. ");
                	Lastname = reader.readString("Read the Last name of the Student. ");
                	aM = reader.readString("Read the Student AM. ");
                	EMail = reader.readString("Read Student's Email. ");
                	manager.addStudent(new Students (aM, Firstname, Lastname, EMail));
                	System.out.println("The Student has been added. ");
                	reader.readString("Press any key.");
                	break;
                case 4:
                	System.out.println("The Students that are added are: ");
                	manager.printStudents();
                	reader.readString("Press any key.");
                	break;
                case 5:
                	Fname = reader.readString("Read the First Name. ");
                	Lname = reader.readString("Read me the Last Name. ");
                	title = reader.readString("Read the Lesson Title. ");
                	Students s = manager.FindStudentByName(Fname, Lname);
                	Lessons l = manager.FindLessonBytitle(title);
                	manager.addNewReport(s, l); //list of lessons
                	reader.readString("Press any key.");
                	break;
                case 6:
                	System.out.println("here are the reports");
                	manager.printReportsList();
                	reader.readString("Press any key.");
                	break;
                case 7:
                		Fname = reader.readString("Read the First Name");
                		Lname = reader.readString("Read the Last Name");
                		manager.printStudentsLessons(Fname, Lname);
                		reader.readDate("Press any key.");
                		break;
                case 8:
                	System.out.println("Thank you for your time");
                	reader.readString("Press any key.");
                	System.exit(0);
                	break;
                default:
                	System.out.println("User option " + userschoice + " ignored...");
                    continue;
                		}
            	}
			}
	
	// choices that will appear so the user decides what they want
	public static void printChoices()
	{
		 System.out.println("                 Tuc Console");
	        System.out.println("=======================================================");
	        System.out.println("1. Add a new Lesson ...................................");
	        System.out.println("2. Print Lessons ......................................");
	        System.out.println("3. Add a new Student ..................................");
	        System.out.println("4. Print Students .....................................");
	        System.out.println("5. Add a Report  ......................................");
	        System.out.println("6. Print All Reports ..................................");
	        System.out.println("7. Print the Report of a Student ......................");
	        System.out.println("8. Exit ...............................................");
	}

}



