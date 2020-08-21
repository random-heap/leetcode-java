package random.heap._0058;

/**
 * 58. 最后一个单词的长度
 * @author maoze.yao
 *
 */
public class Solution {

	public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) return 0;
        int count = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                if(count == 0) continue;
                break;
            }
            count++;
        }
        return count;        
    }
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.lengthOfLastWord("Hello World  "));
	}
}
