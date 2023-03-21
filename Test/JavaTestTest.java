package Test;
public class JavaTestTest {
    public static void main(String[]args) {
        JavaTest t1 = new JavaTest();
        t1.setName("HGD");
        System.out.println(t1.getName());
        String str = new String("Hello world");
        char c = str.charAt(4);
        System.out.println(c);
        String str1 = "동해물과 백두산이";
        System.out.println(str1);
        String str2 = "동해물과 백두산이";
        boolean r = str1 == str2;
        // java의 optimization으로 인해 리터럴이 같은 것은 같은 주소 값을 할당함.
        System.out.println(r); //true;
        String str3 = new String("동해물과 백두산이");
        // new 연산자로 새 객체를 생성하라고 했기에 리터럴이 같아도 새 객체를 생성해서 다른 주소값을 가진다.
        r = str1 == str3; //false
        System.out.println(r);

        r = str3.equals(str1); // 문자열을 비교
        System.out.println(r);

        str1 = new String("i love you");
        str2 = new String("I Love You");

        r = str1.equals(str2);
        System.out.println(r); // false
        r = str1.equalsIgnoreCase(str2);
        System.out.println(r); // true

        // 외부에 나올 method만 public으로 공개한다.
        // member variable도 숨겨야 함
        // String 객체는 immutable == String 객체의 값은 변경할 수 없다.

        String s = "1234";
        Integer.parseInt(s);

        Double.parseDouble(s);

        Float.parseFloat(s);

        Long.parseLong(s);
    }
}