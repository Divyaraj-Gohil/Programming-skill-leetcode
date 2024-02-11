class Solution {
    public boolean repeatedSubstringPattern(String s) {
       String bigStr = s + s;
       return bigStr.substring(1, bigStr.length()-1).indexOf(s) != -1;
    }
}