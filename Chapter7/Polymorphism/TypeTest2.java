package Chapter7.Polymorphism;

class A {
    A() {    }
}

class B extends A {
    B() {    }
}

public class TypeTest2 {
    public static void main(String[] args) {
        A a = new B(); // 부모 클래스의 참조 변수는 자식 클래스의 객체를 참조할 수 있다.
    }

}
