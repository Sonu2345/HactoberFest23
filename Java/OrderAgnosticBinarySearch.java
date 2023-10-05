public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[]={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target=0;
        int ans=orderAgnosticBS(arr, target);
        if(ans==-1){
            System.out.println("Target Not Found");
        }
        else{
            System.out.println("Target found at position: "+ans);
        }
        
    }

    static int orderAgnosticBS(int []arr,int target){
        int start=0;
        int end=arr.length-1;

        //find whether array is sorted in ascending or descending order
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }
        else{
            isAsc=false;
        }

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else if(target>arr[mid]){
                    start=mid+1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else if(target>arr[mid]){
                    end=mid-1;
                }

            }
        }

        return -1;

    }
}
