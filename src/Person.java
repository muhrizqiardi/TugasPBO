import java.util.Calendar;

public class Person {
  private String name;
  private String address;
  private String profession;
  private String hobby;
  private int birthYear;
  private int birthMonth;
  private int birthDay;


  public Person(String name, String address, String profession, String hobby, int birthYear, int birthMonth,
      int birthDay) {
    this.name = name;
    this.address = address;
    this.profession = profession;
    this.hobby = hobby;
    this.birthYear = birthYear;
    this.birthMonth = birthMonth;
    this.birthDay = birthDay;
  }

  public void greeting() {
    System.out.printf("Hi, I'm %s. ", name);
    System.out.printf("I live at %s. ", address);
    System.out.printf("I am a %s. ", profession);
    System.out.printf("My hobby is %s. ", hobby);
    System.out.printf("I was born at %d/%d/%d\n", birthDay, birthMonth, birthYear);
  }

  public void getAge() {
    System.out.printf("I'm %d years old.\n", Calendar.getInstance().get(Calendar.YEAR) - birthYear);
  }
}
