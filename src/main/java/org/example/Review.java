package org.example;

public class Review {

    // Warmup 1 sleepIn
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) { // Comparing if it is not a weekday, or it is vacation
            return true; // We can sleep in (Sleep in = true)
        }

        return false; // Default return is false

        // This could also be done in an if else....
    }

    // Warmup 1 monkeyTrouble
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) { // Default in java is false
        if (!aSmile && !bSmile) { // if not default
            return true; // We return true
        } else if (aSmile && bSmile) { // For the opposite
            return true; // We also want true
        } else {
            return false; // Anything else we want false
        }

    }

    // Warmup 1 sumDouble
    public int sumDouble(int a, int b) {
        if (a != b) {  // If a or b is not equal to each other
            return a + b;
        }
        if (a == b) { // If they are equal
            return (a + b) * 2; // double up
        }
        return a + b;
    }

    // Warmup 2 stringTimes
    public String stringTimes(String str, int n) {
        String results = ""; // Setting up a place to put a string
        for (int i = 0; i < n; i++) { // Loop n amount of times the string results.
            results = results + str; //setting results to be what we passed in as str
        }
        return results; //returning that.
    }

    // Warmup 1 parrotTrouble
    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
        // This one threw me for a loop i was trying to do it such a complicated way.
        // I was trying if statements not think i could just shoot it in my return.
    }

    // Warmup 1 makes10
    public boolean makes10(int a, int b) {
        int sum = a+b;
        return ( a == 10 || b == 10 || sum == 10);
    } // this one was fun and worked exactly as I thought.

    // String 1 helloName
    public String helloName(String name) {
        return ("Hello " + name + "!");
    } // Easy peezy

    // String 1 makeAbba
    public String makeAbba(String a, String b) {
        return (a + b + b + a);

    }

}

