package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        ArrayList list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < list.size(); i++){
            Object c = list.get(i);
            int last = list.size()-i - 1;
            list.set(i, list.get(last));
            list.set(last, c);
        }
        for (int i = list.size() - 1; i >= 0; i-- ){
            System.out.println(list.get(i));
        }
    }
}