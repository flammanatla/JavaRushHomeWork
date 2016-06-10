package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String n4 = reader.readLine();
        int N1 = Integer.parseInt(n1);
        int N2 = Integer.parseInt(n2);
        int N3 = Integer.parseInt(n3);
        int N4 = Integer.parseInt(n4);

        int max12, max34;
        if (N1<N2){
            max12 = N2;
        }
        else {
            max12 = N1;
        }

        if (N3<N4){
            max34 = N4;
        }
        else{
            max34=N3;
        }

        if (max34<max12){
            System.out.println(max12);
        }
        else {
            System.out.println(max34);
        }

    }
}
