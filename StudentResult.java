package Lab;

import java.util.Scanner;

public class StudentResult {
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter student name:");
	String name=sc.nextLine();
	
	System.out.print("Enter English score:");
	int eng=sc.nextInt();
	
	System.out.print("Enter Maths score:");
	int mat=sc.nextInt();
	
	System.out.print("Enter Science score:");
    int sci=sc.nextInt();
	
	System.out.print("Enter History score:");
	int hist=sc.nextInt();
	
	System.out.print("Enter Geography score:");
	int geo=sc.nextInt();
	
	int total=eng+mat+sci+hist+geo;
	System.out.println("The total score is:"+total);
	
	double avg=eng+mat+sci+hist+geo/5;
	System.out.println("The average is"+avg);
	
	if(total>=50)
	{
		System.out.println("Student is pass");
	}
	else {
		System.out.println("Student is fail");
		}
	}
}
