package MultipleGenerics;

public class Pair<T, E> {
    private final T first;
    private final E second;

    public Pair(T first, E second) {
        this.first = first;
        this.second = second;
    }

    public void printPair()
    {
        System.out.println(
                "Pair: " + this.first.toString() + " / " + this.second.toString()
        );
    }
}
