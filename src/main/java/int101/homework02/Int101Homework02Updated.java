package int101.homework02;

import work01.Utilitor;
import work02.Person;
import work03.Account;

public class Int101Homework02Updated {
    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();
    }



    static void work01Utilitor() {
        System.out.println("value(1.2) = " + Utilitor.testString("Hello"));
//        System.out.println("value(1.2) = " + Utilitor.testString(null));
//        System.out.println("value(1.2) = " + Utilitor.testString(""));
        System.out.println("value(1.3) = " + Utilitor.testPositive(2));
//        System.out.println("value(1.3) = " + Utilitor.testPositive(-2));
        System.out.println("Isbn = " + Utilitor.computeIsbn10(661305000));
    }



    static void work02Person() {
        Person person1 = new Person("Jane", "Yantip");
        Person person2 = new Person("Jane", "Yantip");

        System.out.println("Person1" + person1);
        System.out.println("Person2" + person2);

        person1.setFirstName("Ryu");
        person1.setLastName("Jitsumpat");

        System.out.println("Person1: " + person1);
        System.out.println("Person1 ID: " + person1.getId());
        System.out.println("Person1 Firstname: " + person1.getFirstName());
        System.out.println("Person1 Lastname: " + person1.getLastName());

        System.out.println("Person2: " + person2);
        System.out.println("Person2 ID: " + person2.getId());
        System.out.println("Person2 Firstname: " + person2.getFirstName());
        System.out.println("Person2 Lastname: " + person2.getLastName());

        System.out.println("Are person1 and person2 the same? " + person1.equals(person2));
    }



    static void work03Account() {
        Person person3 = new Person("Ing", "Kong");
        Person person4 = new Person("klai", "Kong");

        Account account1 = new Account(person3);
        Account account2 = new Account(person4);

        System.out.println(account1);
        System.out.println(account2);

        account1.deposit(5000);
        System.out.println("Account1 balance is : " + account1.getBalance());

        account1.withdraw(500);
        System.out.println("Account1 balance is: " + account1.getBalance());

        // Test transfer method
        account1.transfer(2250, account2);
        System.out.println("Account1 balance is: " + account1.getBalance());
        System.out.println("Account2 balance is: " + account2.getBalance());

        // Test equals method
        System.out.println("Are account1 and account2 the same? " + account1.equals(account2));
    }
}

