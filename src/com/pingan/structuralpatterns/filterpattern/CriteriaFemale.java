package com.pingan.structuralpatterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCrieria(List<Person> persons) {
        List<Person>res=new ArrayList<>();
        for(Person person:persons)
        {
            if(person.getGender().equalsIgnoreCase("female"))
            {
                res.add(person);
            }
        }
        return res;
    }
}
