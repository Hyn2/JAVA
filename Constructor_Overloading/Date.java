package Constructor_Overloading;

public class Date {
    private int year, day;
    private String month;

    Date(int y, String m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }   

    Date(int y) {
        this.year = y;
        this.month = "1월";
        this.day = 1;
    }

    Date() {
        this.year = 1900;
        this.month = "1월";
        this.day = 1;
    }
    
    @Override // ??
    // hour = (h >= 0 && h  < 24) ? h : 0;
    public String toString() {
        return "Date [Year = " + year + ", Month = " + month + ", Day = " + day + ']';
    }
}
