package ru.javafortesters.competitions;

public class ConsoleOutputProvider implements IOutputProvider{
    //Вывод информации в консоль
    public void print(String message) {
        System.out.println(message);
    }
}
