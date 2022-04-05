package com.ostrovsky;

import java.util.*;

public class StreamMain {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = intList.stream()
                .filter(i -> i > 0)
                .filter(i -> i % 2 == 0)
                .sorted()
                .toList();

        System.out.println(result);
    }
}
