package org.example;

import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {

        // ArrayList<String> missionTasks = new ArrayList<>();
        // System.out.println("Is the list empty initially? " + missionTasks.isEmpty());
        // missionTasks.add("Secure the perimeter");
        // missionTasks.add("Establish communication");
        // missionTasks.add("Report status");
        // System.out.println("Current tasks: " + missionTasks);
        // System.out.println("Number of tasks: " + missionTasks.size());

        // ArrayList<String> equipment = new ArrayList<>();
        // equipment.add("Compass");
        // equipment.add("Map");
        // equipment.add("Radio");
        // String secondItem = equipment.get(1);
        // System.out.println("Item at index 1: " + secondItem);
        // System.out.println("List before modification: " + equipment);
        // equipment.set(0, "GPS");
        // System.out.println("List after modification: " + equipment);

        // ArrayList<String> objectives = new ArrayList<>();
        // objectives.add("Primary Objective");
        // objectives.add("Tertiary Objective");
        // objectives.add(1, "Secondary Objective");
        // System.out.println("List after insertion: " + objectives);
        // String removedObjective = objectives.remove(2);
        // System.out.println("Removed objective: " + removedObjective);
        // System.out.println("List after removing by index: " + objectives);
        // objectives.remove("Primary Objective");
        // System.out.println("List after removing by index: " + objectives);

        ArrayList<String> waypoints = new ArrayList<>();
        waypoints.add("Alpha");
        waypoints.add("Bravo");
        waypoints.add("Charlie");
        boolean hasBravo = waypoints.contains("Bravo");
        System.out.println("Does the list contain 'Bravo'? " + hasBravo);
        int indexOfCharlie = waypoints.indexOf("Charlie");
        System.out.println("Index of 'Charlie': " + indexOfCharlie);
        int indexOfDelta = waypoints.indexOf("Delta");
        System.out.println("Index of 'Delta': " + indexOfDelta);
    }
}