package CallByValue;

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
    /*
     * 인자로 주어지는 Box 객체와 동일한 너비와 높이를 가지는 Box인지 체크하는 메소드
     * 같으면 True, 다르면 false를 반환
     */

     public boolean isSameBox(Box box) {
        /*
         * 나의 width, length, height가 인자로 주어진 box의 그것과 모두 같으면 true를 반환, 
         * 그렇지 않으면 false를 반환
         */
        if(this.width == box.width && length == box.length && height == box.height) {
             return true;
        }
        return false;
     }
}
