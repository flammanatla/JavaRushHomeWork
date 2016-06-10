package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<Integer>();
        int max;
        for (int i = 0; i <5; i++){
            int number = Integer.parseInt(reader.readLine());
            array.add(number);
        }

        for (int i = 0; i < 5; i++) {
            int minimum = array.get(0), min_index = 0;
            for (int j = 1; j < array.size(); j++){

                if (array.get(j) < minimum){
                    minimum = array.get(j);
                    min_index = j;
                }
            }
            array.remove(min_index);
            System.out.println(minimum);
        }
    }
}
