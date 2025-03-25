class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int res=0;
        int count=0;
        for(int[] i:boxTypes){
           count+=i[0];
           if(count<=truckSize){
               res+=(i[0]*i[1]);
           }else{
               int a=count-truckSize;
               int b=i[0]-a;
               res+=(b*i[1]);
               break;
           }

        }
        return res;
    }
}
