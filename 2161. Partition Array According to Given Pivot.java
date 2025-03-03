class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        ArrayList<Integer> al3=new ArrayList<>();
        for(int i:nums){
            if(i<pivot){
               al1.add(i);
            }else if(i==pivot){
                al2.add(i);
            }else{
                al3.add(i);
            }
        }
        al1.addAll(al2);
        al1.addAll(al3);
        int[] intArray = al1.stream().mapToInt(i -> i).toArray();
        return intArray;
    }
}
