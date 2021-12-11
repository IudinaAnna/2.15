package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.println("x= ");
    int x=input.nextInt();
    System.out.println("y= ");
    int y=input.nextInt();
      System.out.println("check number"+"1.plus"+"2.minus"+"3.умножение"+"4.деление");
    int selection=input.nextInt();
        switch (selection) {
            case 1 -> {
                System.out.print("plus:");
                System.out.println((x + y));
            }
            case 2 -> {
                System.out.print("minus:");
                System.out.println(x - y);
            }
            case 3 -> {
                System.out.print("умножение");
                System.out.println(x * y);
            }
            case 4 -> {
                System.out.print("деление");
                if (y != 0) {
                    System.out.println(x / y);
                } else System.out.println("error");
            }
        }
    }
}
