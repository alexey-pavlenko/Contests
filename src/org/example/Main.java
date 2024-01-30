package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        int numberOfBooks = input.nextInt();
        int[] height = new int[numberOfBooks];
        for (int i = 0; i < numberOfBooks; i++) {
            height[i]=input.nextInt();
        }

        //  int numberOfBooks = 10;
        // int[] height = {3, 5, 5, 5, 5, 6, 10, 13, 13, 13};
        int[] res = new int[height.length];
        if (height.length < height[height.length - 1]) {
            res = new int[height[height.length - 1]];
        }

        for (int i = 0; i < numberOfBooks; i++) {
            if (i + 1 < height.length && height[i] == height[i + 1]) {
                res[height[i] - 1]++;
            } else {
                res[height[i] - 1]++;
            }
        }

        System.out.println(Arrays.toString(res));
        res = Arrays.stream(res).sorted().toArray();

        System.out.println(Arrays.toString(res));

    }


}

