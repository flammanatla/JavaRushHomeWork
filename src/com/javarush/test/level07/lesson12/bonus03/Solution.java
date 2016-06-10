package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        //Напишите тут ваш код
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i ++) {
            int max = Integer.MIN_VALUE;
            int ind_max = -1;
            for (int j = 0; j < array.length; j++) {

                if (max < array[j]) {
                    max = array[j];
                    ind_max = j;
                }
            }
            sorted.add(max);
            array[ind_max] = Integer.MIN_VALUE;
        }
        for (int i = 0; i < array.length; i++){
            array[i] = sorted.get(i);
        }
    }
}
