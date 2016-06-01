package com;

import org.junit.Test;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class LamdaTest {


    private IssueTransformer issueTransformer = new IssueTransformer();

    @Test
    public void testTransform() throws Exception {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("ham.xml");
        issueTransformer.transform(inputStream);

    }

    @Test
    public void testMethodReference() throws Exception {
        String[] strings = {"Michelle", "Gavin"};
        Arrays.sort(strings, String::compareToIgnoreCase);
    }


    @Test
    public void testStatefulTransformation() throws Exception {
        Stream<String> words = Stream.of("row", "row", "row", "your", "boat");
        words.sorted(Comparator.comparing(String::length).reversed());
    }
}