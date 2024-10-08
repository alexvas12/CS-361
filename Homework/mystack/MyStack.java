/**
 * 
 */
package mystack;

/**
 * @author Alex Vasilevsky
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if(theStack == null){
			return null;
		}
		T data = theStack.val;
		theStack = theStack.next;
		return data;
	}

	public void push(T v) {
		// TODO To complete
		theStack = new MyNode<T>(v,theStack);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> ints = new MyStack<Integer>();
		ints.push(1);
		ints.push(2);
		System.out.println(ints.toString());
		System.out.println("The popped node from the stack is: " + ints.pop());
		ints.push(5);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name

		MyStack<Person> people = new MyStack<Person>();
		people.push(new Person("Alex","Vasilevsky"));
		people.push(new Person("Christelle","Scharff"));
	}
}