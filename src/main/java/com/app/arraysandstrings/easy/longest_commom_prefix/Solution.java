package com.app.arraysandstrings.easy.longest_commom_prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minLen)
                minLen = str.length();
        }

        int i = 0;
        while (i < minLen) {
            for (String s : strs){
                if (s.charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }

        return strs[0].substring(0, i);
    }

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        System.out.println(new Solution().longestCommonPrefix(strs));

        String[] strs1 = {"dog","racecar","car"};
        System.out.println(new Solution().longestCommonPrefix(strs1));

    }
}
