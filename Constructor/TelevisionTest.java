package Constructor;

public class TelevisionTest {
    public static void main(String[] args) {
        // Television 객체 생성
        Television tv = new Television(10, 3, true);

        // 현재 상태를 출력하는 print 메서드 실행
        tv.print();
    }
}