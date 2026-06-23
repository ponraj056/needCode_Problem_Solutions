class Solution {
    public int[] sortArray(int[] arr) {
        mergesort(arr,0,arr.length-1);
        return arr;
    }
    public static void mergesort(int arr[],int left, int right) {
		if(left>=right) return;
		int mid=(left+right)/2;
		mergesort(arr,left,mid);
		mergesort(arr,mid+1,right);
		merge(arr,left,mid,right);
	}
	public static void merge(int arr[],int left,int mid,int right) {
		int temp[]=new int[right-left+1];
		int a=left;
		int b=mid+1;
		int i=0;
		while(a<=mid && b<=right) {
			if(arr[a]<=arr[b]) temp[i++]=arr[a++];
			else temp[i++]=arr[b++];
		}
		while(a<=mid) {
			temp[i++]=arr[a++];
		}
		while(b <= right) {
			temp[i++]=arr[b++];
		}
		for(int j=0;j<temp.length;j++) {
			arr[left+j]=temp[j];
		}
	}

}