// not my code
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class A{
    public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String []num = sc.nextLine().split(" ");
		int n = Integer.parseInt(num[0]);
		int m = Integer.parseInt(num[1]);

		while(n != 0){
			// initialize the queue
			Queue<Integer> queue = new LinkedList<Integer>();
			queue.clear();
			for (int i = 1; i <= n; i++)
				queue.add(i);

			int res = 0;
			while (!queue.isEmpty()) {
				for (int i = 0; i < m-1; i++)
					queue.add(queue.remove());
				res = queue.remove();
			}
			//System.out.println(res);
			System.out.println(res);

			String []num2 = sc.nextLine().split(" ");
			n = Integer.parseInt(num2[0]);
			m = Integer.parseInt(num2[1]);
		}
    }
}

