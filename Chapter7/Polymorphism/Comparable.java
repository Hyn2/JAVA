package Chapter7.Polymorphism;

abstract public class Comparable {
    // 내가 더 크면 1, anotherVal과 같으면 0, 내가 더 작으면 -1
    public abstract int compareTo(Comparable anotherVal);
}
