package com.pingan.structuralpatterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCrieria(List<Person> persons) {
        List<Person>list=new ArrayList<>();
        for(Person person:persons)
        {
            if(person.getGender().equalsIgnoreCase("male"))
            {
                list.add(person);
            }
        }
        return list;
    }
}
