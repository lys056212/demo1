package infixtoprofix;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

	
	public static String infixToPostfix(String infix) {
		// 操作符栈-----'+ - * / ( )'
		Stack<Character> op = new Stack<Character>();
		StringBuilder postfixStr = new StringBuilder("");
		char[] prefixs = infix.trim().toCharArray();
		Character ch;
		for (int i = 0; i < prefixs.length; i++) {
			ch = prefixs[i];
			// 如果是数字 0~9
			if (ch >= '0' && ch <= '9') {
				// vlaues.push(Integer.valueOf(ch));
				postfixStr.append(ch);
				continue;
			}
			// "("---直接压栈
			if ('(' == ch) {
				op.push(ch);
				continue;
			}
			/*
			 * '+ - * /'----空栈直接压栈否则与栈顶元素比较， 优先级低于栈顶元素则弹出栈直到遇到优先级相等或者低的就停止弹栈
			 * 最后将该操作符压栈
			 */
 
			if ('+' == ch || '-' == ch) {
				// 只要栈不为空，栈顶元素不是'(' 就弹栈
				while (!op.empty() && (op.peek() != '(')) {
					postfixStr.append(op.pop());
				}
				op.push(ch);
				continue;
			}
			if ('*' == ch || '/' == ch) {
				// 只要栈不为空，栈顶元素是'* /' 就弹栈
				while (!op.empty() && (op.peek() == '*' || op.peek() == '/')) {
					postfixStr.append(op.pop());
				}
				op.push(ch);
				continue;
			}
			// ')'----开始弹栈直到遇到第一个'('
			if (')' == ch) {
				while (!op.empty() && op.peek() != '(') {
					postfixStr.append(op.pop());
				}
				op.pop();// ----将'('元素弹出
				continue;
			}
		}
		// 所有字符遍历完毕操作数栈还有数据就全部弹栈
		while (!op.empty())
			postfixStr.append(op.pop());
		return postfixStr.toString();
	}
//	public static int sumPostfix(String postfix){
//		//操作数栈---暂时只考虑正整数
//		Stack<Integer> values;
//		int result=0;
////	5+4*(3*(6-1*2+3))
//			values = new Stack<Integer>();
//			 char [] postfixs =postfix.trim().toCharArray();
//			 Character ch;
//			 for(int i=0;i<postfixs.length;i++){
//				 ch=postfixs[i];
//				 if(ch >= '0' && ch <= '9') {
//					 values.push(Integer.valueOf(String.valueOf(ch)));//---如操作栈
//					 //或者：*****这样更考验思维
//					 //values.push(Integer.valueOf(ch-'0'));
//				 }else {
//					 result=operate(ch, values.pop(),values.pop());
//					 values.push(result);
//					 
//				 }
//				  
//			 }
//			 result=values.pop();
//		
//			
//	
//		 return result;
//	}
//	//7*3-(2*6-3)
//	public static int operate(char op,int value1,int value2){
//		int result=0;
//		//记住用第二个弹栈的值value2（加减乘除）第一个弹栈的值value1
//		 switch ( op) {
//		case '+':
//			result=value2+value1;
//			break;
//		case '-':
//			result=value2-value1;
//			break;
//		case '*':
//			result=value2*value1;
//			break;
//		case '/':
//			result=value2/value1;
//			break;
//		default:
//			break;
//		}
//		return result;
//	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str=sc.next();
		
//		String str="5+4*(3*(6-1*2+3))";
//		String str="7*3-(2*6-3)";
		
		System.out.println(str+":"+infixToPostfix(str));
//		str=infixToPostfix(str);
//		System.out.println("result:"+sumPostfix(str));

	}
}