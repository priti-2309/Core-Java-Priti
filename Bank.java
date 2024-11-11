package Lab;

import java.util.Scanner;

public class Bank {
		double balance;
		double amount;

	Bank(double balance){
		
	}

	public void withdraw(double balance) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn:");
		int amount=sc.nextInt();
		double withdrawalAmount=balance-amount;
        String wd=(balance>=amount)? "Withdrawal Is Successful":"Withdrawal Not Successful";
		System.out.println(wd);
		System.out.println("The total balance is:"+withdrawalAmount);
	}

	public void deposit(double balance) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to be deposited");
		double amount=sc.nextDouble();
		double depositAmount=balance+amount;
		System.out.println("Deposit Successful");
		System.out.println("The total balance is:"+depositAmount);
	}
	

	public static void main(String[] args) {
		Bank b1=new Bank(10000);
		b1.withdraw(10000);
		b1.deposit(10000);
		
		

	}

}


