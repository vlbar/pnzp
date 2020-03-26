package figure.compound.square;

import figure.simple.Point;

public class Rectangle
{
	public Point topLeftPoint, bottomRightPoint;

	public Rectangle(Point topLeftPoint, Point bottomRightPoint)
	{
		this.topLeftPoint = topLeftPoint;
		this.bottomRightPoint = bottomRightPoint;
	}
}