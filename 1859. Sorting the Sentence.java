class Solution {
    public String sortSentence(String inp) {
        String[] arr=inp.split(" ");
        String[] res=new String[arr.length];
        String resStr="";
        for(int i=1;i<=arr.length;i++){
            String a="";
            for(String j:arr){
                if(j.contains(Integer.toString(i))){
                    res[i-1]=j.substring(0,j.length()-1);
                }
            }
        }
        for(String i:res){
            resStr+=i+" ";
        }
        return resStr.trim();
    }
}
