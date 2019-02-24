
public class SortedLinkedList implements SortedLinkListInterface{
	public Node head; 
	public int size; 
	public SortedLinkedList(){
		this.head = null; 
		this.size=0;
	}
	@Override
	public void insert( int data) {
		this.size++ ;
		Node newNode = new Node(data);
		if(this.head==null){
			this.head = newNode;
		}else if(this.head.data>newNode.data){
			newNode.next = this.head;
			this.head = newNode;
		}else{
			Node cur = this.head ; 
			Node pre = null;
			while(cur!= null){
				if(newNode.data<cur.data){
					pre.next = newNode;
					newNode.next = cur; 
					return ; 
				}
				pre = cur; 
				cur = cur.next;
			}
			pre.next = newNode;
		}
	}

	@Override
	public void delete(int data) {
		//delete one only 
		if(this.size == 0 || this.size ==1){
			this.head = null ; 
		}
		if(this.head.data == data){
			this.head = this.head.next;
			return; 
		}
		
		Node cur = this.head;
		Node pre = cur;
		while(cur!= null){
			if(cur.data == data){
				pre.next = cur.next;
				return; 
			}
			pre = cur ; 
			cur = cur.next;
			
		}
		
		
	}

	@Override
	public void clearAll() {
		this.head = null;
	}

	@Override
	public Node reverseLinkList(Node head) {
		Node newHead = null; 
		while(head!=null){
			Node next = head.next;
			head.next = newHead ;
			newHead = head;
			head = next;
		}
		return newHead;
	}

	@Override
	public void printLinkedList() {
		Node cur = this.head;
		while(cur!=null){
			System.out.println(cur.data);
			cur = cur.next;
		}
	}
	@Override
	public int getSize() {
		return this.size;
	}

}
