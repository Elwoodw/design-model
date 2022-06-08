package com.pingan.structuralpatterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCrieria(List<Person> persons) {
        List<Person>res=criteria.meetCrieria(persons);
        res=otherCriteria.meetCrieria(res);
        return res;
    }
}
