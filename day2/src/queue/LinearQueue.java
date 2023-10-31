package queue;
import custom_exception.QueueException;
public class LinearQueue {
	private int[] queue;
	private int front;
	private int rear;
	
	public LinearQueue(int size) {
		queue=new int[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isFull() {
		if(rear==(queue.length-1)) 
			return true;
		return false;
	}
	public boolean isEmpty() {
		if(front>rear || front==-1 && rear==-1) 
			return true;
		return false;
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	
	public void enqueue(int element) throws QueueException {
		if(isFull()) 
			throw new QueueException("Queue is full");
		else {
			rear++;
		queue[rear]=element;
		}
		if(front==-1)
			front++;	
	}
	public int dequeue() throws QueueException {
		if(isEmpty()) {
			throw new QueueException("Queue is empty");
		}
		else {
			int tempElement=front;
			front++;
			return queue[tempElement];
		}
		
	}
	public int peek() throws QueueException {
		if(isEmpty())
			throw new QueueException("Queue is empty");
		return rear;
	}
}
