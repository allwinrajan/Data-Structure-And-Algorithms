package Two_Dimensional_Array;

public class Mainclass {

	public static void main(String[] args) {

		// initialize the size of an Array
		TwoDimentioanl_arraY tArray = new TwoDimentioanl_arraY(3, 3);

		// insertion
		System.out.println("----------insertion begin-------------");

		tArray.insertion(0, 0, 1);
		tArray.insertion(0, 1, 2);
		tArray.insertion(0, 2, 3);

		tArray.insertion(1, 0, 4);
		tArray.insertion(1, 1, 5);
		tArray.insertion(1, 2, 6);

		tArray.insertion(2, 0, 7);
		tArray.insertion(2, 1, 8);
		tArray.insertion(2, 2, 9);

		System.out.println("----------insertion complete-------------\n");

		// traverse
		System.out.println("----------traverse begin-------------");

		tArray.traverse();

		System.out.println("----------traverse complete-------------\n");

		// searching
		System.out.println("----------search begin-------------");

		tArray.searchingByRowColoum(0, 0);
		tArray.searchingByRowColoum(0, 1);
		tArray.searchingByRowColoum(0, 2);

		tArray.searchingByRowColoum(1, 0);
		tArray.searchingByRowColoum(1, 1);
		tArray.searchingByRowColoum(1, 2);

		tArray.searchingByRowColoum(2, 0);
		tArray.searchingByRowColoum(2, 1);
		tArray.searchingByRowColoum(2, 2);

		System.out.println("");

		tArray.searchingByValue(1);
		tArray.searchingByValue(2);
		tArray.searchingByValue(3);

		tArray.searchingByValue(4);
		tArray.searchingByValue(5);
		tArray.searchingByValue(6);

		tArray.searchingByValue(7);
		tArray.searchingByValue(8);
		tArray.searchingByValue(9);

		System.out.println("----------search complete-------------\n");

		// deletion
		System.out.println("----------deletion begin-------------");

		tArray.deleteByRowColoum(0, 0);
		tArray.deleteByRowColoum(0, 1);
		tArray.deleteByRowColoum(0, 2);

		tArray.deleteByRowColoum(1, 0);
		tArray.deleteByRowColoum(1, 1);
		tArray.deleteByRowColoum(1, 2);

		tArray.deleteByRowColoum(2, 0);
		tArray.deleteByRowColoum(2, 1);
		tArray.deleteByRowColoum(2, 2);

		System.out.println();

		tArray.deleteByValue(1);
		tArray.deleteByValue(2);
		tArray.deleteByValue(3);

		tArray.deleteByValue(4);
		tArray.deleteByValue(5);
		tArray.deleteByValue(6);

		tArray.deleteByValue(7);
		tArray.deleteByValue(8);
		tArray.deleteByValue(9);

		System.out.println("----------deletion complete-------------");

	}
}
