package com.olegmng;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageInTwoListsTest {
    private static AverageInTwoLists averageInTwoLists;


    @Test
    public void checkFindAverage() {
        double res = 0;
        double res_ = -10;
        averageInTwoLists = new AverageInTwoLists(Arrays.asList(0, 0, 0, 0, 0),
                Arrays.asList(-10, -10, -10));

        double dTest = averageInTwoLists.findAverage(averageInTwoLists.getList1());
        double dTest_ = averageInTwoLists.findAverage(averageInTwoLists.getList2());

        assertEquals(res, dTest);
        assertEquals(res_, dTest_);

    }

    @Test
    public void checkCompareFirstListLarger() {

        double dTest = averageInTwoLists.findAverage(averageInTwoLists.getList1());
        double dTest_ = averageInTwoLists.findAverage(averageInTwoLists.getList2());

        averageInTwoLists.compareTwoLists();
        assert (dTest > dTest_);

        averageInTwoLists.printAllAverageValue();

    }

    @Test
    public void checkCompareSecondListLarger() {

        averageInTwoLists = new AverageInTwoLists(Arrays.asList(0, 0, 0, 0, 0),
                Arrays.asList(10, 10, 10));

        double dTest = averageInTwoLists.findAverage(averageInTwoLists.getList1());
        double dTest_ = averageInTwoLists.findAverage(averageInTwoLists.getList2());

        averageInTwoLists.compareTwoLists();
        assert (dTest < dTest_);

    }

    @Test
    public void checkCompareEqualLists() {
        double res = 10;
        double res_ = 10;
        averageInTwoLists = new AverageInTwoLists(Arrays.asList(10, 10, 10, 10, 10),
                Arrays.asList(10, 10, 10));

        double dTest = averageInTwoLists.findAverage(averageInTwoLists.getList1());
        double dTest_ = averageInTwoLists.findAverage(averageInTwoLists.getList2());

        averageInTwoLists.compareTwoLists();
        assert (dTest == dTest_);

    }
    
}