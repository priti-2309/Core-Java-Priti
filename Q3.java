//Sort array in Descending order

package Lab;
import java.util.Arrays;
import java.util.Collections;

public class Q3 {

	public static void main(String[] args) {
		Integer a[] = { 1, 2, 3, 4, 5, 9, 8, 6, 7 };

        // Sorting the array in descending order
        Arrays.sort(a, Collections.reverseOrder());

        System.out.println(Arrays.toString(a));

	}

}
