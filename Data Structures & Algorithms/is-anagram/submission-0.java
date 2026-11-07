class Solution {
    public boolean isAnagram(String s, String t) {
       if (s.length() < t.length() || t.length() < s.length()) {
        return false;
       }
       int[] countS = new int[26];
       int[] countT = new int[26];
       for (char i : s.toCharArray()) {
        countS[i - 'a']++;
       }
       for (char i : t.toCharArray()) {
       countT[i - 'a']++;
       }
       if (Arrays.equals(countS, countT)) {
        return true;
       }
       return false;
    }
}