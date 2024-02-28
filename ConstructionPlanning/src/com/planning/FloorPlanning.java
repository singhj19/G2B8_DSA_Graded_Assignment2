package com.planning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FloorPlanning {
    public int floors;
    ArrayList<Integer> l1 = new ArrayList<>();

    public FloorPlanning(int floors) {
        this.floors = floors;
        getFloorPlan();
    }

    void getFloorPlan()
    {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < floors; i++) {
            System.out.println("enter the floor size given on day : " + (i + 1));
            l1.add(s.nextInt());
        }
    }

    public void constructionPlan()
    {
        int floorRemain = floors;
        System.out.println("The order of construction is as follows");
        for (int i = 0; i < floors; i++) {
            System.out.println("Day: " + (i + 1));


            // Create a sublist
            List<Integer> sublist = l1.subList(0, (i + 1));

            for (int j = 0; j <= i; j++) {
                if (sublist.contains(floorRemain)) {
                    System.out.print(floorRemain + " ");
                    l1.set(l1.indexOf(floorRemain), null);
                    floorRemain--;

                }
            }
            System.out.println();
        }

    }

}
