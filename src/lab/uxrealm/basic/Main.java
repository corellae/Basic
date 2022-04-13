package lab.uxrealm.basic;

import org.joda.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is a TEST");
        System.out.println("Testing Java...");
        System.out.println("Testing Gradle...");
        System.out.println("Testing Jenkins pipeline...");
        System.out.println("Testing Nexus...");

        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
    }
}
