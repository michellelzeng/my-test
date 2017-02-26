package com;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class OptionalTest {


    private IssueTransformer issueTransformer = new IssueTransformer();

    @Test
    public void testOptional() throws Exception {
        Optional<String> nameOptional = Optional.empty();
        assertNull(Optional.empty().get());

        Optional<String> testOptional = Optional.of("test");
        Optional<Integer> intOptional = testOptional.map(String::length);

        Person person = new Person();
        Optional<Person> optPerson = Optional.of(person);

//        String name = optPerson.flatMap(Person::getCar)
//                            .flatMap(Car::getInsurance)
//                            .map(Insurance::getName)
//                            .orElse("unKnown");

        List<Person> persons = new ArrayList<Person>();

        Collections.sort(persons);

        Comparator<Person> comparator = new TitleComparator();
        Collections.sort(persons, comparator);


        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person());
        Student e = new Student();
        personList.add(e);
        takePersons(personList);

        List<Student> students = new ArrayList<Student>();
//        takePersons(students);

    }

    @Test
    public void testPolimorphismWithGenerics() throws Exception {
//        List<Person> list = new ArrayList<Person>();
////        List<Person> list1 = new ArrayList<Student>();
//        Person[] array1 = new Person[1];
//        Person[] array2 = new Student[1];
//
        Student[] students = new Student[10];
        takePersons(students);

//        Optional<Person>.of(new Person());


    }

    private void takePersons(Person[] persons) {
        persons[1] = new Teacher();

    }

    private void takePersons(List<Person> persons) {

    }

    private class TitleComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getTitle().compareTo(p2.getTitle());
        }
    }

    @Test
    public void testGenericMethod() throws Exception {
        Map<String, ? extends Person> map = ImmutableMap.<String, Person>of("key1", new Student());

    }

}