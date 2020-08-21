package random.heap._0136;

/**
 * 136. 只出现一次的数字
 * @author maoze.yao
 *
 */
public class Solution {

	/**
	 * 
	 * @param nums
	 * @return
	 */
	public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
	
	public static void main(String[] args) {
		
		//任何数和 00 做异或运算，结果仍然是原来的数
		//任何数和其自身做异或运算，结果是 0
		//异或运算满足交换律和结合律
		int a = 2;
		int b = 2;
		int c = 3;
		
		System.out.println(a^b^c);
	}
}
