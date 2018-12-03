public class Vehicle {
    int passengers; //number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    //Constructor for Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    //Return the range
    int range() {
        return fuelcap * mpg; // return the range for a given vehicle
    }

    //Compute fuel needed for a given distance
    double fuelneeded(int miles) {

        return (double) miles / mpg;
    }

}
