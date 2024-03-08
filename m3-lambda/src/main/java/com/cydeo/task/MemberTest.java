package com.cydeo.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {


        Person p1 = new Person("Mike",35,Gender.MALE);
        Person p2 = new Person("Tom",35,Gender.MALE);
        Person p3 = new Person("Mila",35,Gender.FEMALE);
        Person p4 = new Person("allya",35,Gender.FEMALE);

        List<Person> personList = Arrays.asList(p1,p2,p3,p4);

        CheckMembers checkMembers = p -> p.getGender()==Gender.MALE && p.getAge() >= 18 && p.getAge()<=25;
        print(personList,checkMembers);

    }

    private static void print (List<Person> personList,CheckMembers checkMembers){
        List<Person> result = new ArrayList<>();
        for (Person person : personList){
            if (checkMembers.test(person)){
    result.add(person);
            }
        }
        System.out.println(result);
    }


}
