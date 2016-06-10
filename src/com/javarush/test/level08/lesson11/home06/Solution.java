package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
      //  Human gp1 = new Human("gp1", true, 67, "f");
        Human granpa1 = new Human();
        Human granpa2 = new Human();
        Human granma1 = new Human();
        Human granma2 = new Human();
        Human dad = new Human();
        Human mom = new Human();
        Human c1 = new Human();
        Human c2 = new Human();
        Human c3 = new Human();
        Human[] family = {granpa1, granpa2, granma1, granma2, dad, mom, c1, c2, c3};
        ArrayList<Human> g1 = new ArrayList<Human>();
        g1.add(dad);
        ArrayList<Human> g2 = new ArrayList<Human>();
        g2.add(mom);
        ArrayList<Human> p = new ArrayList<Human>();
        p.add(c1);
        p.add(c2);
        p.add(c3);

        //family


        granpa1.name = "GP1";
        granpa1.age = 78;
        granpa1.sex = true;
        granpa1.children = g1;

        granpa2.name = "GP2";
        granpa2.age = 75;
        granpa2.sex = true;
        granpa2.children = g2;

        granma1.name = "GM1";
        granma1.age = 65;
        granma1.sex = false;
        granma1.children = g1;

        granma2.name = "GM2";
        granma2.age = 68;
        granma2.sex = false;
        granma2.children = g2;


        dad.name = "Dad";
        dad.age = 35;
        dad.sex = true;
        dad.children = p;

        mom.name = "Mom";
        mom.age = 30;
        mom.sex = false;
        mom.children = p;

        c1.name = "c1";
        c1.age = 5;
        c1.sex = true;
        c2.name = "c2";
        c2.age = 10;
        c2.sex = true;
        c3.name = "c1";
        c3.age = 9;
        c3.sex = false;


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
        ArrayList<Human> children = new ArrayList<Human>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
