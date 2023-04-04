public class StringTest {
    public static void main(String[]args) {
        String proverb = "A barking dog";
        String s1, s2, s3, s4;
        System.out.println(proverb.length()); // 문자열 길이

        s1 = proverb.concat(" never bites!");
        System.out.println(s1);

        s2 = proverb.replace('b' , 'B');
        System.out.println(s2);

        s3 = proverb.substring(2, 4);
        System.out.println(s3);

        proverb = "afasdf";
        System.out.println(proverb);

        s4 = proverb.toUpperCase();
        System.out.println(s4);

        int x = 20;
        System.out.println("x == " + x);
        System.out.println("100" + x);
        System.out.println(100 + x);
    }   
}
