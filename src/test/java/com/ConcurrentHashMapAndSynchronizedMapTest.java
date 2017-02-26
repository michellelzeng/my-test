package com;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by michelle on 2/06/2016.
 */
public class ConcurrentHashMapAndSynchronizedMapTest {

    @Test
    public void testPerformanceDifference() throws Exception {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
//        Map<String, Integer> synchronizedMap =

    }
}
