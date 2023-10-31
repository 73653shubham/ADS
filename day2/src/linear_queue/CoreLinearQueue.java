package linear_queue;
import custom_exception.QueueException;
import queue.LinearQueue;
public class CoreLinearQueue {

	public static void main(String[] args) throws QueueException {
		
		LinearQueue l1=new LinearQueue(5);
		l1.enqueue(5);
		l1.enqueue(10);
		l1.enqueue(15);
		l1.enqueue(20);
		l1.enqueue(25);
		System.out.println("Is stack full : "+l1.isFull());
		System.out.println("Is stack empty : "+l1.isEmpty());
		System.out.println("delete element : "+l1.dequeue());
		System.out.println("delete element : "+l1.dequeue());
		System.out.println("delete element : "+l1.dequeue());
		System.out.println("delete element : "+l1.dequeue());
		System.out.println("Is stack full : "+l1.isFull());
		System.out.println("Is stack empty : "+l1.isEmpty());
		
	}

}
