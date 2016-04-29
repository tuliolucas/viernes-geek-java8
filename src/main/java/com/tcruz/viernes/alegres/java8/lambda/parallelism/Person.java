package com.tcruz.viernes.alegres.java8.lambda.parallelism;
 
import java.util.List;
import java.util.ArrayList;
import java.time.chrono.IsoChronology;
import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String emailAddress;

    public Person(String nameArg, LocalDate birthdayArg,
        Sex genderArg, String emailArg) {
        name = nameArg;
        birthday = birthdayArg;
        gender = genderArg;
        emailAddress = emailArg;
    }  

    public int getAge() {
        return birthday
            .until(IsoChronology.INSTANCE.dateNow())
            .getYears();
    }

    public void printPerson() {
      System.out.println(name + ", " + this.getAge());
    }
    
    public Sex getGender() {
        return gender;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
    
    public LocalDate getBirthday() {
        return birthday;
    }
    
    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static List<Person> createBravoZulu() {
        
        List<Person> roster = new ArrayList<>();
        roster.add(
            new Person(
            "Túlio",
            IsoChronology.INSTANCE.date(1983, 5, 3),
            Sex.MALE,
            "tcruz@example.com"));
        roster.add(
            new Person(
            "Diogo",
            IsoChronology.INSTANCE.date(1985, 7, 15),
            Sex.MALE, "diogo@example.com"));
        roster.add(
            new Person(
            "João",
            IsoChronology.INSTANCE.date(1991, 8, 13),
            Sex.MALE, "joao@example.com"));
        roster.add(
            new Person(
            "Megale",
            IsoChronology.INSTANCE.date(1980, 9, 12),
            Sex.MALE, "bob@example.com"));
        roster.add(
            new Person(
            "Ana",
            IsoChronology.INSTANCE.date(1988, 9, 12),
            Sex.FEMALE, "ana@example.com"));
        roster.add(
            new Person(
            "José",
            IsoChronology.INSTANCE.date(1988, 9, 12),
            Sex.MALE, "jose@example.com"));
        roster.add(
            new Person(
            "Ramon",
            IsoChronology.INSTANCE.date(2000, 9, 12),
            Sex.MALE, "ramon@example.com"));
        roster.add(
            new Person(
            "LF",
            IsoChronology.INSTANCE.date(2001, 9, 12),
            Sex.MALE, "lf@example.com"));
        roster.add(
            new Person(
            "Caio",
            IsoChronology.INSTANCE.date(1981, 9, 12),
            Sex.MALE, "caio@example.com"));

        return roster;
    }
    
}
