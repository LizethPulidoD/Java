package com.epam.rd.autocode.iterator;

import java.util.ArrayList;
import java.util.Iterator;


class Iterators {

    public static Iterator<Integer> intArrayTwoTimesIterator(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int position : array) {
            for (int j = 0; j < 2; j++) {
                arrayList.add(position);
            }
        }
        return arrayList.iterator();
    }

    public static Iterator<Integer> intArrayThreeTimesIterator(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int position : array) {
            for (int j = 0; j < 3; j++) {
                arrayList.add(position);
            }
        }
        return arrayList.iterator();
    }

    public static Iterator<Integer> intArrayFiveTimesIterator(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int position : array) {
            for (int j = 0; j < 5; j++) {
                arrayList.add(position);
            }
        }
        return arrayList.iterator();
    }

    public static Iterable<String> table(String[] columns, int[] rows) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String column : columns) {
            for (int row : rows) {
                arrayList.add(column+row);
            }
        }
        return arrayList;
    }


}
