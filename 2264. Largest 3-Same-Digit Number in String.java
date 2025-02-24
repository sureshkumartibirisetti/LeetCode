class Solution {
    public String largestGoodInteger(String num) {
        int l=0;
        int r=1;
        String ress="";
        int max=-1,count=0;
        while(l!=num.length() && r!=num.length()){
            String res="";
            if(num.charAt(l)==num.charAt(r)){
                r++;
                count++;
                if(count==2){
                    res+=num.substring(l,r);
                }
            }else{
                int temp=r;
                l=r;
                r=temp+1;
                count=0;

            }
            if(!res.equals("")){
                int a=Integer.parseInt(res);
                if(max<a){
                    max=a;
                    ress=res;
                    res="";
                }
            }
        }
        return ress;
        
    }
}
