package random.heap._0007;

/**
 * 7. 整数反转
 * @author maoze.yao
 *
 */
public class Solution {
	
	public int reverseBest(int x) {
		int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10)) 
            	return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < Integer.MIN_VALUE % 10)) 
            	return 0;
            rev = rev * 10 + pop;
        }
        return rev;

	}

	public int reverse(int x) {
		String s = String.valueOf(x);
		
		char[] data = new char[s.length()]; 
		
		char sign = '#';
		char[] arr = s.toCharArray();
		sign = arr[0];
		if (sign == '-' || sign == '+') {
			data[0] = sign;
			for (int i = arr.length - 1; i > 0; i--) {
				data[arr.length-i] = arr[i];
			}
		} 
		
		if (sign != '-' && sign != '+' && sign != '#') {
			data[s.length() - 1] = sign;
			for (int i = arr.length - 1; i > 0; i--) {
				data[arr.length-i-1] = arr[i];
			}
		}
		
		Long a = Long.valueOf(new String(data));
		if (a > Integer.MAX_VALUE || a < Integer.MIN_VALUE) {
			return 0;
		}
		
		return a.intValue();
    }
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.reverseBest(-1534));
	}
}
