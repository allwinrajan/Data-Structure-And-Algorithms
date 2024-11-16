package Stack_Operation_Array;

public class Stack_Operation_Array {

	int[] Stack;
	int topOfStack;

	//creation of stack
	public Stack_Operation_Array(int sSize) {
		this.Stack = new int[sSize];
		topOfStack = -1;
	}

	//ensure stack is empty or not
	public boolean isEmpty() {
		return topOfStack == -1;
	}

	//ensure the stack is full or not
	public boolean isFull() {
		return topOfStack == Stack.length - 1;
	}

	//insertion of the stack values
	public void push(int value) {
		if (isFull()) {
			System.out.println("The stack is full");
		} else {
			Stack[topOfStack + 1] = value;
			topOfStack++;
			System.out.println("The Value: " + value + " is inserted");
		}
	}

	//fetch and delete the stack values
	public int pop() {
		if (isEmpty()) {
			System.out.println("The stack is empty");
			return -1;
		} else {
			int value = Stack[topOfStack];
			topOfStack--;
			return value;
		}
	}
	
	//fetch the top most element of stack
	public int peek() {
		if(isEmpty()) {
			System.out.println("The stack is empty");
			return -1;
		} else {
			return Stack[topOfStack];
		}
	}
	
	//delete the entire stack
	public void deletion() {
		Stack = null;
		System.out.println("The stack is deleted");
	}
}
