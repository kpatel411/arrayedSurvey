
public class DLList<T> {
	private DLLNode<T> head; 
	private DLLNode<T> tail; 
	private int size;
	
	public DLList() {
		// the list starts out empty with size of 0
		this.size = 0;
		// create dummy head and tail nodes with no data 
		this.head = new DLLNode<T>(null); //null in ()
		this.tail = new DLLNode<T>(null); //null in ()
		// set the next of the head to the tail (prev is null) 
		this.head.setNext(this.tail);
		// set the prev of the tail to the head (next is null) 
		this.tail.setPrev(this.head);
	}
	
	//ADD METHODS
	/**
	 * 
	 * @param baseNode
	 * @param newNode
	 * adds a new node to the after 
	 */
	private void addAfter(DLLNode<T> baseNode, DLLNode<T> newNode) {
		// 1. get the next node for the baseNode
		DLLNode<T> nextNode = baseNode.getNext();
		// 2. set the next node of the new node to the next node 
		newNode.setNext(nextNode);
		// 3. set the prev node of the new node to the base node 
		newNode.setPrev(baseNode);
		// 4. set the next node of the baseNode to the new node 
		baseNode.setNext(newNode);
		// 5. set the prev node of nextNode to the new node 
		nextNode.setPrev(newNode);
		// 6. increase the size of the list
		this.size++;
	}
	
	public void add(T data) {
		// 1. create a new DLLNode to store the data 
		DLLNode<T> newNode = new DLLNode<T>(data);
		// 2. link this node after whatever is the current tail's previous node
		DLLNode<T> baseNode = this.tail.getPrev(); 
		this.addAfter(baseNode, newNode);
	}
	
	public void add(int index, T data) {
		// 1. create a new DLLNode to store the data 
		DLLNode<T> newNode = new DLLNode<T>(data);
		DLLNode<T> baseNode = new DLLNode<T>(data);
		// 2.  link this node after whatever is the specified index???
		if (index < 0 || index > this.size + 1) {
			System.out.print("Invalid position!");
		}
		if (this.head == null) { //list is empty, index must be 0
			this.head = newNode;
			this.tail = newNode;
		}
		else if (index == 0) { //index before head
			 this.head = newNode.getNext();
			 newNode = this.head.getPrev();
			 this.head = newNode;
		}
		else if (index == (this.size +1)) { //index after tail
			this.tail = newNode.getPrev();
			newNode = this.tail.getNext();
			this.tail = newNode;
		}
		else { //general case
			for (int i = 0; i < index; i++) {
					baseNode = baseNode.getPrev();
					//baseNode now points to the node before the insert point 
				}
			newNode.getNext(); 
			baseNode.getNext();
			baseNode = newNode.getPrev();
			newNode = newNode.getNext().getPrev();
			
			}
			this.size++;
		}
	
	
	public void addFirst(T data) {
		// 1. create a new DLLNode to store the data 
		DLLNode<T> newNode = new DLLNode<T>(data);
		// 2. link this node after whatever is the current HEAD'S previous node
		DLLNode<T> baseNode = this.head.getPrev(); 
		this.addAfter(baseNode, newNode);
	}
	
	public void addLast(T data) {
		this.add(data);
	}
	
	
	//REMOVE METHODS
	public T removeNode(DLLNode<T> rNode) {
		DLLNode<T> rPrev = rNode.getPrev();
		DLLNode <T> rNext = rNode.getNext();
		rPrev.setNext(rNext);
		rNext.setPrev(rPrev);
		this.size--;
		return rNode.getNodeData();
	}
	
	public T remove(int index) {
		//if linked list is empty
		DLLNode<T> temp = this.head; //store head node 
		DLLNode<T> rNode = temp.getNext();
		if (temp == null || rNode.getNext() == null) {
			return null;
		}
		//if head needs to be removed
		//find previous node of the node to be deleted
		for (int i = 0; i<index; i++) {
			temp = temp.getNext();
		}
		if (index == 0) {
			this.size --;
			this.head = temp.getNext();//change head
		}
		else {
			removeNode(temp);
			temp.setPrev(rNode);
		}
		return temp.getNodeData();
		//if position is more than the number of nodes
		//node temp->next is the node to be deleted
		//store pointer to the next of node to be deleted
		
		//unlink deleted node from list
		
		///FIX GET HELPER METHOD
		
	}
	
	public DLLNode<T> removeFirst() {
		if (this.head == null) {
			return null;
		}
		//DLLNode<T> temp = this.head;
		head = head.getNext();
		return head;
	}
	
	public T removeLast() {
		DLLNode<T> rNode = this.tail.getPrev();
		DLLNode<T> prevNode = rNode.getPrev();
		if (this.head.getNext() == this.tail) {
			System.out.print("The list is empty");
		}
		else {
			removeNode(rNode);
			this.tail.setPrev(prevNode);
		}
		return rNode.getNodeData();
		//this.remove(this.tail.getPrev());
	}
	
	//GET METHODS
	public T getFirst() throws Exception{
		if (this.head == null) {
			throw new Exception("No elements found in Linked List");
		}
		return this.head.getNodeData();//should be data rather than the method
	}
	
	public T getLast() throws Exception{
		if (this.head == null) {
			throw new Exception ("No elements found in Linked List");
		}
		DLLNode<T> temp = this.head;
		while (temp.getNext() != null) {
			temp = temp.getNext();//should be next rather than getNext
		}
		return temp.getNodeData();//should be data rather than the method
	}
	/**
	 * 
	 * @param index
	 * @return gets node at a specified location
	 */
	public T get(int index) {
		DLLNode<T> current = this.head;
		//first check to see if index is valid
		if (index < 0 || index >= this.size) {
			System.out.print("Index is out of bounds.");
		}
		else {
			for (int i=0; i <= index; i++) {
				current = current.getNext(); 
			}
		}
		return current.getNodeData();
	}
	
	//OTHER METHODS
	public void clear() {
		// 1. set size to 0
		this.size = 0;
		// 2. empty contents of the stack
		this.head = tail;
		this.tail = head;
		
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public int size() {
		return this.size;
	}
	
	public void printList() {
		DLLNode <T> current = this.head.getNext();
		while (current != this.tail) {
			T t = current.getNodeData(); 
			System.out.println(t);
			current = current.getNext();
		}
	}

}
