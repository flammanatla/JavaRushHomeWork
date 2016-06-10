package com.javarush.test.level04.lesson13.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int i, count = 1;
        for (i = 0; i < 10; i++) {
            int j;
            for (j = 0; j < count; j++){
                System.out.print(8);
            }
            System.out.print("\n");
            count++;
        }
    }
}
