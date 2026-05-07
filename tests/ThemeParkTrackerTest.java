import static org.junit.jupiter.api.Assertions.*;

class ThemeParkTrackerTest {

    @org.junit.jupiter.api.Test
    void addRide() {
        ThemeParkTracker tracker = new ThemeParkTracker();
        Ride ride = new Ride("Skibidi Coaster", 20, 67, "open");
        tracker.addRide(
                ride
        );
        assertEquals(ride, tracker.getRide(0));
    }

    @org.junit.jupiter.api.Test
    void getRide() {
        ThemeParkTracker tracker = new ThemeParkTracker();
        Ride ride1 = new Ride("Skibidi Coaster", 20, 67, "open");
        Ride ride2 = new Ride("James", 90, 4, "open");
        Ride ride3 = new Ride("Emerson Montoya Coaster", 90, 1, "closed");
        tracker.addRide(ride1);
        tracker.addRide(ride2);
        tracker.addRide(ride3);
        assertEquals(ride1, tracker.getRide(0));
        assertEquals(ride2, tracker.getRide(1));
        assertEquals(ride3, tracker.getRide(2));
    }

    @org.junit.jupiter.api.Test
    void removeClosedRides() {
        ThemeParkTracker tracker = new ThemeParkTracker();
        Ride ride1 = new Ride("Skibidi Coaster", 20, 67, "open");
        Ride ride2 = new Ride("Emerson Montoya Coaster", 90, 1, "closed");
        Ride ride3 = new Ride("James", 90, 4, "open");
        Ride ride4 = new Ride("Jonathon Brawl Stars", 90, 1, "closed");
        tracker.addRide(ride1);
        tracker.addRide(ride2);
        tracker.addRide(ride3);
        tracker.addRide(ride4);
        tracker.removeClosedRides();
        assertEquals(ride1, tracker.getRide(0));
        assertEquals(ride3, tracker.getRide(1));
    }

    @org.junit.jupiter.api.Test
    void printRide() {
        ThemeParkTracker tracker = new ThemeParkTracker();
        Ride ride1 = new Ride("Skibidi Coaster", 20, 67, "open");
        Ride ride2 = new Ride("Emerson Montoya Coaster", 90, 1, "closed");
        Ride ride3 = new Ride("James", 90, 4, "open");
        Ride ride4 = new Ride("Jonathon Brawl Stars", 90, 1, "closed");
        tracker.addRide(ride1);
        tracker.addRide(ride2);
        tracker.addRide(ride3);
        tracker.addRide(ride4);
        tracker.printRide("James");
    }

    @org.junit.jupiter.api.Test
    void removeRide() {
        ThemeParkTracker tracker = new ThemeParkTracker();
        Ride ride1 = new Ride("Skibidi Coaster", 20, 67, "open");
        Ride ride2 = new Ride("Emerson Montoya Coaster", 90, 1, "closed");
        Ride ride3 = new Ride("James", 90, 4, "open");
        Ride ride4 = new Ride("Jonathon Brawl Stars", 90, 1, "closed");
        tracker.addRide(ride1);
        tracker.addRide(ride2);
        tracker.addRide(ride3);
        tracker.addRide(ride4);
        tracker.removeRide(2);
        assertEquals(ride4, tracker.getRide(2));
    }

    @org.junit.jupiter.api.Test
    void printAllRides() {
        ThemeParkTracker tracker = new ThemeParkTracker();
        Ride ride1 = new Ride("Skibidi Coaster", 20, 67, "open");
        Ride ride2 = new Ride("Emerson Montoya Coaster", 90, 1, "closed");
        Ride ride3 = new Ride("James", 90, 4, "open");
        Ride ride4 = new Ride("Jonathon Brawl Stars", 90, 1, "closed");
        tracker.addRide(ride1);
        tracker.addRide(ride2);
        tracker.addRide(ride3);
        tracker.addRide(ride4);
        tracker.printAllRides();
    }

    @org.junit.jupiter.api.Test
    void sortByWaitTime() {
        ThemeParkTracker tracker = new ThemeParkTracker();
        Ride ride1 = new Ride("Skibidi Coaster", 20, 67, "open");
        Ride ride2 = new Ride("Emerson Montoya Coaster", 90, 1, "closed");
        Ride ride3 = new Ride("James", 80, 4, "open");
        Ride ride4 = new Ride("Jonathon Brawl Stars", 85, 1, "closed");
        tracker.addRide(ride1);
        tracker.addRide(ride2);
        tracker.addRide(ride3);
        tracker.addRide(ride4);
        tracker.sortByWaitTime();
        assertEquals(ride1, tracker.getRide(0));
        assertEquals(ride3, tracker.getRide(1));
        assertEquals(ride4, tracker.getRide(2));
        assertEquals(ride2, tracker.getRide(3));
    }

    @org.junit.jupiter.api.Test
    void findRideStatus() {
        ThemeParkTracker tracker = new ThemeParkTracker();
        Ride ride1 = new Ride("Skibidi Coaster", 20, 67, "open");
        Ride ride2 = new Ride("Emerson Montoya Coaster", 90, 1, "closed");
        Ride ride3 = new Ride("James", 80, 4, "open");
        Ride ride4 = new Ride("Jonathon Brawl Stars", 85, 1, "closed");
        tracker.addRide(ride1);
        tracker.addRide(ride2);
        tracker.addRide(ride3);
        tracker.addRide(ride4);

        assertEquals("open", tracker.findRideStatus("Skibidi Coaster"));
        assertEquals("closed", tracker.findRideStatus("Emerson Montoya Coaster"));
        assertEquals("open", tracker.findRideStatus("James"));
        assertEquals("closed", tracker.findRideStatus("Jonathon Brawl Stars"));
    }
}