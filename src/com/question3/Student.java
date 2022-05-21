package com.question3;

public class Student {
	
	
		private int roll;
		private String name;
		private int marks;
		private int age;
		//zero argument constructor
		public Student(){
		}
		//parameterized constructor
		public Student(int roll,String name,int marks,int age){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
		this. age=age;
		}
		public void setRoll(int roll){
		
		this.roll=roll;
		}
		public int getRoll(){
		return roll;
		}
		public void setName(String name){
		this.name=name;
		}
		public String getName(){
		return name;
		}
		public void setMarks(int marks){
			if(marks>0 &&marks<500) {
		this.marks= marks;}
			
		}
		public int getMarks(){
		return marks;
		}
		
		public void setAge(int age){
			if(age>18 &&age<70) {
			this. age=age;}
			
			}
	    public int getAge(){
			return age;
			}
		public void showDetails(){
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
		System.out.println("Age is :"+age);
		}


}
