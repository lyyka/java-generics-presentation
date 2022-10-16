package BoundedGenerics;

public class Truck implements Transport {
    @Override
    public void transportTo(String location) {
        System.out.println("Driving to " + location + "...");
    }
}
