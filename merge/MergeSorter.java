package merge;

import java.util.Arrays;

public class MergeSorter {
	public static void main(String[] args) {
		int[] arrays = { 9, 2, 5, 1, 3, 2, 9, 5, 2, 1, 8 };
		mergeSort(arrays, 0, arrays.length - 1);
		System.out.println(Arrays.toString(arrays));

	}

	public static void mergeSort(int[] arrays, int L, int R) {

		// if only one element, return
		if (L == R) {
			return;
		} else {

			// choose the middle element
			int M = (L + R) / 2;

			// sorting left part
			mergeSort(arrays, L, M);

			// sorting right part
			mergeSort(arrays, M + 1, R);

			// merge
			merge(arrays, L, M + 1, R);

		}
	}

	public static void merge(int[] arrays, int L, int M, int R) {
		// size of left part array
		int[] leftArray = new int[M - L];

		// size of right part array
		int[] rightArray = new int[R - M + 1];

		// push elements into these two parts
		for (int i = L; i < M; i++) {
			leftArray[i - L] = arrays[i];
		}
		for (int i = M; i <= R; i++) {
			rightArray[i - M] = arrays[i];
		}

		int i = 0, j = 0;
		// first element of the final array
		int k = L;

		// compare the elements of these two parts, which one is smaller, add it into
		// final array
		while (i < leftArray.length && j < rightArray.length) {
			if (leftArray[i] < rightArray[j]) {
				arrays[k] = leftArray[i];
				i++;
				k++;
			} else {
				arrays[k] = rightArray[j];
				j++;
				k++;
			}
		}

		// if one part is all compared, add all of the rest elements into final array
		while (i < leftArray.length) {
			arrays[k] = leftArray[i];

			i++;
			k++;
		}
		while (j < rightArray.length) {
			arrays[k] = rightArray[j];

			j++;
			k++;
		}
	}
}
