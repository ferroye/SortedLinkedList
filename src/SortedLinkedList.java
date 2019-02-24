
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
	public void delete(SortedLinkedList list, int data) {
		
		
	}

	@Override
	public void clearAll(SortedLinkedList list) {
		
		
	}

	@Override
	public SortedLinkedList reverseLinkList(SortedLinkedList list) {
		
		return null;
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
