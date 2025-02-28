class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int[] res=new int[a.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            map.put(b[i],map.getOrDefault(b[i],0)+1);
            res[i]=count(map);
        }
        return res;
    }
    public static int count(HashMap<Integer,Integer> map){
        int res=0;
        for(int i:map.values()){
            if(i>1){
                res++;
            }
        }
        return res;
    }
}
