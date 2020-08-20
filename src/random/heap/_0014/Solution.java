package random.heap._0014;

/**
 * 14. 最长公共前缀
 * @author maoze.yao
 *
 */
public class Solution {

	public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int count = strs.length;
        for (int i = 1; i < count; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }

    public static void main(String[] args) {
    	
    	String[] strs = new String[]{"flower","flow","flight"};
    	
    	Solution solution = new Solution();
		System.out.println(solution.longestCommonPrefix(strs));
	}
}
