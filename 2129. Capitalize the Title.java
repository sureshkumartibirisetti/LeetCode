class Solution {
    public String capitalizeTitle(String title) {
        String[] s=title.split(" ");
        String res="";
        for(int i=0;i<s.length;i++){
           String temp=s[i].toLowerCase();
           if(temp.length()<=2){
               res+=temp;
           }else{
               res+=(char)(temp.charAt(0)-32)+temp.substring(1,temp.length());
           }
           res+=" ";

        }
        return (res.trim());
    }
}
