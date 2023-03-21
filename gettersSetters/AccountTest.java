package gettersSetters;

public class AccountTest {
    public static void main(String[]args) {
        Account obj = new Account();
        obj.setName("Tom");
        obj.setBalance(100000);
        System.out.printf("이름은 %s, 통장 잔고는 %d 입니다,", obj.getName(), obj.getBalance());
    }
}
