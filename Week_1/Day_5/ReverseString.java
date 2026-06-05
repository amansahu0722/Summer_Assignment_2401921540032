class Solution {
    public void reverseString(char[] s) {


        int Start=0;
        int  end=s.length-1;

        while(Start<end){
            char temp=s[end];
            s[end]=s[Start];
            s[Start]=temp;
            Start++;
            end--;
        }

        
    }
}