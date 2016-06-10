package com.javarush.test.level03.lesson06.task03;

/* Семь цветов радуги
Выведи на экран текст - семь цветов радуги.
В каждой строке должно быть по три цвета, в последней - один.
Цвета в строках разделяй пробелом.
Запомни: буквы Ё в тестах нигде нет.
Чтобы тесты проходили правильно, во всех задачах заменяй Ё на Е.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        String red = "красный";
        String orange = "оранжевый";
        String yellow = "желтый";
        String green = "зеленый";
        String cyan = "голубой";
        String blue ="синий";
        String violet = "фиолетовый";

        System.out.println(red + " " + orange + " " + yellow);
        System.out.println(green + " " + cyan + " " + blue);
        System.out.println(violet+ " ");
    }
}