class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int a=Integer.parseInt(num(firstWord));
        int b=Integer.parseInt(num(secondWord));
        int c=Integer.parseInt(num(targetWord));
        return (a+b==c);
    }
    static String num(String a){
        String res="";
        for(int i=0;i<a.length();i++){
            res+=a.charAt(i)-97;
        }
        return res;
    }
        
    }
