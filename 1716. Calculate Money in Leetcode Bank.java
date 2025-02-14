class Solution {
    public int totalMoney(int n) {
        int res=0;
        if(n<=7){
            int s=(n*(n+1))/2;
            res+=s;
        }else{
            int temp=n%7; 
            int t=n/7;
            int j=1;
            int x=0;
            while(t>0){
                res=res+(28+(x*7));
                x+=1;
                j++;
                t--;
            }
            for(int i=0;i<temp;i++){
                res+=(i+j);
            }

        }
        return res;
    }
}
