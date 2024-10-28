//Create a employee class and display 5 employee details with name, salary and age

package Lab;


class Empname{
	int Id;
	String name;
	int age;
	double salary;
}


public class EmpData {

	public static void main(String[] args) {
		Empname em1=new Empname();
		em1.Id=2401;
		em1.name="Priti";
		em1.age=20;
		em1.salary=25000;
		System.out.println("Id:"+em1.Id+" "+"Name:"+em1.name+" "+"Age:"+em1.age+" "+"Salary:"+em1.salary);
		
		Empname em2=new Empname();
		em2.Id=2402;
		em2.name="Anusha";
		em2.age=20;
		em2.salary=20000;
		System.out.println("Id:"+em2.Id+" "+"Name:"+em2.name+" "+"Age:"+em2.age+" "+"Salary:"+em2.salary);
		
		Empname em3=new Empname();
		em3.Id=2403;
		em3.name="Jyotsana";
		em3.age=21;
		em3.salary=22000;
		System.out.println("Id:"+em3.Id+" "+"Name:"+em3.name+" "+"Age:"+em3.age+" "+"Salary:"+em3.salary);
		
		Empname em4=new Empname();
		em4.Id=2404;
		em4.name="Vina";
		em4.age=26;
		em4.salary=25000;
		System.out.println("Id:"+em4.Id+" "+"Name:"+em4.name+" "+"Age:"+em4.age+" "+"Salary:"+em4.salary);
		
		Empname em5=new Empname();
		em5.Id=2405;
		em5.name="Riya";
		em5.age=22;
		em5.salary=24000;
		System.out.println("Id:"+em5.Id+" "+"Name:"+em5.name+" "+"Age:"+em5.age+" "+"Salary:"+em5.salary);	
		
}
}