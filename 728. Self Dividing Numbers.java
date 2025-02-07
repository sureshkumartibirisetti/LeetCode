class Solution {
    boolean isSelfDivingNumber(int n){
        int temp = n;
        while(temp>0){
            int k = temp%10;
            if(k==0){
                return false;
            }
            if(n%k!=0){
                return false;
            }
            temp /=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDivingNumber(i)){
                result.add(i);
            }
        }
        return result;
    }
}
