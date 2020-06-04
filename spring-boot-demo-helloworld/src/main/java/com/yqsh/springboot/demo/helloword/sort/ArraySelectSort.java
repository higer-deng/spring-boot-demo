package com.yqsh.springboot.demo.helloword.sort;

/**
 * 选择排序
 */
public class ArraySelectSort {

    private long[] a;
    private int nElems;

    ArraySelectSort(int maxValue) {
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

    public void selectionSort() {
        int out,in,min;
        for(out = 0;out < nElems;out++) { //选择排序的外循环
            min = out;
            for(in = out + 1;in < nElems;in++) {
                if(a[in] < a[min]) {
                    swap(out,in);
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
        int maxSize = 100;
        ArraySelectSort arr;
        arr = new ArraySelectSort(maxSize);

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

        arr.selectionSort();

        arr.display();

    }

}
