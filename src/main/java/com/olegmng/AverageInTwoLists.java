package com.olegmng;

import java.util.List;

public class AverageInTwoLists {
    private List list1;
    private List list2;

    public AverageInTwoLists(List list1, List list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public double findAverage(List list) {

        return list.stream()
                .mapToInt(a -> (int) a)
                .average().orElse(0);

    }

    public void printAllAverageValue() {
        System.out.println("Список1 (ср. ариф): " + findAverage(list1));
        System.out.println("Список2 (ср. ариф): " + findAverage(list2));

    }

    public void compareTwoLists() {
        double d1 = findAverage(list1);
        double d2 = findAverage(list2);

        if (d1 > d2) System.out.println("Первый список имеет большее среднее значение");
        else if (d1 < d2) System.out.println("Второй список имеет большее среднее значение");
        else System.out.println("Средние значения равны");

    }

    public List getList1() {
        return list1;
    }

    public List getList2() {
        return list2;
    }
}
