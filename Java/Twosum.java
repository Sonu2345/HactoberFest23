
    class Twosum {

        public static void main(String[] args) {
            int tar=6;
            int a[]=new int[]{2,3,4,5,6};
            Twosum obj=new Twosum();
            int b[] =obj.twoSum(a,tar);
            for(int i:b){
                System.out.print(i+" ");
            }

        }

    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int flag,i,j;
        for( i=0;i<len-1;i++)
        {
            for( j=i+1;j<len;j++)
            {
                if(target==nums[i]+nums[j])
                {
                    return new int[]{i,j};
                }
                  

            }
        }
    return new int[]{};
    }
}
    

