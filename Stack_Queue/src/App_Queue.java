import java.util.PriorityQueue;
import java.util.Queue;

public class App_Queue {

	public static void main(String[] args) {
		
		Queue <Integer> q = new PriorityQueue<>();
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		q.add(90);

		System.out.println(q);
	}

}
