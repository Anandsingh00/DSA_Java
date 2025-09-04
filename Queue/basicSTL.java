package Queue;
import java.util.*;
public class basicSTL {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(92);
		q.add(43);
		System.out.println(q.size());
		q.add(23);
		q.add(65);
		q.add(8);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		
	}

}
