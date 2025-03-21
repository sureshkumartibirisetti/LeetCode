class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int l=nums.length;
        if(l%2==0){
            int[] a=new int[l/2];
            int[] b=new int[l/2];
            int s=0,s1=0;
            for(int i=0;i<nums.length;i++){
                if(i%2==0){
                    a[s]=nums[i];
                    s++;
                }else{
                    b[s1]=nums[i];
                    s1++;
                }
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int x=0,y=b.length-1;
            while(x<y){
                int temp=b[x];
                b[x]=b[y];
                b[y]=temp;
                x++;
                y--;
            }
            int t=0;
            int t1=0;
            for(int i=0;i<l;i++){
                if(i%2==0){
                   nums[i]=a[t];
                   t++;
                }else{
                    nums[i]=b[t1];
                    t1++;
                }
            }


        }else{
            int[] a=new int[l/2+1];
            int[] b=new int[l/2];
            int s=0,s1=0;
            for(int i=0;i<nums.length;i++){
                if(i%2==0){
                    a[s]=nums[i];
                    s++;
                }else{
                    b[s1]=nums[i];
                    s1++;
                }
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int x=0,y=b.length-1;
            while(x<y){
                int temp=b[x];
                b[x]=b[y];
                b[y]=temp;
                x++;
                y--;
            }
            int t=0;
            int t1=0;
            for(int i=0;i<l;i++){
                if(i%2==0){
                    nums[i]=a[t];
                    t++;
                }else{
                    nums[i]=b[t1];
                    t1++;
                }
            }
           
        }
        return nums;
}
}
