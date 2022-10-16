package BoundedGenerics;

import java.util.Date;

public class TransportManager<T extends Transport> {
    private final T transport;

    public TransportManager(T transport) {
        this.transport = transport;
    }

    public T getTransport()
    {
        return this.transport;
    }

    public void beginTransport(String location)
    {
        Date date = new Date();
        System.out.println("Transport begins: " + date);

        this.transport.transportTo(location);

        date = new Date();
        System.out.println("Transport ended: " + date);
    }
}
