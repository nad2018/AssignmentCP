package StudentIndormation;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Operations {
	public static Scanner input= new Scanner(System.in);
	private static String name;
	private static String surname;
	private static int grade1;
	private static int grade2;
	private static int grade3;
	private static int grade4;
	private static int grade5;
	private static String ID;
	private static double GPA;
	private static String line;
 public static void addStudent() throws IOException {
	 FileWriter outputFile = new FileWriter("StudentINFO.txt",true); //Open new file student information
		ArrayList <StudentInfo>student =new ArrayList<StudentInfo>();
     int y = 0;
     System.out.println("How many Student you want to add");
     y = input.nextInt();
     for (int i=0;i<y;i++) // looping for sdding information for y student
     { System.out.println("Enter Student ID:");
 	ID =input.next();         // take student id from user 
		System.out.println("Enter Student name:");
		name =input.next();  // take student name from user 
		System.out.println("Enter Student surname:");
		surname =input.next();  // take student surname from user 
		System.out.println("Enter Student Math:");
	     grade1 =input.nextInt();  // take student math grade from user 
		System.out.println("Enter Student Chimstry:");
 	grade2 =input.nextInt();  // take student chemistry grade from user 
 	System.out.println("Enter Student physic:");
 	grade3 =input.nextInt(); // take student physics grade from user 
 	System.out.println("Enter Student Language:");
 	grade4 =input.nextInt();  // take student Language grade from user 
 	System.out.println("Enter Student Programming:");
 	grade5 =input.nextInt();   // take student programming grade from user 
 	StudentInfo.setGPA(grade1, grade2, grade3, grade4, grade5);  // claculate Gpa of student grade
 	GPA = StudentInfo.getGPA();
 	GPA = StudentInfo.getGPA();

 	StudentInfo st1 =new StudentInfo(ID,name,surname, grade1, grade2, grade3, grade4, grade5,GPA); // create an object student then adding it to arrayList
 	student.add(st1);
//save information of student in file
 outputFile.write(""+ID+","+name+","+surname+","+ grade1+","+ grade2+","+ grade3+","+ grade4+","+grade5+","+GPA+","+System.lineSeparator());}
 	outputFile.close();
 }
 public static void ListStudent() throws IOException {
	 //reading information from file 
	 BufferedReader	br2 = new BufferedReader(new FileReader("StudentInfo.txt"));
	    String line ;
		ArrayList <StudentInfo>student =new ArrayList<StudentInfo>();
		while(  (line=br2.readLine()) != null) // while loop to check if the file empty or not to read data if it is not empty
	    {    String[] pices = line.split(",");
		ID=pices[0];
	    name=pices[1];
		surname=pices[2];
		grade1=Integer.parseInt(pices[3]);
		grade2=Integer.parseInt(pices[4]);
		grade3=Integer.parseInt(pices[5]);
		grade4=Integer.parseInt(pices[6]);
		grade5=Integer.parseInt(pices[7]);
		GPA=Double.parseDouble(pices[8]);
		StudentInfo st=new StudentInfo(ID,name,surname,grade1,grade2,grade3,grade4,grade5,GPA);
				student.add(st);
	       }	br2.close();
			 System.out.println("Enter type of sort \n1.Bubble Sort according to ID\n2.Using Collection accourding name ");
			 int type= input.nextInt(); //user input for the way to show students
			 if(type==1) {
				 StudentInfo temp;
			        if (student.size()>1) // check if the number of orders is larger than 1
			        {
			            for (int x=0; x<student.size(); x++) // bubble sort outer loop
			            {
			                for (int i=0; i < student.size()-x-1; i++) {
			                    if (student.get(i).getID().compareTo(student.get(i+1).getID()) > 0)
			                    {
			                        temp = student.get(i);
			                        student.set(i,student.get(i+1) );
			                        student.set(i+1, temp);
			                    }
			                }
			            }
			    		System.out .println("ID\tName\tSurname\t\tMathGrade\tPhyGrade\tChemGrade\tLangGrade\tProgGrade");
			            for(int i=0;i<student.size();i++){ // show in the screen the elements of arraylist using for loop
	                        temp = student.get(i);
	                        System.out .println(temp.getID()+"\t"+temp.getName()+"\t"+temp.getLastName()+"\t\t"+temp.getMathGrad()+"\t\t"+temp.getPhyGrade()+"\t\t"+
	                        temp.getchimGrade()+"\t\t"+temp.getLanguGrade()+"\t\t"+temp.getprogGrade());
	                	  
	                    }
			            	
			        }
				 
			 }
			 else if (type==2) {
				 // Sorting an array list using collection
				 StudentInfo st2 =new StudentInfo(ID,name,surname, grade1, grade2, grade3, grade4, grade5,GPA);
				 ArrayList<StudentInfo> student2 = new ArrayList<StudentInfo>();  // create an arraylist student 
				 student2.add(st2);
	              Collections.sort(student2, Collections.reverseOrder()); 
                     //use in collection to sort the arraylist
		    		System.out .println("ID\tName\tSurname\t\tMathGrade\tPhyGrade\tChemGrade\tLangGrade\tProgGrade");
	              for(int i=0;i<student.size();i++){ // for looping to show the arraylist element
                     StudentInfo temp = student.get(i);
                     System.out .println(temp.getID()+"\t"+temp.getName()+"\t"+temp.getLastName()+"\t\t"+temp.getMathGrad()+"\t\t"+temp.getPhyGrade()+"\t\t"+
                     temp.getchimGrade()+"\t\t"+temp.getLanguGrade()+"\t\t"+temp.getprogGrade()); }}
 }
 public static void Search() throws IOException {
	 BufferedReader	br2 = new BufferedReader(new FileReader("StudentINFO.txt"));
		ArrayList <StudentInfo>student =new ArrayList<StudentInfo>();
		System.out.println("1.Linear search\n2.Binary Search"); 
		int x=0;
		x=input.nextInt();
	if (x==1) {
		System.out.println("please enter the studentID"); // input the student Id which we want to search
		String StuID= input.next();
		String line;
		while( (line=br2.readLine()) != null) // if the file of student information not empty
	    { 
	 String[] pices = line.split(",");
	ID=pices[0];
    name=pices[1];
	surname=pices[2];
	grade1=Integer.parseInt(pices[3]);
	grade2=Integer.parseInt(pices[4]);
	grade3=Integer.parseInt(pices[5]);
	grade4=Integer.parseInt(pices[6]);
	grade5=Integer.parseInt(pices[7]);
	GPA=Double.parseDouble(pices[8]); 
if ( StuID.equals(pices[0])) { // if the entered id is equal to student id in the file
	 	StudentInfo st1 =new StudentInfo(ID,name,surname, grade1, grade2, grade3, grade4, grade5,GPA);
	 student.add(st1); // print the information of student
		System.out .println("ID\tName\tSurname\tMathGrade\tPhysicGrade\tChemistryGrade\tLanguageGrade\tProgrammingGrade\tGPA");
		System.out .println(st1.getID()+"\t"+st1.getName()+"\t"+st1.getLastName()+"\t\t"+st1.getMathGrad()+"\t\t"+st1.getPhyGrade()+"\t\t"+
				st1.getchimGrade()+"\t\t"+st1.getLanguGrade()+"\t\t"+st1.getprogGrade()+"\t\t"+st1.getGPA());}
	    }br2.close();}
		else if (x==2) {
			System.out.println("please enter the studentID");
			String StuID= input.next();
			String line;
			StudentInfo st1 =new StudentInfo(ID,name,surname, grade1, grade2, grade3, grade4, grade5,GPA);

			while( (line=br2.readLine()) != null) 
		    { 
		    String[] pices = line.split(",");
		ID=pices[0];
	    name=pices[1];
		surname=pices[2];
		grade1=Integer.parseInt(pices[3]);
		grade2=Integer.parseInt(pices[4]);
		grade3=Integer.parseInt(pices[5]);
		grade4=Integer.parseInt(pices[6]);
		grade5=Integer.parseInt(pices[7]);
		GPA=Double.parseDouble(pices[8]); 
		StudentInfo st2 =new StudentInfo(ID,name,surname, grade1, grade2, grade3, grade4, grade5,GPA);
			student.add(st2);}br2.close();
			StudentInfo temp;
			//Doing sort for arraylist
	        if (student.size()>1) // check if the number of orders is larger than 1
	        {
	            for (int x1=0; x1<student.size(); x1++) // bubble sort outer loop
	            {
	                for (int i=0; i < student.size()-x1-1; i++) {
	                    if (student.get(i).getName().compareTo(student.get(i+1).getName()) > 0)
	                    {
	                        temp = student.get(i);
	                        student.set(i,student.get(i+1) );
	                        student.set(i+1, temp);
	                    }
	                }
	             
	             }
	            }
	        
	            int res = binarySearch(student,0,student.size()-1, StuID); // binary search function
                if (res >= 0) 
                	{
                	System.out .println("ID\tName\tSurname\tMathGrade\tPhysicGrade\tChemistryGrade\tLanguageGrade\tProgrammingGrade");
                System.out .println(st1.getID()+"\t"+st1.getName()+"\t"+st1.getLastName()+"\t\t"+st1.getMathGrad()+"\t\t"+st1.getPhyGrade()+"\t\t"+
                		st1.getchimGrade()+"\t\t"+st1.getLanguGrade()+"\t\t"+st1.getprogGrade()+"\t\t"+st1.getGPA());}
                else
                    System.out.println(StuID + " Not found");
	             
		}}
 public static void Update() throws IOException {
	 System.out.println("please enter the studentID");
		String StuID= input.next();
		File read= new File("StudentINFO.txt");
		File Write= new File("StudentINFOad.txt");
	 BufferedReader	br2 = new BufferedReader(new FileReader(read));
	 BufferedWriter	br3 = new BufferedWriter(new FileWriter(Write));
		ArrayList <StudentInfo>student =new ArrayList<StudentInfo>();
		String line;
		System.out.println("Are you sure?");
		String sue =input.next();
		if (sue.equals("yes")) {
		while( (line=br2.readLine()) != null) // if file not empty
	    { 
	    String[] pices = line.split(",");
	ID=pices[0];
 name=pices[1];
	surname=pices[2];
	grade1=Integer.parseInt(pices[3]);
	grade2=Integer.parseInt(pices[4]);
	grade3=Integer.parseInt(pices[5]);
	grade4=Integer.parseInt(pices[6]);
	grade5=Integer.parseInt(pices[7]);
	GPA=Double.parseDouble(pices[8]); 
if ( StuID.equals(pices[0])) {
	// enterring updating data
	System.out.println("Enter Student ID:");
	ID =input.next();
		System.out.println("Enter Student name:");
		name=input.next();
		System.out.println("Enter Student surname:");
	surname =input.next();
		System.out.println("Enter Student Math:");
		grade1 =input.nextInt();
		System.out.println("Enter Student Chimstry:");
		grade2 =input.nextInt();
 	System.out.println("Enter Student physic:");
	grade3 =input.nextInt();
 	System.out.println("Enter Student Language:");
	grade4 =input.nextInt();
 	System.out.println("Enter Student Programming:");
	grade5 =input.nextInt();
 	StudentInfo.setGPA(grade1, grade2, grade3, grade4, grade5);
 	GPA = StudentInfo.getGPA();
 	GPA = StudentInfo.getGPA();
	 	StudentInfo st1 =new StudentInfo(ID,name,surname, grade1, grade2, grade3, grade4, grade5,GPA);
	 student.add(st1);
	 br3.write(""+ID+","+name+","+surname+","+ grade1+","+ grade2+","+ grade3+","+ grade4+","+grade5+","+GPA+","+System.lineSeparator()); }//saving the data inside the student file
    else if ( !StuID.equals(pices[0])) 
    {
			
		 	StudentInfo st2 =new StudentInfo(ID,name,surname, grade1, grade2, grade3, grade4, grade5,GPA);
		 student.add(st2);
		 br3.write(""+ID+","+name+","+surname+","+ grade1+","+ grade2+","+ grade3+","+ grade4+","+grade5+","+GPA+","+System.lineSeparator()); }
		else {System.out.println("Thank you");
		} }		
			br2.close(); //close file
		br3.close();}
 }
 public static void Delete() throws IOException {
	 System.out.println("Select the way for deleting\n1.ArrayList\n2.Array");
	 int x=input.nextInt();
	 if (x==1) { 
	 System.out.println("please enter the studentID");
		String StuID= input.next();
		File read= new File("StudentINFO.txt");
		File Write= new File("StudentINFOad.txt");
	 BufferedReader	br2 = new BufferedReader(new FileReader(read));
	 BufferedWriter	br3 = new BufferedWriter(new FileWriter(Write));
		ArrayList <StudentInfo>student =new ArrayList<StudentInfo>();
	
		String line;
		System.out.println("Are you sure?");
		String sue =input.next();
		if (sue.equals("yes")) {
		while( (line=br2.readLine()) != null) 
	    { 
	    String[] pices = line.split(",");
	ID=pices[0];
    name=pices[1];
	surname=pices[2];
	grade1=Integer.parseInt(pices[3]);
	grade2=Integer.parseInt(pices[4]);
	grade3=Integer.parseInt(pices[5]);
	grade4=Integer.parseInt(pices[6]);
	grade5=Integer.parseInt(pices[7]);
	GPA=Double.parseDouble(pices[8]); 
if ( !StuID.equals(pices[0])) {
	
	 	StudentInfo st1 =new StudentInfo(ID,name,surname, grade1, grade2, grade3, grade4, grade5,GPA);
	 student.add(st1);
	 br3.write(""+ID+","+name+","+surname+","+ grade1+","+ grade2+","+ grade3+","+ grade4+","+grade5+","+GPA+","+System.lineSeparator()); }}
}	
		else System.out.println("Thank you");
			br2.close();
		br3.close();}
	 else if  (x==2) {
		 System.out.println("please enter the studentID");
			String StuID= input.next();
			File read= new File("StudentINFO.txt");
			File Write= new File("StudentINFOad.txt");
		 BufferedReader	br2 = new BufferedReader(new FileReader(read));
		 BufferedWriter	br3 = new BufferedWriter(new FileWriter(Write));
			String line;
			System.out.println("Are you sure?");
			String sue =input.next();
			if (sue.equals("yes")) {
			while( (line=br2.readLine()) != null) 
		    { 
		    String[] pices = line.split(",");
		ID=pices[0];
	    name=pices[1];
		surname=pices[2];
		grade1=Integer.parseInt(pices[3]);
		grade2=Integer.parseInt(pices[4]);
		grade3=Integer.parseInt(pices[5]);
		grade4=Integer.parseInt(pices[6]);
		grade5=Integer.parseInt(pices[7]);
		GPA=Double.parseDouble(pices[8]); 
	if ( !StuID.equals(pices[0])) {
		
		StudentInfo[] student2 =new StudentInfo[2];
		student2[0]=new StudentInfo(ID,name,surname, grade1, grade2, grade3, grade4, grade5,GPA);
		br3.write(""+ID+","+name+","+surname+","+ grade1+","+ grade2+","+ grade3+","+ grade4+","+grade5+","+GPA+","+System.lineSeparator());
	}}
	}	
			else System.out.println("Thank you");
				br2.close();
			br3.close();
		boolean succe =Write.renameTo(read);
	
	 }
		}

 public static void Averaget() throws IOException {
	    LineNumberReader reader  = new LineNumberReader(new FileReader("StudentInfo.txt")); //open the student file
	    String line ;
	   int total=0;
	    double sum=0;
	    while(  (line=reader.readLine()) != null) 
	    {
	    
	    String[] pices = line.split(",");
		ID=pices[0];
	 name=pices[1];
		surname=pices[2];
		grade1=Integer.parseInt(pices[3]);
		grade2=Integer.parseInt(pices[4]);
		grade3=Integer.parseInt(pices[5]);
		grade4=Integer.parseInt(pices[6]);
		grade5=Integer.parseInt(pices[7]);
		GPA=Double.parseDouble(pices[8]); 
		ArrayList <StudentInfo>student =new ArrayList<StudentInfo>();
	 	StudentInfo st2 =new StudentInfo(ID,name,surname, grade1, grade2, grade3, grade4, grade5,GPA);
	 student.add(st2);
	 sum+=Double.parseDouble(pices[8]);  //calculate the number of student's GPA
			 }	
            total=reader.getLineNumber();	
		double Average = sum/total; // calculate  the average of the class
		System.out.print("The Average of the class is :\n"+Average+"\n");
		reader.close();
	 
 }
public static void showGpaOfStudent() throws IOException {

	 BufferedReader	br4 = new BufferedReader(new FileReader("StudentInfo.txt"));
	String line;
	 System.out.println("please enter the studentID");
		String StuID= input.next();
	while( (line=br4.readLine()) != null) 
    { 
    String[] pices = line.split(",");
GPA=Double.parseDouble(pices[8]); 
if ( StuID.equals(pices[0])) { // check  if the student id is true then get the GPA of Student 

System.out.println("The GPA of student is :"+pices[8]);
}}}
static int binarySearch(ArrayList student, int l, int r, String key) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (student.get(mid) == key)
                return (int) student.get(mid+1);
            if (student.get(mid) != key)
                return binarySearch(student, l, mid - 2, key);

            return binarySearch(student, mid + 2, r, key);
        }
        return -1;

    }	

}
