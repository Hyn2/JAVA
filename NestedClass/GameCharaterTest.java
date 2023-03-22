package NestedClass;

public class GameCharaterTest {
    public static void main(String[] args) {
        GameCharacter c = new GameCharacter();
        c.add("sword", 1, 1000);
        c.add("Gun", 2, 3000);
        c.print();
    }
}
