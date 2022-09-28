
public class GenericQueue<T> {
	
	// declare the queueList
	protected DLList<T> queueList; 
	
	// constructor 
	public GenericQueue() {
		queueList = new DLList<T>(); 
	}
	
	// enqueue method 
	public void enqueue(T data) {
		queueList.addFirst(data);
	}
	
	//dequeue 
	public DLLNode<T> dequeue() {
		return queueList.removeFirst();
	}
	
	// peek method 
	public T peek() {
		return queueList.get(0);
	}
	
	public boolean empty() {
		return queueList.isEmpty();
	}
	
	public void clear() {
		queueList.clear();
	}
	
	public void print() {
		queueList.printList();
	}
	public void size() {
		queueList.size();
	}
}
