package figure.compound;

import figure.simple.Point;

public class Circle
{
	public Point center = new Point(0, 0);
	public float radius;

	public Circle(float x, float y, float radius)
	{
		center.x = x;
		center.y = y;
		this.radius = radius;
	}

	public boolean inside(Point point)
	{
		return (point.x - center.x) * (point.x - center.x) + (point.y - center.y) * (point.y - center.y) <= radius * radius;
	}
}