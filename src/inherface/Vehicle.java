package inherface;

public interface Vehicle {
    int MAX_SPEED=120;

    void start();


    default void displayMaxSpeed() {
        System.out.println("The maximum speed is " + MAX_SPEED + " km/h.");
    }



    static void service() {
        System.out.println("Vehicle needs servicing.");
    }



    private void log(String message) {
        System.out.println("Log: " + message);
    }



    // Default method using private method
    default void checkEngine() {
        log("Checking engine...");
        System.out.println("Engine is fine.");
    }
}
