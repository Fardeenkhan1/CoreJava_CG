package common;
import java.util.*;
public class TestPoint
{
	public static void main(String args[])
	{
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x,y coordinates for first point");
		x = sc.nextInt();
		y = sc.nextInt();
		Point2D a = new Point2D(x,y);
		System.out.println(a.getDetails());
		
		System.out.println("Enter x,y coordinates for first point");
		x = sc.nextInt();
		y = sc.nextInt();
		Point2D b = new Point2D(x,y);
		System.out.println(b.getDetails());
	}
}