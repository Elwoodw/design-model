package com.pingan.structuralpatterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCrieria(List<Person> persons) {
        List<Person>res=new ArrayList<>();
        for(Person person:persons)
        {
            if(person.getMaritalStatus().equalsIgnoreCase("single"))
            {
                res.add(person);
            }
        }
        return res;
    }
}
