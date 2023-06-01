package Chapter9.Lambda;

import java.time.LocalDate;
import java.time.Period;

// https://docs.oracle.com/javase/tutorial/java/java00/lambda
public class Person {
  
  private String name;
  private LocalDate birthDate;
  private String emailAddress;
  private Sex gender;


  public Person(String name, LocalDate birthDate, String emailAddress, Sex gender) {
    this.name = name;
    this.birthDate = birthDate;
    this.emailAddress = emailAddress;
    this.gender = gender;
  }
  
  public String getName() {
    return name;
  }

  public LocalDate getbirthDate() {
    return birthDate;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public Sex getGender() {
    return gender;
  }

  public int getAge() {
    // Period p = Period.between(birthDate, LocalDate.now());
    // p.getYears();
    return Period.between(birthDate, LocalDate.now()).getYears();
  }

  public String printPers() {
    return String.format("Name: %s, Email: %s, Gender: %s, BirthDate: %s",
            name,
            emailAddress,
            gender.toString(),
            birthDate
            );
  }

}

enum Sex {
  FEMALE,
  MALE
}