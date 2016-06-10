package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);

        //Напишите тут ваш код
        Cat tomCat = new Cat("Tom", "grey", "m");
        Cat kittyCat = new Cat("Kitty", "white", "f");

        Dog dog = new Dog("Bob", 12, 9);
    }

    public static class Mouse
    {
        String name;
        int height, tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //Напишите тут ваши классы
    public static class Cat
    {
        String name, color, sex;

        public Cat(String name, String color, String sex)
        {
            this.name = name;
            this.color = color;
            this.sex = sex;
        }
    }

    public static class Dog
    {
        String name;
        int weight, size;

        public Dog(String name, int weight, int size)
        {
            this.name = name;
            this.weight = weight;
            this.size = size;
        }
    }



}
