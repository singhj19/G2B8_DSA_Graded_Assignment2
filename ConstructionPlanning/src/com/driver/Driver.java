package com.driver;

import com.planning.FloorPlanning;

import java.util.*;

public class Driver {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of floors");
        Integer floors = s.nextInt();

        FloorPlanning fp = new FloorPlanning(floors);
        fp.constructionPlan();

    }
}
