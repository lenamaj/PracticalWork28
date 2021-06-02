package com.alfa.task13;

import java.util.Arrays;

public class Runner {

    public void run() {
        MyMixer<Integer> mixer = new MyMixer<>(new Integer[]{1, 2, 3, 4, 5});
        mixer.shuffle();
        Integer[] arrayInt = mixer.getArray();
        System.out.println(Arrays.toString(arrayInt));

        System.out.println();

        MyMixer <String> myMixer = new MyMixer<>(new String[]{"assas", "ygfcbbn", "testfcbb", "texx"});
        myMixer.shuffle();
        String [] str = myMixer.getArray();
        System.out.println(Arrays.toString(str));

    }
}
