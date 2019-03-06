/*
 * Anagram
 * Collin Thomason
 * 3/5/2019
 */

package org.naic.thomason.test;
import java.lang.reflect.Method;
import java.util.*;

public class Anagram {
    public static void main(String args[]) {
        System.out.println();

        Scanner input = new Scanner(System.in);
        String firstTerm, secondTerm; // Strings to contain the two terms

        System.out.println("Enter the first term: ");
        firstTerm = input.nextLine();
        System.out.println("Enter the second term: ");
        secondTerm = input.nextLine();

        checkAnagram(firstTerm, secondTerm);
    }

    /**
     * Compares the two strings to see if they are an Anagram
     *
     * @param firstTerm  the first string being used in the comparison
     * @param secondTerm the second string being used in the comparison
     */
    public static void checkAnagram(String firstTerm, String secondTerm) {
        // Splits the Strings into arrays to compare easier
        String firstTermArray[] = firstTerm.split("");
        String secondTermArray[] = secondTerm.split("");

        ArrayList<String> firstList = new ArrayList<String>();
        ArrayList<String> secondList = new ArrayList<String>();

        // Organizes the terms into Array lists while removing all spaces contained.
        for (String s : firstTermArray) {
            if (!s.equalsIgnoreCase(" ")) {
                firstList.add(s.toLowerCase());
            }
        }
        for (String s : secondTermArray) {
            if (!s.equalsIgnoreCase(" ")) {
                secondList.add(s.toLowerCase());
            }
        }

        // Sorts the two array lists for easy comparison
        Collections.sort(firstList);
        Collections.sort(secondList);

        /* Compares the two lists to see if they are equal */
        if (firstList.equals(secondList)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    public static void checkArgumentCount(Method method) {
        if (method.getParameterCount() > 2) {
            throw new IllegalArgumentException("There only needs to be two arguments. ");
        } else if ((method.getParameterCount()) < 2) {
            throw new IllegalArgumentException(("There must be two arguments"));
        }
        System.out.println("Executing");
    }

}