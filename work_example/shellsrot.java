package work_example;

import java.util.Arrays;

public class shellsrot {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 7, 9, 8, 3, 6 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int[] arr) 
	{
		for (int gap = arr.length / 2; gap > 0; gap /= 2) 
		{
			for (int i = gap; i < arr.length; i++) {
				int j = i;
				while (j - gap >= 0 && arr[j] < arr[j - gap]) 
				{
					swap(arr, j, j - gap);
					j -= gap;
				}
			}
		}
	}

	public static void swap(int[] a, int i, int j) 
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
