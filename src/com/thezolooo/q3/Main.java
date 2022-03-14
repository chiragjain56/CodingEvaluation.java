package com.thezolooo.q3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        String[] array = value.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[0]);
        int i = Integer.parseInt(array[0]);
        System.out.println(a);
        int s = 0;
        while(a<b){
            s += a;
             a= a+2;
            System.out.print(s + " ");
        }
    }
}
