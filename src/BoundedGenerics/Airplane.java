package BoundedGenerics;

public class Airplane implements Transport{
    @Override
    public void transportTo(String location) {
        System.out.println("Flying to " + location + "...");
    }
}
