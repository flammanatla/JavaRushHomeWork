package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //Напишите тут ваш код
        String newString = new String();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (i == 0) {
                newString += Character.toString(c).toUpperCase();
            }
            else newString += c;
            if ((Character.toString(c).equals(" "))&&(i<(s.length()-1))){
                if (!Character.toString(s.charAt(i+1)).equals(" ")) {
                    i++;
                    newString += Character.toString(s.charAt(i)).toUpperCase();
                }
            }
        }

        System.out.print(newString);
    }


}
