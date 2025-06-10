class Solution {
    public int maxDifference(String s) {
        int maxOdd=0;
        int minEven=Integer.MAX_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i:map.values()){
            if(i%2==0){
                if(minEven>i){
                    minEven=i;
                }
            }else{
                if(maxOdd<i){
                    maxOdd=i;
                }
            }
        }
        return (maxOdd-minEven);
    }
}
