package com.masai;

public class Qestion4 {
   void accepts(int n) {
	   if(n<0) {
		   System.out.println("Error");
	   }else if(n%2!=0) {
		   System.out.println(n);
	   }else {
		   int f=1;
		   for(int i=0;i<500;i+=10) {
			   if((f*i)>=n) {
				   System.out.println(f*i);
				   break;
			   }
		   }
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Qestion4 q=new Qestion4();
		q.accepts(45);
	}

}
