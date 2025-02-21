class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] arr=s.toCharArray();
        for(char i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                return i;
            }
        }
        return -1;   
    }
}
