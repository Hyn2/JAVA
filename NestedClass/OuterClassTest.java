package NestedClass;

public class OuterClassTest {
    public static void main(String[] args) {
        OuterClass outer =  new OuterClass();

        // 외부 클래스의 바깥에서 내부 클래스를 생성할 때는 외부클래스의 객체가 먼저 생성되어야 함
        OuterClass.InnerClass inner = outer.new InnerClass();
    }
}
