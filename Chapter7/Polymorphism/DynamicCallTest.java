package Chapter7.Polymorphism;

class Animal {
    void sound() {
        System.out.println("안녕 난 동물이얌");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("냥냥");
    }
}

public class DynamicCallTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

       Animal obj = new Animal();

        // 부모 객체의 sound()
       obj = animal;
       obj.sound();

       //dog 객체의 sound()
       obj = dog;
       obj.sound();

       //cat 부모 객체의 sound()
       obj = cat;
       obj.sound();
    }
}
