package com.vlsu.lab02.figure.compound.square;

import com.vlsu.lab02.figure.simple.Point;

public class Rectangle
{
	public Point topLeftPoint, bottomRightPoint;

	public Rectangle(Point topLeftPoint, Point bottomRightPoint)
	{
		this.topLeftPoint = topLeftPoint;
		this.bottomRightPoint = bottomRightPoint;
	}
}