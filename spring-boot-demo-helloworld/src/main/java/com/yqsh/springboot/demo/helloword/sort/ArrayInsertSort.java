package com.yqsh.springboot.demo.helloword.sort;

import java.time.Clock;

/**
 * 插入排序
 */
public class ArrayInsertSort {

    private long[] a;
    private int nElems;

    ArrayInsertSort(int maxValue) {
        a = new long[maxValue];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for(int i = 0;i < nElems;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void insertSort() {
        int out,in,temp;
        for(out = 0;out < nElems - 1;out++) { //选择排序的外循环
            temp = out + 1;
            long flagValue = a[temp];
            for(in = temp;in > 0;in--) {
                if(flagValue < a[in - 1]) {
                    a[in] = a[in - 1];
                } else {
                    break;
                }
            }
            a[in] = flagValue;
        }
    }

    public static void main(String[] args) {
        int maxSize = 15;
        ArrayInsertSort arr;
        arr = new ArrayInsertSort(maxSize);

        //insert data
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);
        arr.insert(45);
        arr.insert(36);
        arr.insert(78);
        arr.insert(23);
        arr.insert(90);

        arr.display();
        long begin = Clock.systemDefaultZone().millis();
        System.out.println("begin : " + begin);
        arr.insertSort();
        long e = Clock.systemDefaultZone().millis();
        System.out.println("e : " + e);
        System.out.println("diff : " + (e - begin));
        arr.display();
    }

}
