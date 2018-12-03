/*
File: GallonsToLiters.java

This program display a conversino
table of gallons to liters

 */

public class GallonsToLiters {
    public static void main(String[] args) {
        double gallons;
        double liters;
        int counter = 0;

        for( gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + + liters + " liters.");

            counter++;

            //every 10th line print a blank line
            if(counter == 10) {
                System.out.println();
                counter = 0; //reset the line counter
            }
        }
    }

}
