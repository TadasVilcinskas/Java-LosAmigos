/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.losamigos;

/**
 *
 * @author tadasvilcinskas
 */

// Updates? Hopefully...

import java.util.*;

public class LosAmigos {

    public static void main(String[] args) {
        // Athletes:
        String[] names = {"Boss", "Block", "Brawn", "Bryant", "Clorksan"};
        int[] ages = {30, 24, 23, 37, 23};
        int[] points = {473, 133, 115, 1161, 1225};
        
        // Reserves:
        String[] namesReserves = {"Hebbirt", "Heurtas", "Kylle", "Nenca", "Rendla"};
        int[] agesReserves = {29, 32, 25, 23, 21};
        int[] pointsReserves = {481, 237, 152, 349, 919};
        
        
        // Task 1:
        System.out.println("1.");
        int oldestIndex = 0;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > ages[oldestIndex]) {
                oldestIndex = i;
            }
        }
        System.out.println("Oldest member:\nName: " + names[oldestIndex] + "\nAge: " + ages[oldestIndex] + "\nPoints: " + points[oldestIndex]);
            
        
        // Task 2:
        System.out.println("\n2.");
        int youngestIndex = 0;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        System.out.println("Youngest member:\nName: " + names[youngestIndex] + "\nAge: " + ages[youngestIndex] + "\nPoints: " + points[youngestIndex]);

        // Task 3:
        System.out.println("\n3.");
        int highestPointIndex = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[i] > points[highestPointIndex]) {
                highestPointIndex = i;
            }
        }
        int lowestPointIndex = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[i] < points[lowestPointIndex]) {
                lowestPointIndex = i;
            }
        }
        System.out.println("Point range between highest and lowest: " + (points[highestPointIndex] - points[lowestPointIndex]));
        
        
        // Task 4:
        System.out.println("\n4.");
        for (int i = 0; i < ages.length; i++) {
            for (int j = i + 1; j < ages.length; j++) {
                if (ages[i] < ages[j]) {
                    // Rearagnging the ages array
                    int tempAge = ages[i];
                    ages[i] = ages[j];
                    ages[j] = tempAge;
                    // Rearranging the names array
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                    // Rearagnging the ages array
                    int tempPoints = points[i];
                    points[i] = points[j];
                    points[j] = tempPoints;
                }    
            }
        }
        // Printing all the names in one line using formatting for equal spacing
        System.out.print("Names:  " + names[0]);
        for (int i = 1; i < names.length; i++) {
            System.out.print(", " + names[i]);
        }
        System.out.println("");
        // Printing all the ages in one line using formatting for equal spacing
        System.out.printf("Ages:   %" + names[0].length() + "d", ages[0]);
        for (int i = 1; i < ages.length; i++) {
            System.out.printf(", %" + names[i].length() + "d", ages[i]);
        }
        System.out.println("");
        // Printing all the points in one line using formatting for equal spacing
        System.out.printf("Points: %" + names[0].length() + "d", points[0]);
        for (int i = 1; i < points.length; i++) {
            System.out.printf(", %" + names[i].length() + "d", points[i]);
        }
        System.out.println("");
        
        
        // Task 6:
        System.out.println("\n5.");
        double totalAge = 0;
        for (int i = 0; i < ages.length; i++) {
            totalAge += ages[i];
        }
        double averageAge = totalAge / ages.length;
        System.out.println("Average age of the team: " + averageAge);
        
               
        // Task 6
        System.out.println("\n6.");
        double totalPoints = 0;
        for (int i = 0; i < points.length; i++) {
            totalPoints += points[i];
        }
        double averagePoints = totalPoints / points.length;
        System.out.println("Average points of the team: " + averagePoints);
        
        
        // Task 7:
        System.out.println("\n7.");
        int highestPointReserveIndex = 0;
        for (int i = 0; i < pointsReserves.length; i++) {
            if (pointsReserves[i] > pointsReserves[highestPointReserveIndex]) {
                highestPointReserveIndex = i;
            }
        }        
        lowestPointIndex = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[i] < points[lowestPointIndex]) {
                lowestPointIndex = i;
            }
        }
        // Swapping the players
        String tempName = names[lowestPointIndex];
        int tempAge = ages[lowestPointIndex];
        int tempPoint = points[lowestPointIndex];
        names[lowestPointIndex] = namesReserves[highestPointReserveIndex];
        ages[lowestPointIndex] = agesReserves[highestPointReserveIndex];
        points[lowestPointIndex] = pointsReserves[highestPointReserveIndex];
        namesReserves[highestPointReserveIndex] = tempName;
        agesReserves[highestPointReserveIndex] = tempAge;
        pointsReserves[highestPointReserveIndex] = tempPoint;
        // Printing the new squad
        System.out.print("Names of new squad: " + names[0]);
        for (int i = 1; i < names.length; i++) {
            System.out.print(", " + names[i]);
        }
        System.out.println("");
        
        
        // Task 8:
        System.out.println("\n8.");
        double newTotalPoints = 0;
        for (int i = 0; i < points.length; i++) {
            newTotalPoints += points[i];
        }
        System.out.println(newTotalPoints);
        double newAveragePoints = newTotalPoints / points.length;
        System.out.println("Average points of the new squad: " + newAveragePoints);
        
        
        // Task 9:
        System.out.println("\n9.");
        // Creating an array list of old athletes above the average athlete age
        ArrayList<Integer> oldAgeIndexes = new ArrayList<>();
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > averageAge) {
                oldAgeIndexes.add(i);
            }
        }
        // Creating an array list of young reserves below the average athlete age
        ArrayList<Integer> youngAgeReserveIndexes = new ArrayList<>();
        for (int i = 0; i < agesReserves.length; i++) {
            if (agesReserves[i] < averageAge) {
                youngAgeReserveIndexes.add(i);
            }
        }
        // Rearagnging the young reserves index array by points from largest to smallest
        for (int i = 0; i < youngAgeReserveIndexes.size(); i++) {
            for (int j = i + 1; j < youngAgeReserveIndexes.size(); j++) {
                if (pointsReserves[youngAgeReserveIndexes.get(i)] < pointsReserves[youngAgeReserveIndexes.get(j)]) {
                int tempReservePointIndex = youngAgeReserveIndexes.get(i);
                youngAgeReserveIndexes.set(i, youngAgeReserveIndexes.get(j));
                youngAgeReserveIndexes.set(j, tempReservePointIndex);
                }
            }
        }
        // Swapping the players
        for (int i = 0; i < oldAgeIndexes.size()  && i < youngAgeReserveIndexes.size(); i++) {
            System.out.println("Athlete " + names[oldAgeIndexes.get(i)] + " got replaced by " + namesReserves[youngAgeReserveIndexes.get(i)]);
            tempName = names[oldAgeIndexes.get(i)];
            tempAge = ages[oldAgeIndexes.get(i)];
            tempPoint = points[oldAgeIndexes.get(i)];
            names[oldAgeIndexes.get(i)] = namesReserves[youngAgeReserveIndexes.get(i)];
            ages[oldAgeIndexes.get(i)] = agesReserves[youngAgeReserveIndexes.get(i)];
            points[oldAgeIndexes.get(i)] = pointsReserves[youngAgeReserveIndexes.get(i)];
            namesReserves[youngAgeReserveIndexes.get(i)] = tempName;
            agesReserves[youngAgeReserveIndexes.get(i)] = tempAge;
            pointsReserves[youngAgeReserveIndexes.get(i)] = tempPoint;
        }
        
        
        // Task 10:
        System.out.println("\n10.");
        ArrayList<String> namesUnited = new ArrayList<>();
        ArrayList<Integer> agesUnited = new ArrayList<>();
        ArrayList<Integer> pointsUnited = new ArrayList<>();
        // Adding the arrays separately incase their lengths become different
        for (int i = 0; i < names.length; i++) {   // The same index is used since they're parralel arrays
             namesUnited.add(names[i]);
             agesUnited.add(ages[i]);
             pointsUnited.add(points[i]);
        }
        for (int i = 0; i < namesReserves.length; i++) {   // The same index is used since they're parralel arrays
             namesUnited.add(namesReserves[i]);
             agesUnited.add(agesReserves[i]);
             pointsUnited.add(pointsReserves[i]);
        }
        System.out.println("United squad:");
        // Printing all the names in one line using formatting for equal spacing
        System.out.print("Names:  " + namesUnited.get(0));
        for (int i = 1; i < namesUnited.size(); i++) {
            System.out.print(", " + namesUnited.get(i));
        }
        System.out.println("");
        // Printing all the ages in one line using formatting for equal spacing
        System.out.printf("Ages:   %" + namesUnited.get(0).length() + "d", agesUnited.get(0));
        for (int i = 1; i < agesUnited.size(); i++) {
            System.out.printf(", %" + namesUnited.get(i).length() + "d", agesUnited.get(i));
        }
        System.out.println("");
        // Printing all the points in one line using formatting for equal spacing
        System.out.printf("Points: %" + namesUnited.get(0).length() + "d", pointsUnited.get(0));
        for (int i = 1; i < pointsUnited.size(); i++) {
            System.out.printf(", %" + namesUnited.get(i).length() + "d", pointsUnited.get(i));
        }
        System.out.println("");
        
        
        // Task 11:
        System.out.println("\n11.");
        for (int i = 0; i < pointsUnited.size(); i++) {
            for (int j = i + 1; j < pointsUnited.size(); j++) {
                if (pointsUnited.get(i) > pointsUnited.get(j)) {
                    tempName = namesUnited.get(i);
                    tempAge = agesUnited.get(i);
                    tempPoint = pointsUnited.get(i);
                    namesUnited.set(i, namesUnited.get(j));
                    agesUnited.set(i, agesUnited.get(j));
                    pointsUnited.set(i, pointsUnited.get(j));
                    namesUnited.set(j, tempName);
                    agesUnited.set(j, tempAge);
                    pointsUnited.set(j, tempPoint);
                }
            }
        }
        System.out.println("United squad according to points scored:");
        // Printing all the names in one line using formatting for equal spacing
        System.out.print("Names:  " + namesUnited.get(0));
        for (int i = 1; i < namesUnited.size(); i++) {
            System.out.print(", " + namesUnited.get(i));
        }
        System.out.println("");
        // Printing all the ages in one line using formatting for equal spacing
        System.out.printf("Ages:   %" + namesUnited.get(0).length() + "d", agesUnited.get(0));
        for (int i = 1; i < agesUnited.size(); i++) {
            System.out.printf(", %" + namesUnited.get(i).length() + "d", agesUnited.get(i));
        }
        System.out.println("");
        // Printing all the points in one line using formatting for equal spacing
        System.out.printf("Points: %" + namesUnited.get(0).length() + "d", pointsUnited.get(0));
        for (int i = 1; i < pointsUnited.size(); i++) {
            System.out.printf(", %" + namesUnited.get(i).length() + "d", pointsUnited.get(i));
        }
        System.out.println("");
        
        
        // Task 12:
        System.out.println("\n12.");
        int target = 1161;
        int indexBryant = -1;
        // Binary search using an in-built function:
        // int indexBryant = Collections.binarySearch(pointsUnited, target);
        int lowestIndex = 0;
        int highestIndex = pointsUnited.size() - 1;
        while (lowestIndex <= highestIndex) {
            int middleIndex = lowestIndex + (highestIndex - lowestIndex) / 2;
            int value = pointsUnited.get(middleIndex);
            // Shortened one-line comparisons: finding the index of Bryant
            if (value < target) lowestIndex = middleIndex + 1;
            else if (value > target) highestIndex = middleIndex - 1;
            else {
                indexBryant = middleIndex;
                break;
            }
        }
        if (indexBryant >= 0) {
            // Removing Bryant from the united lists
            namesUnited.remove(indexBryant);
            agesUnited.remove(indexBryant);
            pointsUnited.remove(indexBryant);
            // Adding Bryant Junior to the united lists
            namesUnited.add("BryantJr");
            agesUnited.add(18);
            pointsUnited.add(0);
            // Printing all of the united lists
            System.out.println("New united squad after Bryant's retirement:");
            // Printing all the names in one line using formatting for equal spacing
            System.out.print("Names:  " + namesUnited.get(0));
            for (int i = 1; i < namesUnited.size(); i++) {
                System.out.print(", " + namesUnited.get(i));
            }
            System.out.println("");
            // Printing all the ages in one line using formatting for equal spacing
            System.out.printf("Ages:   %" + namesUnited.get(0).length() + "d", agesUnited.get(0));
            for (int i = 1; i < agesUnited.size(); i++) {
                System.out.printf(", %" + namesUnited.get(i).length() + "d", agesUnited.get(i));
            }
            System.out.println("");
            // Printing all the points in one line using formatting for equal spacing
            System.out.printf("Points: %" + namesUnited.get(0).length() + "d", pointsUnited.get(0));
            for (int i = 1; i < pointsUnited.size(); i++) {
                System.out.printf(", %" + namesUnited.get(i).length() + "d", pointsUnited.get(i));
        }
        System.out.println("");
        } else {
            System.out.println("Bryant is NOT in the list");
        }
    }
}
