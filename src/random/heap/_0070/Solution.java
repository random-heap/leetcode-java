package random.heap._0070;

/**
 * 70. 爬楼梯
 * 
 * @author maoze.yao
 *
 */
public class Solution {

	public int climbStairs(int n) {
		int p = 0, q = 0, r = 1;
		for (int i = 1; i <= n; ++i) {
			p = q;
			q = r;
			r = p + q;
		}
		return r;
	}

}
