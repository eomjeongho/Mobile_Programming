package kr.ac.kookmin.StackGeneric;

public class StackGeneric {
	public static void main(String arg[]){
		Stack<Integer> stackInteger = new Stack<Integer>();	
		stackInteger.push(1);
		stackInteger.push(2);
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
		
		Stack<String> stackString = new Stack<String>();	
		stackString.push("Kookmin University");
		stackString.push("Korea Seoul");
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
	}
}


class Stack<T> {
	Node<T> head;
	
	public T pop() {
		T value = null;
		if(head == null){
			return value;
		}
		else{
			Node<T> p = head;
			Node<T> q = head;
			while(p.getNext() != null){
				q = p;
				p = p.getNext();
			}
			value = p.getData();
			q.setNext(null);
			return value;
		}
	}
	
	public void push(T a) {
		Node<T> temp = new Node<T>(a);
		if(head == null){
			head = temp;
		}
		else{
			Node<T> p = head;
			while(p.getNext() != null){
				p = p.getNext();
			}
			p.setNext(temp);
		}
	}
}

class Node<T> {
	Node<T> next;
	T data;
	public Node(T a) {
                data = a;
                next = null;
        }
	public T getData() {
		return this.data;
	}
	public Node<T> getNext() {
		return this.next;
	}
	public void setNext(Node<T> nextNode) {
		this.next = nextNode;
	}
}