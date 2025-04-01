class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]-arr[i-1]){
                min=arr[i]-arr[i-1];
            }
        }
        for(int i=1;i<arr.length;i++){
            List<Integer> l1=new ArrayList<>();
            if(arr[i]-arr[i-1]==min){
                l1.add(arr[i-1]);
                l1.add(arr[i]);
                list.add(l1);
            }

        }
        return list;
    }
}
