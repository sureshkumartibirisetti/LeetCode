class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr=s.split(" ");
        int j=-1;
        for(String i:arr){
            if(i.charAt(0)>='0' && i.charAt(0)<='9'){
                int a=Integer.parseInt(i);
                if(a>j){
                    j=a;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
