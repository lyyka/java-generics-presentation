import BasicGenerics.Pair;
import BoundedGenerics.Airplane;
import BoundedGenerics.TransportManager;
import BoundedGenerics.Truck;

public class Main {
    public static void main(String[] args) {
        // BasicGenerics
        BasicGenerics.Pair<Integer> basicPair = new Pair<>(1, 2);
        basicPair.printPair();
        basicPair.reversePair();
        basicPair.printPair();

        // MultipleGenerics
        MultipleGenerics.Pair<String, Integer> multiplePair = new MultipleGenerics.Pair<>("Name", 24);
        multiplePair.printPair();

        // BoundedGenerics
        // Will not compile: TransportManager<Integer> ...
        TransportManager<Airplane> airplaneTransportManager = new TransportManager<>(new Airplane());
        TransportManager<Truck> truckTransportManager = new TransportManager<>(new Truck());
        airplaneTransportManager.beginTransport("Belgrade");
        truckTransportManager.beginTransport("Nis");
    }
}