package algorithm;

import java.util.Stack;

/**
 * 表达式求值
 * @author lwyan on 2018-10-30 9:52
 */
public class Evaluate {
	/**
	 *
	 * 双栈算数表达式求值：
	 * 		将操作数压入操作数栈
	 * 		将运算符压入运算符栈
	 * 		忽略左括号
	 * 		在遇到右括号时，弹出一个运算符，弹出所需数量的操作数，并将运算符和操作数的运算结果压入操作数栈
	 */
	public static double doubleStackEvaluate(String[] expr) {
		Stack<String> ops = new Stack<>();
		Stack<Double> val = new Stack<>();
		for (String s : expr) {
			switch (s) {
				case "(":
					break;
				case "+":
					ops.push(s);
					break;
				case "-":
					ops.push(s);
					break;
				case "*":
					ops.push(s);
					break;
				case "/":
					ops.push(s);
					break;
				case "sqrt":
					ops.push(s);
					break;
				case ")":
					String op = ops.pop();
					double v = val.pop();
					switch (op) {
						case "+":
							v = val.pop() + v;
							break;
						case "-":
							v = val.pop() - v;
							break;
						case "*":
							v = val.pop() * v;
							break;
						case "/":
							v = val.pop() / v;
							break;
						case "sqrt":
							v = Math.sqrt(v);
							break;
					}
					val.push(v);
					break;
				default:
					val.push(Double.parseDouble(s));
					break;
			}
		}
		return val.pop();
	}
}