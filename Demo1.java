package com.masai;

public class Demo1 {
	String s;
	float f;
	int i;
	public Demo1() {
		System.out.println("from empty");
	}
	public Demo1(String s){
		this();
		this.s=s;
		System.out.println("from s");
	}
	 
	
	public Demo1(float f){
		this("s");
		this.f=f;
		System.out.println("from f");
		
		
	   }
	public Demo1(int i){
		this("f");
		this.i=i;
		System.out.println("from i");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d=new Demo1(1);
		

	}

}
