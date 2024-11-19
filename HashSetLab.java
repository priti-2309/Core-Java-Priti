package Lab;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetLab {

	public static void main(String[] args) {
		Set<Integer> set=new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		Iterator<Integer> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Set before appending new elements:"+set);
		set.add(60);
		set.add(70);
		set.add(80);
		set.add(90);
		set.add(100);
		System.out.println("Set after appending new elements:"+set);

	}

}
