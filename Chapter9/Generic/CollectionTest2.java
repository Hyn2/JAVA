package Chapter9.Generic;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionTest2 {
  public static void main(String[] args) {
    HashMap<String, Integer> nameAge = new HashMap<>();
    nameAge.put("asdf", 20); // 키와 값의 쌍으로 데이터를 저장 
    int age = nameAge.get("asdf"); // 키의 값으로 그에 대응되는 값을 인출
    System.out.println(age);

    HashMap<String, ArrayList<String>> teams = new HashMap<>();
    ArrayList<String> team1 = new ArrayList<>();
    team1.add("a");
    team1.add("b");
    team1.add("c");
    team1.add("d");
    teams.put("1조", team1);

    printTeamMembers("1조",teams);
  }

  public static void printTeamMembers(String teamName, HashMap<String, ArrayList<String>> teams) {
    ArrayList<String> members = teams.get(teamName);
    for(String member : members) {
      System.out.println(member);
    }
    System.out.println();
  }
}