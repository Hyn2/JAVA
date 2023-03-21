package CBV;

public class Box {
    // 변수
    private int width, length, height;
    // 생성자
    public Box(int w, int len, int h) {
        width = w;
        length = len;
        height = h;
    }

    // 부피를 구하는 메서드
    public int getVolume() {
        return width * height * length;
    }

    // 더 큰 부피의 박스를 구하는 메서드, 매개변수로 객체를 가져오며 리턴값은 객체의 주소값
    // if문으로 박스의 부피를 비교 후, 더 큰 박스의 주소값을 리턴
    public static Box whoisLargerBox(Box box1, Box box2) {
        if(box1.getVolume() > box2.getVolume()) {
            return box1;
        }
        return box2;
    }

}
