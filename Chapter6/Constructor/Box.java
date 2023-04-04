package Chapter6.Constructor;

public class Box {
    private int width;
    private int length;
    private int height;
    private int volume;

    public int getVolume() {
        return volume;
    }

    Box(int w, int l, int h) {
        this.width = w;
        this.length = l;
        this.height = h;
        volume = width * height * length;
    }
}
