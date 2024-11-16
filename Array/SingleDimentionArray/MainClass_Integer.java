package SingleDimentionArray;

public class MainClass_Integer {
	public static void main(String[] args) {
		
		//initialize the constructor by passing array size 6
		Integer_Arrays_Operation iArray = new Integer_Arrays_Operation(6);
		
		//initialize array values
		iArray.insertion(0, 10);
		iArray.insertion(1, 20);
		iArray.insertion(2, 30);
		iArray.insertion(3, 40);
		iArray.insertion(4, 50);
		iArray.insertion(5, 60);
		
		//try to re-initialize
		iArray.insertion(5, 60);
		
		//try to give out of range values
		iArray.insertion(7, 70);
		
		//try to print the array values
		iArray.traverse();
		
		//try to search the index of value through linear search
		iArray.search(20);
		
		//try to delete the value by index
		iArray.deletion(1);
		
	}
}
