package org.example;

import java.sql.Array;
import java.util.*;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)
        // Use a loop to set every element to "apple"
        // Replace the line below with your implementation
        String[] fruits = new String[size];

        Arrays.fill(fruits, "apple");

        return fruits;
    }

    public String[] makeTopThreeArray(String[] fruits) {
        // Create and return a new array of strings containing the first three elements of the given array

        String[] topThree = new String[3];

        for (int i = 0; i < 3; i++) {
            topThree[i] = fruits[i];
        }

        return topThree;
    }

    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation

        ArrayList<String> fruitList = new ArrayList<String>(Arrays.asList(
                                        "apple", "banana", "cherry", "date", "elderberry"));

        return fruitList;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation
        ArrayList<String> threeFruits = new ArrayList<String>(Arrays.asList(
                                        fruit1, fruit2, fruit3));

        return threeFruits;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation

        HashMap<String, String> fruitMap = new HashMap<String, String>();

        fruitMap.put("apple", "red");
        fruitMap.put("banana", "yellow");
        fruitMap.put("cherry", "red");
        fruitMap.put("date", "brown");
        fruitMap.put("elderberry", "black");

        return fruitMap;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementation
        String appleColor = fruitMap.get("apple");

        return appleColor;
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation
        HashSet<String> fruitSet = new HashSet<String>();

        fruitSet.add(fruit1);
        fruitSet.add(fruit2);
        fruitSet.add(fruit3);

        return fruitSet;
    }
}
