import java.lang.Math.*;
import java.lang.Math.*;
import java.util.*;

public class Point2D
{
	//3.1
	int x,y;
	Point2D(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	//3.2
	public boolean isEqual(Point2D p)
	{
		if(this.x == p.x && this.y == p.y)
		{
//			System.out.println("Points are equal");
			return true;
		}
		else
		{
//			System.out.println("Points are not equal");
			return false;
		}
	}
	//3.3
	public String getDetails()
	{
		return "Point ("+x+","+y+")";
	}
	//3.4
	public Point2D createNewPoint(int x, int y)
	{
		return new Point2D(this.x + x, this.y + y);
	}
	//3.5
	public double calcDistance(Point2D anotherPoint)
	{
		return Math.sqrt(Math.pow(this.x - anotherPoint.x, 2) + Math.pow(this.y - anotherPoint.y, 2));
	}
	//3.6
	public static Point2D TestPoint()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x-coordinate");
		int x = sc.nextInt();
		System.out.println("Enter y-coordinate");
		int y = sc.nextInt();
		return new Point2D(x,y);
	}
	public static void main(String args[])
	{
		Point2D a = new Point2D(11,6); // create first point
//		System.out.println(a.x);
		System.out.println(a.getDetails()); // getDetails Used to print (x,y) for a point
		Point2D b = a.createNewPoint(-2, 10); // create another point using first point
		System.out.println(b.getDetails());
		boolean isequal = a.isEqual(b); //Used to check whether two points are equal or not.
		System.out.println(isequal);
		System.out.println(a.calcDistance(b)); //Calculate Distance between two point
		
		Point2D c = TestPoint(); //Taking input from user
		System.out.println(c.getDetails());
	}
}
