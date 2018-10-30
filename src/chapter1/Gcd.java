package chapter1;

/**
 * 最大公约数
 * @author lwyan on 2018-10-29 10:01
 */
public class Gcd {
	// 欧几里得算法
	public static int gcd(int p, int q){
		if(q == 0){
			return p;
		}
		int r = p % q;
		return gcd(q, r);
	}
}