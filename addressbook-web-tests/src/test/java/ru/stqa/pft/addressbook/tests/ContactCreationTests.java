package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoAddContactPage();
    app.fillContactForm(new ContactData("Petr", "Ivanov", "Petya", "88888888888", "PetrI@example.com"));
    app.submitContactCreation();
  }

}
