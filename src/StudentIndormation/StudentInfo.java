package StudentIndormation;
public class StudentInfo {
	//Declaration of variables
	private String name;
	private String ID;
	private String lastName;
	private int MathGrad;
	private int PhyGrade;
	private int chimGrade;
	private int LanguGrade;
	private int progGrade;
	private int quantity;
	private static double GPA;
	public StudentInfo(String a,String v,String m,int w,int r,int wp,int y,int l ,double GPA) { // the construct of class 
		
		this.ID =a;
		this.name= v;
		this.lastName=m;
		this.MathGrad=w;
		this.PhyGrade=r;
		this.chimGrade=wp;
		this.LanguGrade=y;
		this.progGrade=l;
		this.GPA=GPA;
	}
	public StudentInfo() {}
	 public void setName(String name2) { // set student name method
		 this.name=name2;
	 }
	 public String getName() {// get student name method
		return this.name;
	 }
	 public void setID(String name2) {// set student ID method
		 this.ID=name2;
	 }
	 public String getID() {// get student ID method
		return this.ID;
	 }
	 public void setLastName(String lastName2) {// set student surname method
		 this.lastName="";
	 }
	 public String getLastName() {// get student surname method
		return this.lastName;
	 }
	 public void setMathGrad(double a) { // set the first grade
		 this.MathGrad=0;
	 }
	 public double getMathGrad() {//get the first grade
		return this.MathGrad;
	 }
	 public void setPhyGrade(double a) {// set the second grade
		 this.PhyGrade=0;
	 }
	 public double getPhyGrade() {// get the second grade
		return this.PhyGrade;
	 }
	 public void setLanguGrade(double a) {
		 this.LanguGrade=0;
	 }
	 public double getLanguGrade() {
		return this.LanguGrade;
	 }
	 public void setchimGrade(double a) {
		 this.chimGrade=0;
	 }
	 public double getchimGrade() {
		return this.chimGrade;
	 }
	 public void setprogGrade(double a) {
		 this.progGrade=0;
	 }
	 public   double getprogGrade( ) {
		return this.progGrade;
	 }
	 public static void setGPA(int grade1,int grade2,int grade3,int grade4,int grade5) { // calculate the GPA of Student
		  GPA= (grade1+grade2+grade3+grade4+grade5)/5;
		 }
	 public static double getGPA() {
		 return GPA;
	 }
	public int compareTo(StudentInfo studentInfo) { // compare method for bubble sort
		int res=0;
		if (quantity < studentInfo.quantity) {res=-1;  }
        if (quantity > studentInfo.quantity){res=1;}
      return res;
	}

}
