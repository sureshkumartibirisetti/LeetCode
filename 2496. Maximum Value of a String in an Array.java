class Solution {
    public int maximumValue(String[] str) {
        int max=0;
        for(String i:str){
            String s="0123456789";
            int res=0;
            for(int j=0;j<i.length();j++){
                if(s.contains(i.charAt(j)+"")){
                    res=1;
                }else{
                    if(max<i.length()){
                        max=i.length();
                    }
                    res=0;
                    break;
                }
            }
            if(res!=0){
                int a=Integer.parseInt(i);
                if(max<a){
                    max=a;
                }
            }
        }
        return max;
    }
}
