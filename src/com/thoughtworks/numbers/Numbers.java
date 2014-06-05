package com.thoughtworks.numbers;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.addAll;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of 4.
// For example, "BL"

public class Numbers {
    public static void main(String[] args) {
        Integer source[] = {1, 9, 4, 16, 4};
        List<Integer> numbers = new ArrayList<Integer>();
        addAll(numbers, source);

        printSquareRoots(squareRoot(numbersLargerThanFour(numbers)));
    }

    private static void printSquareRoots(List<Double> squareRoots){
        System.out.println(join(squareRoots));
    }

    private static List<Double> squareRoot(List<Integer> numbers){
        List<Double> squareRoots = new ArrayList<Double>();
        for (Integer number : numbers) {
            squareRoots.add(Math.sqrt(number));
        }
        return squareRoots;
    }

    private static List<Integer> numbersLargerThanFour(List<Integer> numbers){
        List<Integer> largerThanFour = new ArrayList<Integer>();
        for (Integer number : numbers) {
            if(number > 4){
                largerThanFour.add(number);
            }
        }
        return largerThanFour;
    }

    private static String join(List<Double> listItems){
        String joinedString = "";

        for (Double listItem : listItems) {
            joinedString += listItem + ", ";
        }
        joinedString = joinedString.substring(0, joinedString.length()-2);
        return joinedString;
    }

}
