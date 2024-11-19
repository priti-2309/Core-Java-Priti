package collectionDemo;

import java.util.*;

public class SortedSetDemo {
	public static void main(String[] args) {
		//Sorted Set uses TreeSet class to get implemented.
		//A normal set prints values in random manner, Sorted Set prints values in sorted sequential manner.
		//Also duplicate values don't get printed
SortedSet<Integer> set=new TreeSet<>();
set.add(1);
set.add(1);
set.add(41);
set.add(11);
set.add(21);
set.add(31);
set.add(15);
Iterator<Integer> i=set.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
}
	}