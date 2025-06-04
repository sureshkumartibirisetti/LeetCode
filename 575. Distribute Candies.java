class Solution {
    public int distributeCandies(int[] candyType) {
        int l=candyType.length/2;
        HashSet<Integer> set=new HashSet<>();
        for(int i:candyType){
            set.add(i);
        }
        if(set.size()<=l){
            return (set.size());
        }
        return (l);
    }
}
