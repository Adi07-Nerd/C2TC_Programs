package miscellaneousProgram;

import java.util.Scanner;

public class NestedLoopDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What you want to perform?\n1.checking loop.\n2.Left 90 angle triangle.\n3.Right 90 angle triangle.\n4.Equilateral triangle.\n5.Daimond shapes");
		int ch=sc.nextInt();
		System.out.println("Enter Levels");
		int a=sc.nextInt();
		sc.close();
		switch(ch)
		{
		case 1:
			System.out.println("Checking Loop");
			observingLoop();
			break;
		case 2:
			System.out.println("Left 90 Angle Triangle");
			leftAngleTriangle(a);
			break;
		case 3:
			System.out.println("Right 90 Angle Triangle");
			rightAngleTriangle(a);
			break;
		case 4:
			System.out.println("Equilateral Triangle");
			equiLateralTriangle(a);
			break;
		case 5:
			System.out.println("diamond Shape");
			equilateralReflection(a);
			break;
		default:
			System.out.println("Please enter valid number.");
		}
	}
	public static void observingLoop()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println("Value of i "+i+" and value of j is "+j);
			}
			System.out.println("******************************");
		}
	}
	public static void leftAngleTriangle(int level)
	{
		for(int i=0;i<level;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
	}
	
	public static void rightAngleTriangle(int level)
	{
		for(int i=level-1;i>=0;i--)
		{
			for(int j=0;j<level;j++)
			{
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void equiLateralTriangle(int level)
	{
		for(int i=0;i<level;i++)
		{
			for(int j=0;j<level*2;j++)
			{
				if(j==(level-i))
				{
					for(int t=0;t<=i;t++)
						System.out.print("* ");
					break;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void equilateralReflection(int level)
	{
		for(int i=0;i<level;i++)
		{
			for(int j=0;j<level*2;j++)
			{
				if(j==(level-i))
				{
					for(int t=0;t<=i;t++)
						System.out.print("$ ");
					break;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=0;i<level-1;i++) 
		{
			for(int j=0;j<(level-1)*2;j++)
			{
				System.out.print(" ");
				if(j>i)
				{
					for(int t=0;t<(level-1-i);t++)
						System.out.print("$ ");
					break;
				}
			}
			System.out.println();
		}
	}
}
