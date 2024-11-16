package Stack_Operation_Array;

public class MainClass {

	public static void main(String[] args) {
		
		// initialize stack size through constructor
		Stack_Operation_Array stack = new Stack_Operation_Array(4);
		
		//insert the value into stack by push method
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		//fetch and remove the value from stack using pop method
		System.out.println(stack.pop());
		
		//find top value of stack using peek method
		System.out.println(stack.peek());
		
		//delete the entire stack using deletion method
		stack.deletion();
		
		// try to fetch peek value of stack
		System.out.println(stack.peek());
	}
}
