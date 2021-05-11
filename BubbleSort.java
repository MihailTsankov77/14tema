package tema14;

public class BubbleSort {
	/** Bubble sort method */
	public static void bubbleSort(double[] list) {
		for (int k = 0; k < list.length - 1; k++) {
			for (int i = 0; i < list.length - 1 - k; i++) {
				if (list[i] > list[i + 1]) {
					// Swap list[i] with list[i + 1]
					double temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
				}
			}
		}
	}
}