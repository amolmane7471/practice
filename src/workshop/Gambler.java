package workshop;

import java.util.Scanner;

public class Gambler {

	public void compare(Double length1,Double length2) {
		if(length1.compareTo(length2)==0)
		{
			System.out.println("lines are equal ");
		}
		else if(length1.compareTo(length2)>0)
		{
			System.out.println(" line one is greater than line two");
		}
		else
		{
			System.out.println(" line one is less than line two");
			
		}	
	}
	
	public void equality(Double length1,Double length2) {
	if(length1.equals(length2))
	{
	System.out.println("both lines are  equals");	
	}
	else
		System.out.println("lines are not equal");
	}
	
	public static void main(String args[])
	{
		Gambler g=new Gambler();
		Scanner sc=new Scanner(System.in);
		int x1,y1,x2,y2;
		int p1,q1,p2,q2;
		double length1,length2;
		System.out.println("enter value for x1");
		x1=sc.nextInt();
		System.out.println("enter value for y1");
		y1=sc.nextInt();
		System.out.println("enter value for x2");
		x2=sc.nextInt();
		System.out.println("enter value for y2");
		y2=sc.nextInt();
		length1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.println("length of line1:"+length1);
		
		System.out.println("enter value for p1");
		p1=sc.nextInt();
		System.out.println("enter value for q1");
		q1=sc.nextInt();
		System.out.println("enter value for p2");
		p2=sc.nextInt();
		System.out.println("enter value for q2");
		q2=sc.nextInt();
		length2=Math.sqrt(Math.pow((p2-p1),2)+Math.pow((q2-q1),2));
		System.out.println("length of line2:"+length2);
		g.equality(length1, length2);
		g.compare(length1, length2);
		sc.close();
	}
}