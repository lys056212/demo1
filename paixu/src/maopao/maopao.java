package maopao;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class maopao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//int a[]= {8,23,5,0,9};
//		int  num=5;
//		 Scanner sc=new Scanner(System.in);
//		int a[]=new int [num];
//		for(int n=0;n<a.length;n++) {
//			System.out.println("請輸入第"+n+"個數字");
//			a[n]=sc.nextInt();
//		}
//	
//		for(int k=0;k<a.length;k++) {
//		
//			System.out.print(a[k]+"  ");
//			
//		}
//		System.out.println();
//		
		//選擇排序
//		int i,j,temp;
//		
//		for(i=0;i<a.length-1;i++) {
//			for(j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		
		
//		//冒泡排序
//		int temp=0;
//		for(int i=0;i<a.length;i++) {
//			temp=a[i];
//			for(int j=i+1;j<a.length;j++) {
//				if(temp>a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//					
//				
//			}
//			
//			for(int k=0;k<a.length;k++) {
//				System.out.print(a[k]+"  ");
//			
//			}
//			System.out.println();
//		}
//		
//		
//		
		Set<Integer> s=new TreeSet<Integer>();
		s.add(9);
		s.add(7);
		s.add(5);
		s.add(8);
		s.add(9);
		s.add(0);
		s.add(666);
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
			
	
		
		
		
		
//		for(int k=0;k<a.length;k++) {
//			System.out.print(a[k]+"  ");
//			
//		}

	}

}
