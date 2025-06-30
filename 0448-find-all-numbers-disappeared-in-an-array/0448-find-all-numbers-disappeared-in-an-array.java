class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int m=nums.length-set.size();
        for(int i=1;i<= nums.length;i++){
            if(list.size()==m){
                break;
            }else if(!set.contains(i)){
                list.add(i);
            }
        }
       return list;
    }
}