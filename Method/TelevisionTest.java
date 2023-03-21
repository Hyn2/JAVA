package Method;
public class TelevisionTest {
    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.setChannel(5); 
        int ch = myTv.getChannel(); //ch에 myTv.channel 값 저장
        myTv.volume = 10;
        myTv.onOff = true;
    System.out.print("현재 나의 채널은 " + ch + "입니다.");        
        Television yourTv = new Television();
        yourTv.channel = 3;
        yourTv.volume = 10;
        yourTv.onOff = true;
        myTv.setChannel(5);
        ch = yourTv.getChannel();
        System.out.print("현재 너의 채널은 " + ch + "입니다.");      
        // myTv, yourTv의 변수 값은 각각 다른 저장공간을 가짐   
    }
}

