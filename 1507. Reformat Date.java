class Solution {
    public String reformatDate(String date) {
        HashMap<String,String> map=new HashMap<>();
        //{"Jan":"01", "Feb":"02", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec":"12"};
        map.put("Jan","01");
        map.put("Feb","02");
        map.put("Mar","03");
        map.put("Apr","04");
        map.put("May","05");
        map.put("Jun","06");
        map.put("Jul","07");
        map.put("Aug","08");
        map.put("Sep","09");
        map.put("Oct","10");
        map.put("Nov","11");
        map.put("Dec","12");
        String[] arr=date.split(" ");
        String res="";
        res+=arr[2];
        res+="-";
        res+=map.get(arr[1]);
        res+="-";
        if(arr[0].length()==3){
            res+="0"+arr[0].charAt(0);
        }else{
            res+=arr[0].substring(0,2);
        }
        return res;
    }
}
