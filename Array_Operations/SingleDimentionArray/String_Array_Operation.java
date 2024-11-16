package SingleDimentionArray;

public class String_Array_Operation {

	String [] arr;

	// creation
	public String_Array_Operation(int size) {
		arr = new String [size];

		for (int i = 0; i < arr.length; i++) {// ---> O(N)
			arr[i] = null;
		}
	}

	// insertion
	public void insertion(int index, String value) {// ---> O(1)

		try {
			if (arr[index] == null) {
				arr[index] = value;
				System.out.println("In Index No " + index + " The Value '" + value + "' is Inserted successfully");
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
	public void search(String search) {// ---> O(N) linear search
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println("Index of search value is : " + i);
				return;
			}
		}
		System.out.println("The value is not present");
	}
	
	//deletion
	public void deletion(int index) {// ---> O(1)
		try {
			if(arr[index] != null) {
				System.out.println("The value '"+arr[index]+"' is deleted");
				arr[index] = null;
			}else {
				System.out.println("No element inserted into given index");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid input");
		}
	}

}
