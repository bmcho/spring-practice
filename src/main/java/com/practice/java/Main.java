package com.practice.java;

import com.practice.java.logic.BubbleSort;
import com.practice.java.logic.JavaSort;
import com.practice.java.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Sort<String> sort = new JavaSort<>();
        System.out.println("{result} " + sort.sort(Arrays.asList(args)));
    }
}
