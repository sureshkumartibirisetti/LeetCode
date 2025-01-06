class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> arr=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==2){
                arr.add(nums[i]);
            }
        }
        int[] res=new int[2];
        int i=0;
        for(int j:arr){
            res[i]=j;
            i++;
        }
        return res;
        
    }
}
