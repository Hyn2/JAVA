package Chapter5.Method;
public class MathTest {
    public static void main(String[] args) {
        int sum;
        Math obj = new Math(); //객체 생성 주소값 저장 
        sum = obj.add(3, 5);
        System.out.println("3 +5 = "+ sum);    
        sum = obj.add(10, 11);
        System.out.println("10 +11 = "+ sum);
    }
}