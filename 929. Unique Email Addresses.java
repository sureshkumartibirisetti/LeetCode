class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet<>();
        for(String i:emails){
            String[] arr=i.split("@");
            System.out.println(Arrays.toString(arr));
            String[] arr1=arr[0].split("\\+");
            System.out.println(Arrays.toString(arr1));
            String s="";
            String[] arr2=arr1[0].split("\\.");
            System.out.println(Arrays.toString(arr2));
            for(String j:arr2){
                s+=j;
            }
            s+="@";
            s+=arr[1];
            set.add(s);
        }
        return (set.size());
    }
}
