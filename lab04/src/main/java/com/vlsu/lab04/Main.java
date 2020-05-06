package com.vlsu.lab04;

import com.vlsu.lab04.comparators.PointComparator;
import com.vlsu.lab04.primitives.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<Point> pointList = new ArrayList<Point>();
        int N;

        System.out.print("Enter the number of points: ");
        N = console.nextInt();
        System.out.println();
        
        for(int i = 0; i < N; i++) {
            System.out.print("X = ");
            double x = console.nextDouble();
            System.out.print("Y = ");
            double y = console.nextDouble();
            System.out.println();
            
            pointList.add(new Point(x,y));
        }

        Collections.sort(pointList, new PointComparator());
        writeList(pointList);
    }
    
    private static void writeList(ArrayList list) {
        for(Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}
