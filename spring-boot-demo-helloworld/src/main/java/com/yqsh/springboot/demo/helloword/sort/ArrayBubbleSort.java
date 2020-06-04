package com.yqsh.springboot.demo.helloword.sort;

/**
 * 冒泡排序
 */
public class ArrayBubbleSort {

    private long[] a;
    private int nElems;

    ArrayBubbleSort(int maxValue) {
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

    public void bubbleSort() {
        int out,in;
        for(out = nElems - 1;out > 1;out--) { //选择排序的外循环
            for(in = 0;in < nElems - 1;in++) {
                if(a[in] > a[in + 1]) {
                    swap(in,in + 1);
                }
            }
            display();
        }
    }

    public void swap(int one,int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public static void main(String[] args) {
        int maxSize = 15;
        ArrayBubbleSort arr;
        arr = new ArrayBubbleSort(maxSize);

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

        arr.bubbleSort();

        arr.display();
    }

}
