package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();

        int N1 = Integer.parseInt(n1);
        int N2 = Integer.parseInt(n2);
        int N3 = Integer.parseInt(n3);

        if (N1>N2 && N1>N3){
            System.out.print(N1 + " ");
            if (N2>N3){
                System.out.print(N2 + " " + N3);
            }
            else {
                System.out.print(N3 + " " +  N2);
            }
        }
        else if (N2>N3 && N2>N1) {
            System.out.print(N2 + " ");
            if (N1>N3) {
                System.out.print(N1 + " " +  N3);
            }
            else {
                System.out.print(N3 + " " + N1);
            }
        }
        else if (N3>N1 && N3>N2){
            System.out.print(N3 + " ");
            if (N1>N2){
                System.out.print(N1 + " " + N2);
            }
            else {
                System.out.print(N2 + " " + N1);
            }
    }
    }
}
