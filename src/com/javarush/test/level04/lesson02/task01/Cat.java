package com.javarush.test.level04.lesson02.task01;

/* Реализовать метод setName
Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String name равное переданному параметру String name.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cat {
    private String name;

    public void setName(String mname) {
        //add your code here
      //  BufferedReader reader = new BufferedReader(InputStreamReader(System.in));
        //String name = reader.readLine();
        name = mname;
    }
}
