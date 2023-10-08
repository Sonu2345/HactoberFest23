class LargestSumOfContiguousSubarray{
    static int findLargestSum(int[] arr){
        int size = arr.length;
        int maxNow = Integer.MIN_VALUE, lastMax = 0;
        for (int i = 0; i < size; i++) {
          lastMax = lastMax + arr[i];
          if (maxNow < lastMax)
              maxNow = lastMax;
          if (lastMax < 0)
              lastMax = 0;
          }
          return maxNow;
        }
    public static void main(String[] args){
        int arr[]={-23,-6,14,-11,7,1,5,-4};
        int sum=findLargestSum(arr);
        System.out.println("Largest Sum of contiguous subarray : "+sum);
      }
  }
