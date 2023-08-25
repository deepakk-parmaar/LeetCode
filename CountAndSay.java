class Solution {
    public String countAndSay(int n) {
        String ans = "1";
        for(int i =1;i<n;i++){
            ans = countSay(ans);
        }
        return ans;
    }
    private String countSay(String num){
        StringBuilder ans = new StringBuilder();
        int start = 0;
        while(start<num.length()){
            char curr = num.charAt(start);
            int count = 0;
            while(start<num.length() && num.charAt(start)==curr){
                start++;
                count++;
            }
            ans.append(count).append(curr);
        }
        return ans.toString();
    }
}