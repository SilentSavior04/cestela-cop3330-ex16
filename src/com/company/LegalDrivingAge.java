package com.company;
import java.util.Scanner;

public class LegalDrivingAge {
    public static void main(String[] args) {

        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you?");

        age = sc.nextInt();

        if (age >= 16)
            System.out.println("You age old enough to drive by yourself legally");
        else
            System.out.println("You are not old enough to drive by yourself legally");
    }
}