class Solution {
    public int getLucky(String s, int k) {
        k-=1;
        int s1=0;
        for(int i=0;i<s.length();i++){
            int s2=s.charAt(i)-96;
            s1+=sum(s2);
        }
        while(k!=0){
            s1=sum(s1);
            k--;

        }
        return s1;

    }
    public static int sum(int a){
        int res=0;
        while(a>0){
            int temp=a%10;
            res+=temp;
            a/=10;
        }
        return res;
        
    }
}
