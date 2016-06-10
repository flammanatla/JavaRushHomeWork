package com.javarush.test.level09.lesson08.task05;

/* Перехват unchecked исключений
В методе processExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..
*/

public class Solution
{
    public static void main(String[] args) throws NullPointerException{
        processExceptions(new Solution());
        //catch (NullPointerException e) {throw e;}
    }

    public static void processExceptions(Solution obj) throws NullPointerException {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (RuntimeException e) {printStack(e);}
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1(){
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
