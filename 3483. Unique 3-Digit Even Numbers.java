class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set=new HashSet<>();
        int N=digits.length;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                for(int k=0;k<N;k++){
                    if(i!=j && j!=k && i!=k){
                        int num=digits[i]*100+digits[j]*10+digits[k];
                        if(num%2==0 && 100<=num && num<=999){
                            set.add(num);
                        }
                    }
                }
            }

        }
        return (set.size());
    }
}
