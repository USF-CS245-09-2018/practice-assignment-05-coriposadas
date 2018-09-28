/*
 *@author Cori Posadas
*/
public class InsertionSort implements SortingAlgorithm{

	public void sort(int [] arr){
		for(int i = 1; i < arr.length; i++){
			int temp = arr[i];
			int k = i - 1;
			while (k >= 0 && arr[k] > temp){
				arr[k+1] = arr[k];
				--k;
			}
			arr[k+1] = temp;
		}
	}
}