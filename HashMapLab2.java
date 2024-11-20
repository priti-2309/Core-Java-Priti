package Lab;
import java.util.*;

public class HashMapLab2 {

	public static void main(String[] args) {
		Map<Integer, String>sub=new LinkedHashMap();
		sub.put(101, "English");
		sub.put(102, "Maths");
		sub.put(103, "Science");
		sub.put(104,"History");
		sub.put(105, "Geography");
        
		System.out.println(sub.entrySet());
		
		//to check is hash map is empty or not using isEmpty() method
		System.out.println("Is the Hash Map empty?: "+sub.isEmpty());
	}

}
