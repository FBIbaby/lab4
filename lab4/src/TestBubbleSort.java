import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class TestBubbleSort {
	
	
	@Test
	public void test1() {
		int [] arr1 = new int[] {1,6,2,2,5};
		int [] arr2 = new int[] {1,2,2,5,6};
		BubbleSort.BubbleSort(arr1);
		assertEquals(Arrays.toString(arr1), Arrays.toString(arr2));
	}
	
	@Test
	public void test2() {
		int [] arr1 = new int[] {4,6,3,2,5};
		int [] arr2 = new int[] {2,3,4,5,6};
		BubbleSort.BubbleSort(arr1);
		assertEquals(Arrays.toString(arr1), Arrays.toString(arr2));
	}
	
	@Test
	public void test3() {
		int [] arr1 = new int[] {1,6,3,2,4,5};
		int [] arr2 = new int[] {1,2,3,4,5,6};
		BubbleSort.BubbleSort(arr1);
		assertEquals(Arrays.toString(arr1), Arrays.toString(arr2));
	}
	
	
}
