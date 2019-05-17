package Linear_Search;

public class LinearSearcher 
{
	public static int search(int[] a, int value) {
		for(int i = 0;i<a.length;i++) 
		{
			if(a[i] == value) 
			{
				return i;
			}
		}
		return -1;
	}
}
/*
 * Either way, a linear search is an O(n) algorithm.
 */