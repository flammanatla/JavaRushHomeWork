package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws ParseException {
        String input = "01 1 1987";
        System.out.print(isDateOdd(input));
    }

    public static boolean isDateOdd(String m_date) throws ParseException {

        SimpleDateFormat sd = new SimpleDateFormat("mm dd yyyy");
        Date date = sd.parse(m_date);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int[] array = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31,30, 31, 30,31};
       // int month = date.getMonth();
        int month = cal.get(Calendar.MONTH);//date.getMonth();
        int days = cal.get(Calendar.DAY_OF_MONTH);//date.getDate();
        for (int i = 0; i <= month; i++){
            days += array[i];
            if ((cal.get(Calendar.YEAR)%4 == 0) && (month > 1)){ //leap year
                days += 1;
            }
        }
        if (days % 2 == 1) {
            return true;
        }
        else { return false;}
    }
}
