class Solution {
    public String interpret(String command) {
        String[] arr=command.split("");
        String s="";
        for(int i =0;i<arr.length;i++){
            char ch=arr[i].charAt(0);
            char s1='o';
            if((ch<='z' && ch>='a')||(ch>='A' && ch<='Z') ){
                s+=ch;
            }else{
                if(i<arr.length-1){
                    char ch1=arr[i].charAt(0);
                    char ch2=arr[i+1].charAt(0);
                    if(ch1=='(' && ch2==')'){
                        s+=s1;
                    }
                }
            }
        }
        return s;
        
    }
}
