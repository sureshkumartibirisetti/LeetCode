class Solution {
    public boolean isHappy(int n) {
        int slow= n;
        int fast= n;
        
        do{
            slow= square(slow); 
            fast= square(square(fast)); 
            if(slow == 1){
                return true;
            }
        }while(slow != fast); 
        
        return false;
    }
    static int square(int a){
        int ans=0;
        while (a >0){
            int rem=a%10;
            ans+=rem*rem;
            a=a/10;
        }
        return ans;
    }

}
