package Test;
public class JavaTest {
    // instance variable
    private String name;

    //instance method
    String getName() {
        return name;
    }

    // static method
    // 인스턴스로 선언하지 않아도 메인 메소드에서 호출 가능
    static void sayHello() {
        System.out.println("Hello World");
    }

    void setName(String name) {
        this.name = name;
    }
    //method overloading
    // 이름이 같은 메소드를 여러 개 정의 하는 것, 다만 각 메소드의 매개 변수가 달라야 함.
    int square(int num) {
        return num*num;
    }

    double square(double df) {
        return df*df;
    }

    public static void main(String[] args) {
        JavaTest tc = new JavaTest(); 
        int result = tc.square(3); //squareInt method argument = 3
        System.out.println(result); // will return 3 * 3
        double result2 = tc.square(3.14); //squareDouble method argument = 3.14
        System.out.println(result2); // will return 3.14 * 3.14
        System.out.println(result * result2); // double로 typeCasting
        sayHello();
    }
}
