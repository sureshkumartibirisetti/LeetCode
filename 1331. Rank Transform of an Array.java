class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] res=new int[arr.length];
        TreeMap<Integer,Integer> treemap=new TreeMap<>();
        for(int i:arr){
            treemap.put(i,treemap.getOrDefault(i,0)+1);
        }
        int a=1;
        for(int i:treemap.keySet()){
            treemap.put(i,a);
            a++;
        }
        for(int i=0;i<res.length;i++){
            res[i]=treemap.get(arr[i]);
        }
        return res;
    }
}
