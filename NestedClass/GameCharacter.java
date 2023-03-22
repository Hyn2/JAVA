package NestedClass;

import java.util.ArrayList;

public class GameCharacter {
    // 내부 클래스
    private class GameItem {

        String name;
        int type;
        int price;

        // price 변수 값 얻기
        public int getPrice() {
            return price;
        }

        //toString 메서드 오버라이딩, 리턴값 출력
        @Override
        public String toString() {
            return "GameItem [name = " + name + " ,type = " + type + ", price = " + price + "]";
        }

    }

    private ArrayList <GameItem> list = new ArrayList<>();

    // ArrayList에 아이템 추가
    void add(String name, int type, int price) {
        GameItem item = new GameItem();
        item.name = name;
        item.price = price;
        item.type = type;
        list.add(item);
    }

    // 출력
    void print() {
        int total = 0;
        // for each문, list 값을 item에 전달
        for(GameItem item : list) {
            System.out.println(item);
            total += item.getPrice();
        }
        // 총 금액
        System.out.println(total);
    }
}
