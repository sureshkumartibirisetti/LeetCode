class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.isEmpty()){
                stack.add(ch);
            } else if((stack.peek()==(char)(ch+32))|| (stack.peek()==(char)(ch-32))) {
                stack.pop();
            }else{
                stack.add(ch);
            }
        }
        String stStr = stack.stream().map(s1 -> s1.toString()).collect(Collectors.joining(""));
        return stStr;
    }
}
