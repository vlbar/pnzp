package com.vlsu.lab02;

import com.vlsu.lab02.figure.compound.Circle;
import com.vlsu.lab02.figure.simple.Point;

import java.util.Scanner;

public class Main
{
	public static void main(String [] args) 
	{
		Scanner console = new Scanner(System.in);

		System.out.print("Circle (x,y,r) ");
		float x = console.nextFloat();
		float y = console.nextFloat();
		float r = console.nextFloat();

		Circle circle = new Circle(x,y,r);

		System.out.print("Point (x,y) ");
		x = console.nextFloat();
		y = console.nextFloat();

		System.out.print(circle.inside(new Point(x,y)));
	}
}