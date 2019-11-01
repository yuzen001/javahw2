package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("輸入年");
        int year = sc.nextInt();
        System.out.println("輸入月");
        int month = sc.nextInt();
        System.out.println("輸入日");
        int day = sc.nextInt();
        System.out.println(year+"/"+month+"/"+day);
    }
}
