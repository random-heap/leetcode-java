package random.heap._0013;

/**
 * 13. 罗马数字转整数
 * 
 * @author maoze.yao
 *
 */
public class Solution {

	public int romanToInt(String s) {
		int sum = 0;
		int preNum = romeToInt(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			int num = romeToInt(s.charAt(i));
			if (preNum < num) {
				sum -= preNum;
			} else {
				sum += preNum;
			}
			preNum = num;
		}
		sum += preNum;
		return sum;
	}

	public int romeToInt(char c) {

		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			break;
		}

		return 0;
	}
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.romanToInt("MCMXCIV"));
	}
}
