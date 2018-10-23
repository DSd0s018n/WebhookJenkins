package com.walmart.source;

public class FindNoInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int noToFind = 6;
        boolean found = false;
        for (int i=0; i < array.length; i++) {
            if (array[i] == noToFind )
                found = true;
        }
        System.out.println("found : " + found);
    }
}
