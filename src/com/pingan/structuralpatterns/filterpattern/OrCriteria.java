package com.pingan.structuralpatterns.filterpattern;

import java.util.List;

public class OrCriteria implements  Criteria{
    private  Criteria criteria;
    private  Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCrieria(List<Person> persons) {
        List<Person>res1=criteria.meetCrieria(persons);
        List<Person>res2=criteria.meetCrieria(persons);
        for(Person person :res2)
        {
            if(!res1.contains(person))
            {
                res1.add(person);
            }
        }
        return res1;
    }
}
