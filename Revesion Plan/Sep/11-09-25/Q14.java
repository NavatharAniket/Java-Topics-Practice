class FindLongestPalindromicSubstring {
    static String expand(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--; r++;
        }
        return s.substring(l+1,r);
    }
    public static void main(String[] args) {
        String s = "babad", res="";
        for(int i=0;i<s.length();i++){
            String odd = expand(s,i,i);
            String even = expand(s,i,i+1);
            if(odd.length()>res.length()) res=odd;
            if(even.length()>res.length()) res=even;
        }
        System.out.println(res);
    }
}
