package com.acadgild;
/**
 * Session 9 Assignment 1
 *
 * Create an application having a Generic HashMap with empCode as key and empName as value.
 *
 * Display only EmpNames as output.
 */

import java.util.HashMap;

public class Employees {

    public static void main (String[] args){

        //Instantiating empData as a HashMap with Integer key and String value pairs
        //Integer type for empCode and String type for empName
        HashMap<Integer,String> empData = new HashMap<Integer, String>();

        //Putting key value pairs of employee codes and employee names into empData
        empData.put(102, "John Smith");
        empData.put(103, "Frank Gill");
        empData.put(104, "Henry Mitchel");
        empData.put(105, "Mike Summers");
        empData.put(106, "Luke Field");
        empData.put(107, "Jane Wynn");

        //Displaying only the empNames by using the value method to target only empNames
        for(String empName: empData.values()){
            System.out.println(empName);
        }
    }
}