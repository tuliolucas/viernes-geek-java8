package com.tcruz.viernes.alegres.java8.lambda.parallelism;/*
 * Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 
 
import java.util.List;
import java.util.ArrayList;
import java.time.chrono.IsoChronology;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;

public class Person {
  
    public enum Sex {
        MALE, FEMALE
    }
  
    String name; 
    LocalDate birthday;
    Sex gender;
    String emailAddress;
  
    Person(String nameArg, LocalDate birthdayArg,
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

    public static List<Person> createRoster() {
        
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
