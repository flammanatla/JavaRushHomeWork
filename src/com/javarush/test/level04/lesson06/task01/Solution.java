package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код

        /* данные для тестирования:
        введите 1 и 2, минимум =  1
        введите 2 и 1, минимум =  1
        введите 1 и 1, минимум =  1
        введите -1 и -2, минимум =  -2
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n1 = reader.readLine();
        String n2 = reader.readLine();
        int N1 = Integer.parseInt(n1);
        int N2 = Integer.parseInt(n2);

        if (N1<N2){
            System.out.println(N1);
        }
        else {
            System.out.println(N2);
        }
    }
}