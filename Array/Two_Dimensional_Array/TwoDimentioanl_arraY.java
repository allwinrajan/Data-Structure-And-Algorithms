package Two_Dimensional_Array;

public class TwoDimentioanl_arraY {

	int[][] arr;

	public TwoDimentioanl_arraY(int rSize, int cSize) { // ---> O(N^2) 3,3

		arr = new int[rSize][cSize];

		for (int row = 0; row < arr.length; row++) {
			for (int coloum = 0; coloum < arr[row].length; coloum++) {
				arr[row][coloum] = Integer.MIN_VALUE;
			}
		}
	}

	public void insertion(int row, int coloum, int value) { // ---> O(1)
		try {
			if (arr[row][coloum] == Integer.MIN_VALUE) {
				arr[row][coloum] = value;
				System.out.println(
						"In the row : " + row + " and coloum : " + coloum + " The value " + value + " is inserted");
			} else {
				System.out.println("The Entered value " + value + " already exist");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid input Try Again!");
		}
	}

	public void traverse() { // ---> O(N^2)
		System.out.println("The value are : ");
		for (int row = 0; row < arr.length; row++) {
			for (int coloum = 0; coloum < arr.length; coloum++) {
				System.out.print(arr[row][coloum] + " ");
			}
			System.out.println();
		}
	}

	public void searchingByRowColoum(int row, int coloum) { // ---> O(N)
		try {
			if (arr[row][coloum] != Integer.MIN_VALUE) {
				System.out.println("In the row : " + row + " coloum : " + coloum + " value : " + arr[row][coloum]+" is present");
			} else {
				System.out.println("No value will be generated");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid input Try Again!");
		}
	}

	public void searchingByValue(int value) { // ---> O(N^2)
		for (int row = 0; row < arr.length; row++) {
			for (int coloum = 0; coloum < arr.length; coloum++) {
				if (arr[row][coloum] == value) {
					System.out.println("The value: "+value+" present in row : " + row + " coloum : " + coloum);
					return;
				}
			}
		}
		System.out.println("The value not present");
	}
	
	public void deleteByRowColoum(int row, int coloum) {//  ---> O(N)
		try {
			if (arr[row][coloum] != Integer.MIN_VALUE) {
				arr [row] [coloum] = Integer.MIN_VALUE;
				System.out.println("The value in row : "+row+" coloum : "+coloum+" will be deleted");
			} else {
				System.out.println("No value will be found");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid input Try Again!");
		}
	}
	
	public void deleteByValue(int value) { // ---> O(N^2)
		for (int row = 0; row < arr.length; row++) {
			for (int coloum = 0; coloum < arr.length; coloum++) {
				if (arr[row][coloum] == value) {
					arr[row][coloum] = Integer.MIN_VALUE;
					System.out.println("The value "+value+" in row : "+row+" coloum : "+coloum+" is deleted");
					return;
				} 
			}
		}
		System.out.println("The value not found");
	}

}
