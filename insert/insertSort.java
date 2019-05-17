package insert;

import java.util.Arrays;
import java.util.Random;

public class insertSort 
{

	public static int[] randomIntArray(int length, int n) {
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++) {
			Random generator = new Random();
			a[i] = generator.nextInt(n);
		}
		return a;
	}

	public static void insertsort(int[] a) 
	{
		for (int i = 1; i < a.length; i++) 
		{
			int next = a[i];

			int j = i;
			while (j > 0 && a[j - 1] > next) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = next;
		}
	}

	public static void main(String[] args)
	{
		int[] a = randomIntArray(5,100);
		System.out.println(Arrays.toString(a));
		insertsort(a);
		System.out.println(Arrays.toString(a));
	}
}