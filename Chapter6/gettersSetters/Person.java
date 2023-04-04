package Chapter6.gettersSetters;
import java.util.Scanner;

public class Person {
    // member variable은 특별한 이유가 없는 한 private로 만들어라.
    // 그 member variable을 클래스 외부에서 접근해야한다면 그를 위한 method를 public으로 구현해라
    // 예를 들어, myAge 라는 member variable에 값을 설정해야 하는 메소드는 
    // setAge로 , myAge라는 member variable의 값을 읽어오는 메소드는 getAge로 
    // public 접근제어지정자를 명시하여 구현하면 된다.
    // 이렇게 함으로써 member variable에 잘못된 값이 설정되는 것을 막을 수도 있으며,
    // 향후에 그 클래스를 버전업 하면서 member variable의 이름을 변경해도
    // 그 클래스를 사용하는 외부 클래스에는 아무 영향을 미치지 않게 된다.

    // 접근제어지정자(Access Modifier)
    // : public, protected, default, private
    // 1. public    : public이 명시된 member는 해당 클래스 내부, 외부, 어느 곳에서든 접근이 가능하다.
    // 2. protected : protected가 명시 된 member는 그 클래스 내부, 자식, 같은 패키지에 속한 다른 클래스에서도 접근이 가능하다.
    // 3. default   : 접근제어지정자가 명시되지 않은 경우를 뜻함, 해당 지정자가 명시된 member의 경우, 그 클래스 내부 및 같은 패키지에 속한 다른 클래스에서도 접근 가능하다.
    // 4. private   : 해당 클래스 제외 접근이 불가능하다.

    /* 멤버 변수를 private로 설정하는 이유
    1. 잘못된 값을 설정하는 것을 막아줄 필요가 있다.
    2. 읽기전용 멤버변수로 만들 수 있다.
    3. 클래스 소스코드를 업그레이드 할 경우. 그 클래스를 사용하는 다른 코드에 미치는 영향을 최소화할 수 있다.

    */ 

    // 변수 선언
    private String myName;
    private int myAge;
    private String dept;
    Scanner scn = new Scanner(System.in);

    //setVariables
    public void setMyAge(int age) {
        myAge = age;
        if (age >= 0 && age <= 150) {
            // this.age는 클래스 내부 멤버 변수를 의미함   
            this.myAge = age;
        } else {
            System.out.println("나이의 범위는 0부터 150까지 입니다.");
        }
    }

    // getVariables
    public String getName() {
        return myName;
    }



    public int getMyAge() {
        return myAge;
    }

    public String getMyDept() {
        return dept;
    }
}
