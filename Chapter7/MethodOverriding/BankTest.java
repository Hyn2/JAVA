package Chapter7.MethodOverriding;

class Bank {
    double geteInterestRate() {
        return 0;
    }
}

class BadBank extends Bank {
    @Override
    double geteInterestRate() {
        return 10;
    }
}

class NormalBank extends Bank {
@Override
double geteInterestRate() {
    return 5;
}
}

class GoodBank extends Bank {
@Override
double geteInterestRate() {
    return 3;
}
}

public class BankTest {
    public static void main(String[] args) {
        GoodBank gb = new GoodBank();
        NormalBank nb = new NormalBank();
        BadBank bb = new BadBank();
        System.out.println("GoodBank : " + gb.geteInterestRate());
        System.out.println("NormalBank : " + nb.geteInterestRate());
        System.out.println("BadBank : " + bb.geteInterestRate());
    }
}
