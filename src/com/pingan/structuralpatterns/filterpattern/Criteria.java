package com.pingan.structuralpatterns.filterpattern;

import java.util.List;

public interface Criteria {
    List<Person>meetCrieria(List<Person>persons);
}
