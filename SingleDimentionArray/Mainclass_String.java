package SingleDimentionArray;

public class Mainclass_String {

	public static void main(String[] args) {
		
		//initialize the constructor by passing array size 6
		String_Array_Operation sArray = new String_Array_Operation(6);
		
		//initialize array values
		sArray.insertion(0, "Allwin");
		sArray.insertion(1, "Rajan");
		sArray.insertion(2, "server");
		sArray.insertion(3, "Web-app");
		sArray.insertion(4, "database");
		sArray.insertion(5, "Build");
		
		//try to re-initialize
		sArray.insertion(5, "Extra");
		
		//try to give out of range values
		sArray.insertion(6, "Deploy");
		
		//try to print the array values
		sArray.traverse();
		
		//try to search value by index
		sArray.search("server");		
		//try to delete the value by index
		sArray.deletion(2);
	}
}
