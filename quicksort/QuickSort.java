package quicksort;

import java.util.Arrays;

public class QuickSort {
	public static void quickSort(int[] arr, int L, int R) {
		int i = L;
		int j = R;

		// pivot
		int pivot = arr[(L + R) / 2];

		while (i <= j) {

			// find element larger than pivot
			while (pivot > arr[i])
				i++;

			// find element smaller than pivot
			while (pivot < arr[j])
				j--;

			// find two elements one is larger than pivot and one is smaller than pivot,
			// change them
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
	

		// sorting left part
		if (L < j)
			quickSort(arr, L, j);

		// sorting right part
		if (i < R)
			quickSort(arr, i, R);
	}

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println("Result: " + Arrays.toString(arr));
	}
}
