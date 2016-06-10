package com.javarush.test.level08.lesson08.task03;

import java.util.*;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        String[] sname = new String[]{"doe", "smith", "fee", "linch", "clooney", "pitt", "jolie", "chou", "crowley", "fendi"};
        String[] name = new String[]{"john", "marie", "katie", "sam", "angie", "harry", "rone", "kesha","marie", "misha"};
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < sname.length; i++){
            map.put(sname[i], name[i]);
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        int count = 0;
        Iterator<String> iterator = map.values().iterator();
        for (int i = 0; i < map.values().size(); i++) {
            while (iterator.hasNext()) {
                String n = iterator.next();
                if(n.equals(name)) {
                    count ++;
                }
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код
        if (map.containsKey(familiya)) {
            return 1;
        }
        else { return 0;}

    }
}
