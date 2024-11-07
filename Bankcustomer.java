//Bankcustomer class with acno,atype,amt fields using parameterized constructor

package Lab;

public class Bankcustomer {
 Bankcustomer(int acc_no,String acc_type,double amt){
	 System.out.println("Account No:"+acc_no+"  Account Type:"+acc_type+"  Amount:"+amt);
	 System.out.println();
 }
	public static void main(String[] args) {
		Bankcustomer bk=new Bankcustomer(101,"Current",10000);
		Bankcustomer bk1=new Bankcustomer(102,"Current",8000);
		Bankcustomer bk2=new Bankcustomer(103,"FD",20000);

	}

}
