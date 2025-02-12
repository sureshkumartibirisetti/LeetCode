// import java.util.*;
class Solution {
    public int calPoints(String[] ops) {
        Stack<String> s=new Stack<>();
        for(String i:ops){
            if(i.equals("C")){
                s.pop();
            } else if(i.equals("D")) {
                int a=Integer.parseInt(s.peek())*2;
                s.add(a+"");
            }else if(i.equals("+")){
                int a=Integer.parseInt(s.peek())+Integer.parseInt(s.get(s.size()-2));
                s.add(a+"");
            }else{
                s.add(i);
            }
        }
        int res=0;
        for(String i:s){
            int a=Integer.parseInt(i);
            res+=a;

        }
        return res;
    }
}
