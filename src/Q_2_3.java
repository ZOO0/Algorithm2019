/*
*2.3* 중간 노드 삭제 : 
	단반향 연결리스트가 주어졌을 때 중간(정확히 가운데 노드일 필요는 없고 처음과 끝 노드만 아니면 된다)에 있는 노드 하나를 삭제하는 알고리즘을 구현하라.
 	단, 삭제할 노드에만 접근 할 수 있다.
	예제) *입력* : 연결리스트 a -> b -> c -> d -> e에서 노드 c
 	*결과* : 아무것도 반환할 필요는 없지만, 결과로 연결리스트 a -> b -> d -> e가 되어 있어야한다.
 */

public class Q_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.append("a");
		list.append("b");
		list.append("c");
		list.append("d");
		list.append("e");
		
		deleteMiddleNode(list);
		
	}
	
	public static void deleteMiddleNode(LinkedList list) {
		int count = 0;
		Node current = list.head;
		
		while (current.next != null) {
			count ++;
			current = current.next;
		}
		
		int deleteNodeIndex = count/2;
		current = list.head;
		for (int i=0; i < deleteNodeIndex; i++) {
			current = current.next;
			if (i == deleteNodeIndex) {
				current.next = current.next.next;
			}
		}
		System.out.println(list);
		
	}
	
	public static class Node {
		Node next = null;
		String data;
		
		public Node(String data) {
			this.data = data;
		}
	}
	
	public static class LinkedList {
		Node head;
		
		public void append(String data) {
			if (head == null) {
				head = new Node(data);
				return;
			}
			
			Node current = head;
			while (current.next != null) {
				current = current.next; //하나씩 이동
			}
			//current.next가 null 일때 = 맨끝일때
			current.next = new Node(data);
		}
		
		public void prepend(String data) {
			if (head == null) {
				head = new Node(data);
				return;
			}
			
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
		
		public void delete(String data) {
			if (head == null) { return; }
			if (head.data == data) {
				head = head.next;
				return;
			}
			
			Node current = head;
			while (current.next != null) {
				if (current.next.data == data) {
					current.next = current.next.next;
					return;
				}
				current = current.next;
			}
		}
	}

	
}
