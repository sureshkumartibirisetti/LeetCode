class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> al=new ArrayList<>();
        Arrays.sort(arr1);
        for(int i=0;i<arr2.length;i++){
            int c=0;
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    al.add(arr1[j]);
                    arr1[j]=-1;
                    c++;
                } else if (c>0) {
                    break;
                }
            }
        }
        for(int i:arr1){
            if(i!=-1){
                al.add(i);
            }
        }
        return al.stream().mapToInt(Integer::intValue).toArray();

    }
}
