package BasicGenerics;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void reversePair()
    {
        T temp = this.first;
        this.first = this.second;
        this.second = temp;
    }

    public void printPair()
    {
        System.out.println(
                "Pair: " + this.first.toString() + " / " + this.second.toString()
        );
    }
}
