/*
 *@author Cori Posadas
*/

public class QuickSort implements SortingAlgorithm {

	public void sort(int [] array){

		quickSort(array, 0, array.length-1);
	}

	public void swap(int [] array,int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public int partition (int [] arr, int left, int right){
		//First element = pivot
		int pivot = arr[left];
		int i = left;
		int k = right;
		while (i <= k){
			//Find number greater than pivot
			while (arr[i] < pivot){
				++i;
			}
			//Find number less than pivot
			while (arr[k] > pivot){
				--k;
			}
			//Swap values
			if (i <= k) {
				swap (arr, i, k);
				++i;
				--k;
			}
		}
		return i;
	}

	public void quickSort(int [] arr, int left, int right){
		int p = partition(arr, left, right);

		//Recursively call on left part of array
		if (left < p -1){
			quickSort(arr, left, p-1);
		}
		//Recursively call on right part of array
		if (right > p){
			quickSort(arr, p, right);
		}
	}
}