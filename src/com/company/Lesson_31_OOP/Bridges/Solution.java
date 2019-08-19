package com.company.Lesson_31_OOP.Bridges;

public class Solution {

    public static void println(Bridge bridge){
        if (bridge instanceof WaterBridge){
            System.out.println(bridge.getCarsCount());
        } else if (bridge instanceof SuspensionBridge){
            System.out.println(bridge.getCarsCount());
        }
    }
}
