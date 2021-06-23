package com.wedntask.it;

public class StudentMarks {
	
	int rollNo ;
	String name;
	int m1;
	int m2;
	int m3;
	public StudentMarks(int rollNo,String name,int m1,int m2,int m3)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMarks s1 = new StudentMarks(1234,"udaykrishna",45,50,70);
		StudentMarks s2 = new StudentMarks(5678,"ravikumar",67,35,20);
		
		int totalMarks1 = s1.m1+s1.m2+s1.m3;
		int totalMarks2 = s2.m1+s2.m2+s2.m3;
		if (totalMarks1 > totalMarks2)
		{
			System.out.println("total marks of  3 subject maximu is :"+totalMarks1);
			System.out.println("student name is :"+s1.name);
		}
		else if (totalMarks2 >totalMarks1)
		{
			System.out.println("total marks of  3 subject maximu is :"+totalMarks2);
			System.out.println("student name is :"+s2.name);


		}
		
		
	}
}
	

