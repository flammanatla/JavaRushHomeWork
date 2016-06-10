package com.javarush.test.level08.lesson08.task01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //Напишите тут ваш код

        String[] array = new String[]{"лира", "лоза", "луна", "луг", "лес", "личность", "лосось", "лузга", "ледник","лесовик", "лось","лотос","ласка","лепесток","лень", "лодка","лоджия","лори","луб","лента"};
        HashSet<String> set = new HashSet<String>(Arrays.asList(array));
        //set.addAll(array);
        return set;
    }
}
