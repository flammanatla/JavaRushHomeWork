package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int[] array20 = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++){
            array20[i] = Integer.parseInt(reader.readLine());
        }
        for (int j = 0; j < 10; j++) {
            array1[j] = array20[j];
        }
        for (int j = 10; j < 20; j++ ){
            array2[j-10] = array20[j];
                System.out.println(array2[j-10]);
        }
    }

}
