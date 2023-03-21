package CBV;

public class BoxTest {
    public static void main(String[] args) {
        // 객체 생성
        Box b1 = new Box(10, 20, 50);
        Box b2 = new Box(10, 30, 30);

        // .getVolume() 메서드는 부피 값을 반환
        System.out.println("첫 번째 박스의 부피: " + b1.getVolume());
        System.out.println("두 번째 박스의 부피: " + b2.getVolume());

        // .whoisLargerBox는 부피가 더 큰 객체의 주소값을 변수 'largerBox'에 저장
        Box largerBox = Box.whoisLargerBox(b1, b2);

        // largerBox에 저장된 객체의 부피값을 출력
        System.out.println("더 큰 박스의 부피: " + largerBox.getVolume());
    }
}
