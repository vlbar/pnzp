package com.vlsu.lab01;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Boolean isFound = false;

		System.out.print("N = ");
		int N = console.nextInt();
		System.out.print("M = ");
		int M = console.nextInt();

		System.out.println("Sequence of squared numbers:");
		for (int i = 1; i <= N; i++) {
			int sqr = i * i;
			if(sqr % M == 1)
			{
				if(!isFound) isFound = true;
				System.out.println(sqr);
			}
		}

		if(!isFound) System.out.println("NO");
	}
}