package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstName;
  private final String lastName;
  private final String nickname;
  private final String phoneNumber;
  private final String email;

  public ContactData(String firstName, String lastName, String nickname, String phoneNumber, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.nickname = nickname;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNickname() {
    return nickname;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getEmail() {
    return email;
  }
}
