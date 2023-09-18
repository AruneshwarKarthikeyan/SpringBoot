package com.array;

public class dynamicArrayMethods {

    static int size,initialCapacity, capacity, arr[];

    dynamicArrayMethods(){
        initialCapacity = 3;
        capacity = initialCapacity;
        size = 0;
        arr = new int[capacity];
    }

    public void insert(int val){
        if(size >= capacity){
            expandArray();
        }
        arr[size] = val;
        size++;
    }

    public void display(){
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public void displaySpecificValue(int val){
        if (val <= size){
            System.out.println(arr[val]);
        } else {
            System.out.println("out of bounds");
        }
    }

    public static void expandArray(){
        capacity *= 2;
        arr = java.util.Arrays.copyOf(arr, capacity);
    }

}
