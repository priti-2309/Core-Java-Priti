//Create Emp details eid,ename,companyname using static variable,static method

package Lab;

public class staticEmp {
	static void emp(int num,String name,String cmp) {
		System.out.println("Employee ID:"+num+"  Name:"+name+"  Company:"+cmp);
	}


	public static void main(String[] args) {
		emp(101,"Anusha","Acceture");
		System.out.println();
		emp(102,"Esha","TCS");

	}

}
