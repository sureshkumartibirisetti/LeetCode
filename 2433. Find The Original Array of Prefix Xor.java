class Solution {
    public int[] findArray(int[] pref) {
        int[] res=new int[pref.length];
        res[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            res[i]=pref[i]^pref[i-1];
        }
        return res;
    }
}
