package infixtoprofix;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfixDemo11 {
	
	
	public static String infixToPostfix(String infix) {
		 	
		Stack<Character> op= new Stack<Character>();
		StringBuilder  postfix=new StringBuilder("");
		char [] prefix=infix.trim().toCharArray();
		Character ch;
		for(int i=0;i<prefix.length;i++) {
			
			ch=prefix[i];
			if(ch>='0'&&ch<='9') {
				postfix.append(ch);
				continue;
			}
			if('('==ch) {
				op.push(ch);
				continue;
			}
			if('-'==ch||'+'==ch) {
				while(!op.empty()&&(op.peek()!='(')) {
					postfix.append(op.pop());
				}
				op.push(ch);
				continue;
			}
			if('*'==ch||'/'==ch) {
				while(!op.empty()&&(op.peek()=='*'||op.peek()=='/')) {
					postfix.append(op.pop());
				}
				op.push(ch);
				continue;
			}
			
			if(')'==ch) {
				if(!op.empty()&&(op.peek()!='('))
					postfix.append(op.pop());
			}
			op.pop();
			
		}
			while(!op.empty()) {
				postfix.append(op.pop());
			}
			return postfix.toString();
	}
		
			public static int calcuPostfix(String postfix) {
				Stack<Integer> values= new Stack<Integer>();
				char[] postfixs=postfix.trim().toCharArray();
				Character ch;
				int result=0;
				for(int i=0;i<postfixs.length;i++) {
					ch=postfixs[i];
					if(ch<='9'&&ch>='0') {
						values.push(Integer.valueOf(String.valueOf(ch)));
					}else {
						result=operate( ch, values.pop(),values.pop());
						values.push(result);
					}
					
				}
				result=values.pop();
				
				return result;
				
			}
			
	public static int operate(char op,int values1,int values2) {
		
		int result=0;
		switch(op) {
		case '+':
			result=values1+values2;
			break;
		case '-':
			result=values2-values1;
			break;
		case '*':
			result= values1*values2;
			break;
		case '/':
			if(values1!=0)
			result=values2/values1;
			else
				System.out.println("除数为零不合法");
			result=values2/values1;
			break;
		}
		return result;
	}

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个合法的中缀表达式");
		String str=sc.next();
		str=infixToPostfix(str);
		System.out.println("Str:"+str);
		
		System.out.println("result:"+calcuPostfix(str));
		
	}
	
	
}
