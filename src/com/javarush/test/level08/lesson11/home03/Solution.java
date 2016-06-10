package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        //Напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        String[] name = new String[]{"n1", "n2", "n3", "n4", "n1", "n2", "n3", "n4", "n1", "n2"};
        String[] sname = new String[]{"s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s1"};
        for (int i = 0; i < name.length; i ++){
            map.put(sname[i], name[i]);
        }

        return map;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
