package com.olegmng;

import java.util.Arrays;

public class Start {
    public static void run(){
        AverageInTwoLists averageInTwoLists = new AverageInTwoLists
                (Arrays.asList(5, -4, 15, 8, 31, 69),
                        Arrays.asList(5, -4, 25, 8, 31, 69));
        averageInTwoLists.printAllAverageValue();
        averageInTwoLists.compareTwoLists();

    }
}
