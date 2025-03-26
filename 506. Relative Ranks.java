class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] temp=Arrays.copyOf(score,score.length);
        String[] result=new String[score.length];
        Arrays.sort(score);
        HashMap<Integer,String> map=new HashMap<>();
        int a=score.length;
        for(int i=0;i<score.length;i++){
            if(i== score.length-1){
                map.put(score[i],"Gold Medal");
            } else if (i== score.length-2) {
                map.put(score[i],"Silver Medal");
            }else if(i==score.length-3){
                map.put(score[i],"Bronze Medal");
            }else{
                map.put(score[i],Integer.toString(a));
                a-=1;
            }
        }
        for(int i=0;i<score.length;i++){
            result[i]=map.get(temp[i]);
        }
        return result;
    }
}
