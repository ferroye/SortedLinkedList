
public class SortedLinkedList implements SortedLinkListInterface{
	public Node head; 
	public int size; 
	public SortedLinkedList(){
		this.head = null; 
		this.size=0;
	}

	@Override
	public void insert(SortedLinkedList list, int data) {
		this.size++ ;
		Node newNode = new Node(data);
		if(list.head==null){
			list.head = newNode;
		}else if(this.head.data>newNode.data){
			newNode.next = list.head;
			list.head = newNode;
		}else{
			Node cur = list.head ; 
			Node pre = null;
			
			
		}
		
		
	}

	@Override
	public void delete(SortedLinkedList list, int data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearAll(SortedLinkedList list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SortedLinkedList reverseLinkList(SortedLinkedList list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printLinkedList(SortedLinkedList list) {
		// TODO Auto-generated method stub
		
	}

}
