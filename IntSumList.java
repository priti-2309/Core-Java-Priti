package Lab;

import java.util.*;

public class IntSumList {

		public static void main(String[] args) {
			List<Integer>Num=new ArrayList<>();
			Num.add(10);
			Num.add(20);
			Num.add(30);
			Num.add(40);
			System.out.println(Num);
			
			//To add numbers in ArrayList
			 int sum = 0;
		        for (int num : Num) {
		            sum += num;
		        }
		        System.out.println("The sum of elements in ArrayList is:" +sum);
		}

	}
