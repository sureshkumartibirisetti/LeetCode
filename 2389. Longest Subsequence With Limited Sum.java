class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
         int[] res=new int[queries.length];
        Arrays.sort(nums);
        for(int i=0;i<queries.length;i++){
            int temp=0;
            int ress=0;
            for(int j=0;j<nums.length;j++){
                temp+=nums[j];
                if(queries[i]>=temp){
                    ress++;
                }else{
                    res[i]=ress;
                    break;
                }
                if(j== nums.length-1 && queries[i]>=temp){
                    res[i]=ress;
                }
            }
        }
        return res;
    }
}
