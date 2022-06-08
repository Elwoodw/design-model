package com.pingan.structuralpatterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));


        Criteria male=new CriteriaMale();
        Criteria female=new CriteriaFemale();
        Criteria single=new CriteriaSingle();
        Criteria singleMale=new AndCriteria(single,male);
        Criteria singleOrFemale=new OrCriteria(single,female);

        System.out.println("Males: ");
        printPersons(male.meetCrieria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCrieria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCrieria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCrieria(persons));

    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
