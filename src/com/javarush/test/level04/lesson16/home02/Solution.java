package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        int C = Integer.parseInt(c);

        int min = Math.min(Math.min(A, B), C);
        int max = Math.max(Math.max(A, B), C);

        if (A != min && A != max){
            System.out.print(A);
        }
        else if (B != min && B != max){
            System.out.print(B);
        }
        else if (C != min & C != max){
            System.out.print(C);
        }
        /*if (A < B && B < C) {
            System.out.println(B);
        }
        else if (B < A && A < C){
            System.out.println(A);
        }
        else if (A < C && C < B) {
            System.out.println(C);
        }*/
    }
}
