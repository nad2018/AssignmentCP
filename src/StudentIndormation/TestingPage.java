package StudentIndormation;
import java.io.IOException;
import java.util.Scanner;

public class TestingPage {

   
	public static Scanner input= new Scanner(System.in);
	
	public static void main( String[] args ) throws IOException 
    {  long start = System.currentTimeMillis(); // for calculating the running time
		System.out.println("Select what you want to do:");
	 System.out.println("1.Add student\n2.list  of student \n3.Search single student\n4.Update Student informations"
	 		+ "\n5.Delete student\n6.Show GPA\n7.Show the average ofGPA\n8.Exit");
	 System.out.println("*****************************");
	 int x=0;
	 x=input.nextInt(); //input the user choice
	 while(x!=8)
    {     
			 if (x==1) {
				Operations.addStudent();
				long end = System.currentTimeMillis();;
			    System.out.println("Total running time\t"+(end - start) + " ms"); // show the value of running time
			    TestingPage.main(args);
            	}
			 if (x==2) {
					Operations.ListStudent();
					long end = System.currentTimeMillis();;
				    System.out.println("Total running time\t"+(end - start) + " ms"); // show the value of running time
				    TestingPage.main(args);

	            	}
			 if (x==3) {
					Operations.Search();
				    long end = System.currentTimeMillis();;
				    System.out.println("Total running time\t"+(end - start) + " ms"); // show the value of running time
				    TestingPage.main(args);

	            	}
			 if (x==4) {
					Operations.Update();
					long end = System.currentTimeMillis();;
				    System.out.println("Total running time\t"+(end - start) + " ms"); // show the value of running time
				    TestingPage.main(args);

	            	}
			 if (x==5) {
					Operations.Delete();
					long end = System.currentTimeMillis();;
				    System.out.println("Total running time\t"+(end - start) + " ms"); // show the value of running time
				    TestingPage.main(args);
	            	}
			 if (x==6) {
				Operations.showGpaOfStudent();
				long end = System.currentTimeMillis();;
			    System.out.println("Total running time\t"+(end - start) + " ms"); // show the value of running time
			    TestingPage.main(args);
}
                
			 if (x==7) {
					Operations.Averaget();
					long end = System.currentTimeMillis();;
				    System.out.println("Total running time\t"+(end - start) + " ms"); // show the value of running time
				    TestingPage.main(args);
	            	}
    }

	 
             
                         }
			 
    
  
    
    
    
    }
