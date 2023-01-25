
public class QuickSort {
//Q-> Sort an Array using QuickSort technique
	
	public static void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int pivotIdx = partition(arr,low,high);
			quickSort(arr,low,pivotIdx-1); //for elements smaller than pivot elemet 
			quickSort(arr,pivotIdx+1,high);// for elements larger than pivot element
		}
	}
	
	public static int partition(int arr[],int low , int high) {
		int pivot = arr[high]; //we are taking last element of array as pivot here
		int i = low-1; // for creating spaces for elements smaller than pivot element
	    
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				//Swaping
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j] = temp;
			}
		}i++; // this is for creating free space for pivot
		 int temp = arr[i];
		 arr[i]= pivot;
		 arr[high]=temp;
		 return i;
	}
	
	public static void main (String args[]) {
		int arr[] = {3,5,2,24,3,1,4,55,12,3};
		int n = arr.length;
		quickSort(arr,0,n-1);
		
		for(int i =0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
