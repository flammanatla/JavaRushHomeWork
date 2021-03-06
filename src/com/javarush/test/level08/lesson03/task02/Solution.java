package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель – клубень
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        String[] key = new String[]{"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};
        String[] value = new String[]{"ягода", "трава", "ягода", "фрукт", "овощ", "куст", "корень", "ягода","цветок", "клубень"};
        HashMap<String, String> set =  new HashMap<String, String>();
        for (int i = 0; i < key.length; i++){
            set.put(key[i], value[i]);
        }

        for (Map.Entry<String, String> pair : set.entrySet()){
            String _key = pair.getKey();
            String _value = pair.getValue();
            System.out.println(_key + " - " + _value);
        }

    }
}
