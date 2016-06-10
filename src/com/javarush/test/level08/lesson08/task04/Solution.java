package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("С", new Date("APRIL 1 1980"));
        map.put("Ст", new Date("JANUARY 1 1980"));
        map.put("Ста", new Date("JULY 1 1980"));
        map.put("Стал", new Date("AUGUST 1 1980"));
        map.put("Сталл", new Date("SEPTEMBER 1 1980"));
        map.put("Сталло", new Date("NOVEMBER 1 1980"));
        map.put("Сталлон", new Date("MAY 1 1980"));
        map.put("Сталлоне1", new Date("MAY 1 1980"));
        map.put("Сталлоне2", new Date("JUNE 1 1980"));

        //Напишите тут ваш код
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //Напишите тут ваш код

        Iterator<Date> iterator = map.values().iterator();

        for (int i = 0; i < map.values().size(); i++) {
            while (iterator.hasNext()) {
                Date n = iterator.next();
                if(n.getMonth() == 5 || n.getMonth() == 6 || n.getMonth() == 7) {
                    iterator.remove();
                }
            }
        }
    }
}
