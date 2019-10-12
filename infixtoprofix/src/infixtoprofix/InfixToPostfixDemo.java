package infixtoprofix;

import java.util.Scanner;
import java.util.Stack;


public class InfixToPostfixDemo{
	public static String itop(String infix) {
		Stack<Character> op=new Stack<Character>();
		StringBuilder postfix=new StringBuilder("");
		char[] prefix=infix.trim().toCharArray();
		Character ch;
		
		for(int i=0;i<prefix.length;i++) {
			ch=prefix[i];
			if(ch>='0'&&ch<='9')
			{
				postfix.append(ch);
				continue;
			}
			
			if('('==ch) {
				op.push(ch);
				continue;
				
			}
			if('+'==ch||'-'==ch) {
				while(!op.empty()&&(op.peek()!='(')){
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
				while(!op.empty()&&op.peek()!='(') {
					postfix.append(op.pop());
				}
				op.pop();
				continue;
			
			}
			
		}
		
		while(!op.empty()) 
			postfix.append(op.pop());
		
		return postfix.toString();
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个合法的中缀表达书：");
		String str=sc.next();
		System.out.println(str+":"+itop(str));
		
		
	}
	}
	
