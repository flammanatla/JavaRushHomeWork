package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        //String[] month = new String[]{"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        SimpleDateFormat old_format = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat new_format = new SimpleDateFormat("MMM dd, yyyy");
        Date old_date = old_format.parse(input);
        System.out.println(new_format.format(old_date).toUpperCase());

       /* Calendar cal = Calendar.getInstance();
        cal.setTime(old_date);

        System.out.print(month[cal.get(Calendar.MONTH)]+ " " +
                         cal.get(Calendar.DAY_OF_MONTH) + ", " +
                         cal.get(Calendar.YEAR));
                         */
    }
}
