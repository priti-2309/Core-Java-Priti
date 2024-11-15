package Lab;

import java.util.*;

public class RevStringList {

	public static void main(String[] args) {
		List<String>Planets=new ArrayList<>();
		Planets.add("Mercury");
		Planets.add("Venus");
		Planets.add("Earth");
		Planets.add("Mars");
		Planets.add("Jupiter");
		System.out.println(Planets);
		
		//To reverse a String List using reversed() method.
		Planets.reversed();
		System.out.println(Planets.reversed());
	}

}
