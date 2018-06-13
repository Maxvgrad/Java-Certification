import java.util.Arrays;


public class Ch3Pt2 {
	public static int ads[], d;
	public static int ads2, d2[];
	public static int[] ads3, d3[];

	public static void main(String[] args) {
		//Arrays
		int[] arr1;
		int [] arr2;
		int  []arr3;
		int arr4[];

		int[] arr5 = new int[4];
		int[] arr6 = new int[] {44, 44, 55};
		int[] arr7 = {4};

		System.out.println(ads); //arr
		System.out.println(d); //primitive

		System.out.println(ads2); //primitive
		System.out.println(d2); //arr

		System.out.println(ads3); //arr
		System.out.println(d3); //arr

		//Sorting
		int[] arr8 = {3, 4, 1, 10, 21, 12, 100};
		System.out.println(Arrays.toString(arr5));
		System.out.println("Array8 = " + Arrays.toString(arr8));
		Arrays.sort(arr8);
		System.out.println("Array8 after sorting = " + Arrays.toString(arr8));

		if (false)
			System.out.println("test line");


		Arrays.parallelPrefix(arr8, (i1, i2) -> i1 + i2);
		System.out.println(Arrays.toString(arr8));
		System.out.println("Search 151 = " + Arrays.binarySearch(arr8, 151));
		System.out.println("Search 100 = " + Arrays.binarySearch(arr8, 19));

		String[] twoDarr[], threeDarr[][];
		twoDarr = new String[2][5];

		//System.out.println(Arrays.toString(Arrays.toString(twoDarr[][])));

		//Asymmetric Array
		String[][] strArr = {{"hey, hey"}, {}, {"hey"}};

		int[][] asymArr = new int[4][];
		asymArr[0] = new int[2];
		asymArr[1] = new int[5];

		for(String[] inner : strArr) {
			for(String s : inner) {
				System.out.print(s + " ");
			}
			System.out.println();
		}

		//new int[];
	}
}
