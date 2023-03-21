package Constructor;

public class Television {
    private int channel;
    private int volume;
    private boolean onOff;

    Television(int channel, int volume, boolean onOff) {
        this.channel = channel;
        this.volume  = volume;
        this.onOff   = onOff;
    }

    
    
    void print() {
        String onOff;

        // this.onOff 값에 따라 String onOff 값 변경
        if(this.onOff == true) {
            onOff = "켜져있으며,";

        } else {
            onOff = "꺼져있으며,";
        }
        // 현재 상태 출력
        System.out.printf("현재 전원이 %s 채널은 %d, 볼륨은 %d 입니다.", onOff, this.channel, this.volume);
    }
}
