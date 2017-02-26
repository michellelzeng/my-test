package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


/**
 * Created by michelle on 17/04/16.
 */
public class Person implements Comparable<Person> {

    private String name;

    private String title;

    private Optional<Car> car;

    public Optional<Car> getCar() {
        return car;
    }

    @Override
    public int compareTo(Person anotherPerson) {
        if (anotherPerson == null) return 1;
        return this.name.compareTo(anotherPerson.name);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void testAccessInnerClassFromOutside(){
//        Status status = new Status(1, 1);

//        of(1, 2);
        MyOuterClass myOuterClass = new MyOuterClass();
        MyOuterClass.Status status = myOuterClass.new Status(1, 1);

        double infinity = 1.0/0;

    }

}
