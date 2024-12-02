import java.util.Arrays;

public class IndicesArray {

	public int[] getIndicesSmallestLargest(int[] array) {

		int largest = array[0];
		int largestIndex = 0;
		int smallest = array[0];
		int smallestIndex = 0;

		for (int index = 0; index < array.length; index++) {

			if (array[index] > largest) {

				largest = array[index];
				largestIndex = index;

			}

			if (array[index] < smallest) {

				smallest = array[index];
				smallestIndex = index;

			}

		}

		int[] finalArray = {smallestIndex, largestIndex};

		return finalArray;
	}

}		
			
	