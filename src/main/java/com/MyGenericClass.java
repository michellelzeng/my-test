package com;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by michelle on 3/08/2016.
 */
public class MyGenericClass<T> {
    private static Person result;
    private List<Person> persons;

    public void add(T t) {
        remove(new Person());
    }

    public <E extends Person> void remove(E e) {

    }

    public void test() {
        List<?> list = new ArrayList<Student>();
    }

    public static <E> MyGenericClass<E> createMyGenericClass() {
        return new MyGenericClass<E>();
    }

    public static <E> E pick(E a1, E a2){
        return a2;
    }

    public static void testCallingStaticMethod() {
        MyGenericClass.<Person>createMyGenericClass();
        Serializable restult = MyGenericClass.pick("", new ArrayList<String>());

        Object result = MyGenericClass.pick(new Person(), new Car());

    }
}
