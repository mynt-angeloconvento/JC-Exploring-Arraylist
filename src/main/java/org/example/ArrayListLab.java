package org.example;

import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {

        ArrayList<String> missionTasks = new ArrayList<>();
        System.out.println("Is the list empty initially? " + missionTasks.isEmpty());
        missionTasks.add("Secure the perimeter");
        missionTasks.add("Establish communication");
        missionTasks.add("Report status");
        System.out.println("Current tasks: " + missionTasks);
        System.out.println("Number of tasks: " + missionTasks.size());
    }
}