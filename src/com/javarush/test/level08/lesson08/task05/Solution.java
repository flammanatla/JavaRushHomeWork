package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    /*public static void main (String[] args) {

        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair : map.entrySet()){
            System.out.print(pair + " ");
        }

    }*/
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        String[] surname = new String[]{"s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10"};
        String[] name = new String[]{"n1", "n2", "n3", "n4", "n1", "n6", "n2", "n3", "n9", "n10"};
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < surname.length; i ++){
            map.put(surname[i], name[i]);
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //Напишите тут ваш код
        HashSet<String> dupl = new HashSet<String>();
        for (Map.Entry<String, String> pair : map.entrySet()){
            String name = pair.getValue();
            for (Map.Entry<String, String> pair2: map.entrySet())
            {
                if (pair2.getValue().equals(name) && !(pair2.getKey().equals(pair.getKey()))) {
                    dupl.add(name);
                    break;
                }
            }
        }
        for (String x : dupl){
            removeItemFromMapByValue(map, x);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
