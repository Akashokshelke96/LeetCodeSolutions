package easy;

public class PeakIndexMountainArray {
    public static void main(String[] args) {



    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int mid = start + (end-start) / 2;
            if(arr[mid] > arr[mid+1]){
                //we are in decreasing part of the array
                //this may be the answer but look at left
                end = mid;
            }
            else{
                //in ascending part of array
                start = mid + 1; //becz we know that mid +1 > mid element
            }
        }        return start;

    }
}


