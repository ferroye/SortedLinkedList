
public class SortedLinkedListApplication {

	public static void main(String[] args) {
		SortedLinkedList my = new SortedLinkedList();
		my.insert(5);
		my.insert(1);
		my.insert(2);
		my.printLinkedList();
		System.out.println();
		my.delete(1);
		my.printLinkedList();
//		
//		Node head = my.reverseLinkList(my.head);
//		
//		while(head!=null){
//			System.out.println(head.data);
//			head = head.next;
//		}
	}

}
