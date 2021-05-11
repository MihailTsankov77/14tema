package tema14;

public class MergeSort1 {
	/** The method for sorting the numbers */
	public static void mergeSort(double[] list) {
		if (list.length > 1) {
// Merge sort the first half
			double[] firstHalf = new double[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSort(firstHalf);
// Merge sort the second half
			int secondHalfLength = list.length - list.length / 2;
			double[] secondHalf = new double[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
// Merge firstHalf with secondHalf into list
			merge(firstHalf, secondHalf, list);
		}
	}

	/** Merge two sorted lists */
	public static void merge(double[] list1, double[] list2, double[] temp) {
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) {
			if (list1[current1] < list2[current2])
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}


}