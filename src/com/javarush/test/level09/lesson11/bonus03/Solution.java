package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     /*  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]); */
        String[] array = new String[]{"Вишня", "1", "Боб", "-1", "Яблоко","2", "-6", "*рбуз"};
        sort(array);


        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) throws NullPointerException
    {
        //Напишите тут ваш код
        int[] num_array = new int[array.length];                   // separate words and nums
        int[] index = new int[array.length];
        String[] word_array = new String[array.length];
        for (int i = 0; i < array.length; i ++){
            if (isNumber(array[i]) == true){
                num_array[i] = Integer.parseInt(array[i]);
                word_array[i] = " ";
                index[i] = 0;                                 // remember item's place into origin array
            }
            else {
                word_array[i] = array[i];
                num_array[i] = Integer.MIN_VALUE;
                index[i] = 1;

            }
        }

        printArrayN(index);
        printArrayW(word_array);
        printArrayN(num_array);

        for (int j = 0; j < num_array.length; j++) {                // sort numbers array list
            int _index = -1;
            int maximum = num_array[j]; //Integer.MIN_VALUE;
            for (int i = j; i < num_array.length; i++) {
                if (maximum < num_array[i]) {
                    maximum = num_array[i]; // c = a; a = b; b = c;
                    _index = i;
                }
            }
            if (_index != -1) {                                     // swap if only element doesn't placed on right
                int c = num_array[j];
                num_array[j] = maximum;
                num_array[_index] = c;
            }
        }

        printArrayN(num_array);

        for (int j = 0; j < word_array.length; j++) {
            int _index = -1;
            String minimum = word_array[j]; //"я";
            for (int i = j; i < word_array.length; i++) {
                if (isGreaterThen(minimum, word_array[i])) {
                    minimum = word_array[i]; // c = a; a = b; b = c;
                    _index = i;
                }
            }
            if (_index != -1) {
                String c = word_array[j];
                word_array[j] = minimum;
                word_array[_index] = c;
            }
        }

        printArrayW(word_array);
        int j = 0;
        for (int i = 0; i < num_array.length; i++){                 // place numbers into original array
            if (index[i] == 0) {
                array[i] = Integer.toString(num_array[j]);
               j ++;
            }
        }
        j = 0;
        for (int i = 0;i < word_array.length; i++){                 // find index number where first word is placed
            if (word_array[i].equals(" ")){
                j ++;
            }
        }
        for (int i = 0; i < word_array.length; i++){                // place words into original array
            if (index[i] == 1) {
                array[i] = word_array[j];
                j++;
            }

        }
    }

    public static void printArrayN(int[] array){
        for (int x : array) {
            System.out.print(x + "|");
           // System.out.print();
        }
        System.out.println("---------");
    }
    public static void printArrayW(String[] array){
        for (String x : array) {
            System.out.print(x + "|");
        }
        System.out.println("---------");
    }
    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b) throws NullPointerException
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
