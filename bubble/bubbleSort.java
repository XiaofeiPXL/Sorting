package bubble;

import java.util.Arrays;

public class bubbleSort {
	public static void bubbleSortDemo(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int[] a = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(a));
		bubbleSortDemo(a);
		System.out.println(Arrays.toString(a));
	}
}
