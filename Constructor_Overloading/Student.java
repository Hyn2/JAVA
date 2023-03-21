package Constructor_Overloading;

import java.time.LocalDate;

public class Student {
    private String name;
    private int birthYear;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear >= 1900) {
            this.birthYear = birthYear;
            return;
        } else {
            System.out.println("다시 입력하세요.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        LocalDate d = LocalDate.now();
        // static method는 객체 생성 x
        int year = d.getYear();
        return (year - birthYear);
    }
}