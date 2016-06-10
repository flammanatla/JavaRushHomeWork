package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human granpa1 = new Human();
        Human granpa2 = new Human();
        Human granma1 = new Human();
        Human granma2 = new Human();
        Human dad = new Human();
        Human mom = new Human();
        Human c1 = new Human();
        Human c2 = new Human();
        Human c3 = new Human();
        Human[] family = {granpa1, granpa2, granma1, granma2, dad, mom, c1, c2, c3}; //new ArrayList<Human>();
        //family


        granpa1.name = "GP1";
        granpa1.age = 78;
        granpa1.sex = true;

        granpa2.name = "GP2";
        granpa2.age = 75;
        granpa2.sex = true;

        granma1.name = "GM1";
        granma1.age = 65;
        granma1.sex = false;

        granma2.name = "GM2";
        granma2.age = 68;
        granma2.sex = false;

        dad.name = "Dad";
        dad.age = 35;
        dad.sex = true;
        dad.father = granpa1;
        dad.mother = granma1;

        mom.name = "Mom";
        mom.age = 30;
        mom.sex = false;
        mom.father = granpa2;
        mom.mother = granma2;

        c1.name = "c1";
        c1.age = 5;
        c1.sex = true;
        c1.father = dad;
        c1.mother = mom;
        c2.name = "c2";
        c2.age = 10;
        c2.sex = true;
        c2.father = dad;
        c2.mother = mom;
        c3.name = "c1";
        c3.age = 9;
        c3.sex = false;
        c3.father = dad;
        c3.mother = mom;

        for (Human x : family) {
            System.out.println(x);
        }
    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
