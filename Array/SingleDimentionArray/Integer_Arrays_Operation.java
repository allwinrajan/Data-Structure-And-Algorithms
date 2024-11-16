package SingleDimentionArray;

/*Array Operation
 * 
 * Creation
 * Insertion
 * Traverse
 * Searching
 * Deletion
 * 
 * */

public class Integer_Arrays_Operation {
	
	//declare in globally
	int arr[];

	// creation
	public Integer_Arrays_Operation(int size) {
		arr = new int[size];

		for (int i = 0; i < arr.length; i++) {// ---> O(N)
			arr[i] = Integer.MIN_VALUE;
		}
	}

	// insertion
	public void insertion(int index, int value) {// ---> O(1)

		try {
			if (arr[index] == Integer.MIN_VALUE) {
				arr[index] = value;
				System.out.println("In Index No " + index + " The Value " + value + " is Inserted successfully");
			} else {
				System.out.println("The field is already filled");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid input try again!");
		}
	}

	// traverse
	public void traverse() {// ---> O(N)
		System.out.print("The values are : [ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	// searching
	public void search(int search) {// ---> O(N) [ linear search ]
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println("index of search value is : " + i);
				return;
			}
		}
		System.out.println("the value is not present");
	}
	
	//deletion
	public void deletion(int index) {// ---> O(1)
		try {
			if(arr[index] != Integer.MIN_VALUE) {
				System.out.println("The value "+arr[index]+" is deleted");
				arr[index] = Integer.MIN_VALUE;
			}else {
				System.out.println("No element inserted into given index");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid input");
		}
	}

}
