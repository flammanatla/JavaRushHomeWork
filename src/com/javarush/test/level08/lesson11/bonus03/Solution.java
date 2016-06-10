package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //Напишите тут ваш код
       /* for (int i = 0; i < array.length; i++){
            for (int j = i; j < array.length - 1; j++ ) {
                String a = array[j + 1];
                String b = array[j];
                while ( isGreaterThen(a, b) ){
                    String c = b;
                    array[j + 1] = c;
                    array[j] = a;
                }
            }
        }*/

        int index =0;
        for (int j = 0; j < array.length; j++) {
            String minimum = "z";
            for (int i = j; i < array.length; i++) {
                if (isGreaterThen(minimum, array[i])) {
                    minimum = array[i]; // c = a; a = b; b = c;
                    index = i;
                }
            }
            String c = array[j];
            array[j] = minimum;
            array[index] = c;
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
