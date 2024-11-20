package Lab;
import java.util.*;

public class HashMapLab3 {

	public static void main(String[] args) {
		Map<String,Integer>cricket=new LinkedHashMap();
		cricket.put("Rohit Sharma",87);
		cricket.put("Virat Kohli",83);
		cricket.put("Hardik Pandya",70);
		cricket.put("Suryakumar Yadav",78);
		cricket.put("Ishan Kishan",68);
		
		System.out.println("Cricketer and their scores are: "+cricket.entrySet());
		
		//to get a cricketer as input and to display their score
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the cricketer's name to get his score: ");
        String cricketerName = sc.nextLine();

        if (cricket.containsKey(cricketerName)) {
            int score = cricket.get(cricketerName);
            System.out.println(cricketerName + "'s score: " + score);
        } else {
            System.out.println("Cricketer not found");
        }

	}

}
