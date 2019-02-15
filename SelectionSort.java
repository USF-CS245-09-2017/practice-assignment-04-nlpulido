public class SelectionSort implements SortingAlgorithm {
	public void sort(int [] a){
		int small = 0;
		for(int i = 0; i < (a.length - 1); i++){
			swap(a, i, findSmallest(a, i));
		}
	}

	void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp; 
	}

	int findSmallest(int[] a, int start){
		int small = start;
		for (int i = start + 1; i< a.length; i++){
			if (a[i] < a[small]){
				small = i;
			}
		}
		return small;
	}

}