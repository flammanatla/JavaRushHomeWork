package com.javarush.test.level08.lesson08.task02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //Напишите тут ваш код
        Integer[] nums = new Integer[]{1, 3, 6, 9, 89, 56,4,2,-9,10,11,23,111,19,7,8,0,29,78,43};
        HashSet<Integer> setNum = new HashSet<Integer>(Arrays.asList(nums));
        return setNum; //removeAllNumbersMoreThan10(setNum);

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //Напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            while (iterator.hasNext()) {
                int num = iterator.next();
                if(num >10) {
                    iterator.remove();
                }
            }
        }
        return set;
    }
}
