package com.coordsystem;

import com.coordsystem.comparators.PointComparator;
import com.coordsystem.primitives.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 

public class MainClass {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList pointList = new ArrayList();
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
        
        sort(pointList);
    }
    
    private static void sort(ArrayList list) {
        Collections.sort(list, new PointComparator());
        for(Object obj : list) {
            Point point = (Point)obj;
            System.out.println(obj.toString());
        }
    }
}
