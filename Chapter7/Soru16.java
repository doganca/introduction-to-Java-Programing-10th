package Chapter7;

import java.util.Arrays;

public class Soru16 {
	public static void main(String[] args) {
		
		int[] array = arrayeRassalSayiAta();
		int key = (int)(Math.random() * 100001);
		
		long baslangicZamani = System.currentTimeMillis();
		linearSearch(array, key);
		binarySearch(array, key);
		
		long bitisZamani = System.currentTimeMillis();
		int gecenSure = (int)(bitisZamani - baslangicZamani);
		System.out.println(gecenSure);
		
	}
	
	  private static int[] arrayeRassalSayiAta() {
		int[] array = new int[100_000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100_001);
		}
		Arrays.sort(array);
		return array;
	}

	/** The method for finding a key in the list */
	  public static int linearSearch(int[] list, int key) {
	    for (int i = 0; i < list.length; i++) {
	      if (key == list[i])
	        return i;
	    }
	    return -1;
	  }
	  
	  /** Use binary search to find the key in the list */
	  public static int binarySearch(int[] list, int key) {
	    int low = 0;
	    int high = list.length - 1;

	    while (high >= low) {
	      int mid = (low + high) / 2;
	      if (key < list[mid])
	        high = mid - 1;
	      else if (key == list[mid])
	        return mid;
	      else
	        low = mid + 1;
	    }

	    return -low - 1; // Now high < low
	  }
}
