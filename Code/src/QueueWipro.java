import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueWipro {
	public static void main(String[] args) {

		int input1 = 10;
		Queue<Integer> q = new LinkedList<>();

		q.add(10);
		q.add(11);
		q.add(7);
		q.add(8);
		q.add(8);
		q.add(8);
		q.add(10);
		q.add(-1);

		int head = q.peek();

		while (head < input1) {
			head = head + 3;
			if(head > input1)
				break;
			q.remove();
			if (q.peek() > head) {
				head = q.peek();
				
			}
		}
		int res = 0;
		List<Integer> output = new ArrayList<Integer>();
		while (q.peek() <= input1) {
			res++;
			output.add(q.peek());
			q.remove();
		}

		System.out.println(res);
		System.out.println(output);
	}

}
