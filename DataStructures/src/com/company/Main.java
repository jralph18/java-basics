package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {2, 6, 9, 1};
        System.out.println(sumArray(array));
        System.out.println(Arrays.toString(toPower(5, 3)));
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static int[] toPower(int size, int power){
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = (int) Math.pow(i, power);
        }
        return array;
    }
}
