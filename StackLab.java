package Lab;

import java.util.*;

public class StackLab {

	public static void main(String[] args) {
		Stack<String>stk=new Stack<>();
		stk.add("Sun");
		stk.add("Moon");
		stk.add("Earth");
		stk.add("Mercury");
		stk.add("Venus");
		stk.add("Mars");
		stk.add("Jupiter");
		stk.add("Saturn");
		stk.add("Uranus");
		stk.add("Neptune");
		Iterator<String> i=stk.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("Stack:"+stk);
		//Removing 4 elements using pop()
		stk.pop();
		stk.pop();
		stk.pop();
		stk.pop();
		System.out.println("Stack after removing elements:"+stk);
	}

}
