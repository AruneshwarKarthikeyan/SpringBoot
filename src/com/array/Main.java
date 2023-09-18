package com.array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int choice, val;

        dynamicArrayMethods dam = new dynamicArrayMethods();
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("\n choose the option to perform op");
            System.out.println("1 - to insert data");
            System.out.println("2 - to display data");
            System.out.println("3 - to find specific data using index");

            choice = s.nextInt();

            switch (choice){
                case 1:
                    System.out.print("enter the value : ");
                    val = s.nextInt();
                    dam.insert(val);
                    break;
                case 2:
                    dam.display();
                    break;
                case 3:
                    System.out.println("enter the index number to find value");
                    val = s.nextInt();
                    dam.displaySpecificValue(val);
                    break;
                case 4:
                    System.out.println(dam.arr.length);
                    System.out.println(dam.size);
                    System.exit(0);
            }
        }
    }
}
