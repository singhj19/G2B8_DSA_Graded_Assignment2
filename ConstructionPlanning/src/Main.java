import com.planning.FloorPlanning;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of floors");
        Integer floors = s.nextInt();

        FloorPlanning fp = new FloorPlanning(floors);
        fp.constructionPlan();



//        System.out.println("The order of construction is as follows");
//        int floorRemain = floors;
//        for (int i = 0; i < floors; i++) {
//            System.out.println("Day: " + (i+1) );
//
//
//            // Create a sublist
//            List<Integer> sublist = l1.subList(0,(i+1));
//
//            for (int j = 0; j <= i ; j++) {
//                if(sublist.contains( floorRemain)  )
//                {
//                    System.out.print(floorRemain + " ");
//                    l1.set(l1.indexOf(floorRemain), null);
//                    floorRemain--;
//
//                }
//            }
//            System.out.println();

        }
    }
